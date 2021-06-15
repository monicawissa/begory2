package com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked
import android.view.View
import android.widget.AdapterView
import androidx.annotation.StringRes
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.attendance.myproject.begory.Utilities.ggle.Event
import com.attendance.myproject.begory.data.Models.Level
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.Models.UserBooked
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.source.AppRepository
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource


class ShowGiftBookedViewModel  @ViewModelInject constructor(private val appRepository: AppRepository,
                                                             @Assisted private val savedStateHandle: SavedStateHandle
) :
        ViewModel() ,LifecycleObserver {
    var mStudentList: ArrayList<User> = ArrayList<User>()
    //mark that
    var mListLast: ArrayList<UserBooked> = ArrayList()
    private val _mStudentAttendancesList= MutableLiveData<Boolean>()
    val mStudentAttendancesList: LiveData<Boolean>
        get() = _mStudentAttendancesList

      var studentLevel: String? = null


    var mTitleTV = savedStateHandle.getLiveData<String>("settingType").value
    val spinnerListener = object : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(parent: AdapterView<*>?) {

        }

        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            var levelId= FirebaseFilterType.fbConvert(((parent!!.getItemAtPosition(position)) as Level).levelId!!)
            if(levelId!=FirebaseFilterType.LevelFilterType.no){
                studentLevel += levelId
                mListLast.clear()
                mStudentList.clear()
                getStudentList()
            }
        }
    }

    //    //Btn check Available
//    private val _isCheckBtnAvailable = MutableLiveData<Boolean>()
//    val isCheckBtnAvailable: LiveData<Boolean>
//        get() = _isCheckBtnAvailable

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
//        _isCheckBtnAvailable.value=true
        _mStudentAttendancesList.value=false
    }

    fun getStudentList() {
        _dataLoading.value = true
//        _isCheckBtnAvailable.value=false
        appRepository.filterLevel(studentLevel!!, object : IRemoteDataSource.UsersCallback {
            override fun onResponse(user: List<User>) {
                mStudentList.addAll(user)
                var u=ArrayList<User>()
                u.addAll(user)
                manageStudentWithAttendance(u)
                _dataLoading.value = false
//                _isCheckBtnAvailable.value = true

            }

            override fun onDataNotAvailable(message: Int?) {
                showSnackbarMessage(message!!)
                _dataLoading.value = false
//                _isCheckBtnAvailable.value = true

            }
        })

    }

    private fun manageStudentWithAttendance(users: ArrayList<User>) {
        var mList: ArrayList<UserBooked> = ArrayList()
        if (users.size>0) {
            for (student in users)
            {
                var bookedItems = ""
                if (student.selectedGifts!=null) {
                    bookedItems = "\n"
                    for (prize in student.selectedGifts!!)
                        bookedItems += prize.name + " ( " + prize.price + " )" + "\n"
                }

                if (!bookedItems.equals("")) {
                    student.name = StringBuilder().append(student.name).append("\n").append(bookedItems).toString()
                    student.name = student.name!!.substring(0, student.name!!.length-1)
                }
            }
            for (i in users.indices) {
                val userBooked = UserBooked()
                userBooked.id=(users[i].id)
                userBooked.name=(users[i].name)
                userBooked.realPrice=(users[i].realPrice)
                userBooked.price=(users[i].price)

                mList.add(userBooked)
            }
            mList.sortWith((compareByDescending({ it.realPrice })))
            manageTopStudents(mList)
        }
        mListLast.clear()
        mListLast.addAll(mList)
        _mStudentAttendancesList.value=true
    }
    fun manageTopStudents(studentsList: ArrayList<UserBooked>)
    {
        var mTopScore = 0.0
        var mTopCount = 1

        mTopScore = studentsList.get(0).realPrice!!
        studentsList.get(0).top = mTopCount


        for (student in studentsList)
        {
            if (student.realPrice == mTopScore)
            {
                student.top = mTopCount
            }
            else
            {
                mTopCount ++
                student.top = mTopCount
                mTopScore = student.realPrice!!
            }
        }
    }
}
