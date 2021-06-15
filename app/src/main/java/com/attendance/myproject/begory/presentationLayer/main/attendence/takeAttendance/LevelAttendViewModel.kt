package com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance
import androidx.annotation.StringRes
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.attendance.myproject.begory.Utilities.ggle.Event
import com.attendance.myproject.begory.data.Models.Attendance
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.source.AppRepository
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource
import kotlin.collections.ArrayList


class LevelAttendViewModel  @ViewModelInject constructor(private val appRepository: AppRepository,
                                                         @Assisted private val savedStateHandle: SavedStateHandle
) :
        ViewModel() ,LifecycleObserver {
    var mStudentList: ArrayList<User> = ArrayList<User>()
    var mListLast: ArrayList<Attendance> = ArrayList()
    var mSelectedDate:String=""
//    var mSelectedTermId:Int=0
    private val _mStudentAttendancesList= MutableLiveData<Boolean>()
    val mStudentAttendancesList: LiveData<Boolean>
        get() = _mStudentAttendancesList

    var mTitleTV = savedStateHandle.getLiveData<Int>("settingType").value

    //Btn check Available
    private val _isCheckBtnAvailable = MutableLiveData<Boolean>()
    val isCheckBtnAvailable: LiveData<Boolean>
        get() = _isCheckBtnAvailable
    //progressbar
    private val _dataLoading = MutableLiveData<Boolean>()
    val dataLoading: LiveData<Boolean>
        get() = _dataLoading
    private val _ishideKeyboard = MutableLiveData<Boolean>()
    val ishideKeyboard: LiveData<Boolean>
        get() = _ishideKeyboard

    private val msnackbarText = MutableLiveData<Event<Int>>()
    val snackbarMessage: LiveData<Event<Int>>
        get() = msnackbarText
    private val msnackbarText2 = MutableLiveData<String>()
    val snackbarMessage2: LiveData<String>
        get() = msnackbarText2

    private fun showSnackbarMessage(@StringRes message: Int) {
        msnackbarText.value = Event(message)
    }

    private fun showSnackbarMessage2(message: String) {
        msnackbarText2.value = message
    }

    init {
        _ishideKeyboard.value = false
       // _isStudentAvailable.value = (mTitleTV.equals("تعديل مخدوم"))
        _isCheckBtnAvailable.value=true
        _mStudentAttendancesList.value=false
    }

    fun getStudentList() {
        _dataLoading.value = true
        _isCheckBtnAvailable.value=false
        appRepository.filterLevel(""+FirebaseFilterType.fbConvert(mTitleTV!!), object : IRemoteDataSource.UsersCallback {
            override fun onResponse(users: List<User>) {

                mStudentList.addAll(users)
                manageStudentWithAttendance()
                _dataLoading.value = false
                _isCheckBtnAvailable.value = true

            }

            override fun onDataNotAvailable(message: Int?) {
                showSnackbarMessage(message!!)
                _dataLoading.value = false
                _isCheckBtnAvailable.value = true

            }
        })
    }

    var mList: ArrayList<Attendance> = ArrayList()
    private fun manageStudentWithAttendance() {
        for (i in mStudentList.indices) {
            if (mStudentList[i].listOfAttendence == null || mStudentList[i].listOfAttendence!!.isEmpty()) {
                setEmptyAttendance(i)
            } else {
                var found = false
                for (n in mStudentList[i].listOfAttendence!!) {
                    if (mSelectedDate == n.value.date) {
                        found = true
                        mList.add(n.value)
                        break
                    }
                }
                if (!found) {
                    setEmptyAttendance(i)
                }
            }
        }
        mListLast!!.clear()
        mListLast!!.addAll(mList)
        _mStudentAttendancesList.value=true
    }

    private fun setEmptyAttendance(i: Int) {
        val studentWithAttendance = Attendance(
                id = mStudentList[i].id!!, name = mStudentList[i].name!!, date = mSelectedDate, isAttend = false,
                isShamas = false, isA3traf = false, iskodas = false, isTnawel = false
        )
        mList.add(studentWithAttendance)
    }


    fun btnadd(){
        _ishideKeyboard.value = true
        _dataLoading.value = true
        _isCheckBtnAvailable.value = false
        appRepository.updateAttendance(mListLast, object : IRemoteDataSource.MessageCallback {
            override fun onResponse(message: Int?) {
                showSnackbarMessage(message!!)
                _isCheckBtnAvailable.value = true
                _dataLoading.value = false
            }

            override fun onDataNotAvailable(message: Int?) {
                showSnackbarMessage(message!!)
                _isCheckBtnAvailable.value = true
                _dataLoading.value = false
            }

        })

    }


}
