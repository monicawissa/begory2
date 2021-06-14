package com.attendance.myproject.begory.presentationLayer.main.setting.addBonus
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


class AddBonusViewModel  @ViewModelInject constructor(private val appRepository: AppRepository,
                                                             @Assisted private val savedStateHandle: SavedStateHandle
) :
        ViewModel() ,LifecycleObserver {
    var _mStudentList: ArrayList<UserBooked> = ArrayList()
    //mark that
    var mListLast: ArrayList<User> = ArrayList()
    private val _mStudentAttendancesList= MutableLiveData<Boolean>()
    val mStudentAttendancesList: LiveData<Boolean>
        get() = _mStudentAttendancesList

      var studentLevel: FirebaseFilterType.LevelFilterType? = null


    var mTitleTV = savedStateHandle.getLiveData<String>("settingType").value
    val spinnerListener = object : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(parent: AdapterView<*>?) {

        }

        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            var levelId= FirebaseFilterType.fbConvert(((parent!!.getItemAtPosition(position)) as Level).levelId!!)
            if(levelId!=FirebaseFilterType.LevelFilterType.no){
                studentLevel = levelId
                mListLast.clear()
                _mStudentList.clear()
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
                mListLast.addAll(user)
                _mStudentAttendancesList.value=true
                for (i in user){
                    _mStudentList.add(UserBooked(i.id,i.name,i.price,i.realPrice))
                }
//                var u=ArrayList<User>()
//                u.addAll(user)
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
    fun btnadd()
    {   _dataLoading.value = true
        var y=0;
        for (i in mListLast){

            if(_mStudentList[y].price!=i.price){
                appRepository.updateStudent(i!!,object :IRemoteDataSource.MessageCallback{
                    override fun onResponse(message: Int?) {
                        showSnackbarMessage(message!!)
                        if(y==(mListLast.size))_dataLoading.value = false
                    }

                    override fun onDataNotAvailable(message: Int?) {
                        showSnackbarMessage(message!!)
                        if(y==(mListLast.size))_dataLoading.value = false
                    }

                })
            }
            y++
        }
    }

}
