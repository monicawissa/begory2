package com.attendance.myproject.begory.presentationLayer.main.setting.userExist
import android.content.ContentValues
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.AdapterView
import androidx.annotation.StringRes
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.androidbuts.multispinnerfilter.KeyPairBoolData
import com.androidbuts.multispinnerfilter.MultiSpinnerListener
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.Utilities.ggle.Event
import com.attendance.myproject.begory.data.Models.Level
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.source.AppRepository
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource
import com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla.AddBlaBlaActivity


class UserViewModel  @ViewModelInject constructor(private val appRepository: AppRepository,
                                                       @Assisted private val savedStateHandle: SavedStateHandle
) :
        ViewModel() ,LifecycleObserver {
    lateinit var usertmp:User
    var mobile: String = ""
    var mTitleTV = savedStateHandle.getLiveData<String>("settingType").value

    //Btn check Available
    private val _isCheckBtnAvailable = MutableLiveData<Boolean>()
    val isCheckBtnAvailable: LiveData<Boolean>
        get() = _isCheckBtnAvailable
    //Check Status
    private val _isCheckStatus = MutableLiveData<Boolean>()
    val isCheckStatus: LiveData<Boolean>
        get() = _isCheckStatus
    //visibility student spinner
    private val _isStudentAvailable = MutableLiveData<Boolean>()
    val isStudentAvailable: LiveData<Boolean>
        get() = _isStudentAvailable

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
        _isStudentAvailable.value = (mTitleTV.equals("تعديل مخدوم"))
        _isCheckBtnAvailable.value=true
    }


    private fun ismobileValid(): Boolean {
        // validate
        Log.d(ContentValues.TAG, "showMessage: isDataValid")

        if (TextUtils.isEmpty(mobile) || mobile.length != 11) {
            Log.d(ContentValues.TAG, "showMessage: ismobile" + mobile.length)

            showSnackbarMessage(R.string.fill_mobiledata)
            return false
        }
        return true
    }

    fun check(){
        _ishideKeyboard.value = true
        _dataLoading.value = true
        if (ismobileValid()) {
            appRepository.getUserbyLevel(object : IRemoteDataSource.LoginCallback {
                override fun onResponse(user: User) {
                    _isCheckBtnAvailable.value = false
                    _dataLoading.value = false
                    usertmp=user
                    mobile=user.mobile!!
                    _isCheckStatus.value=true

                }

                override fun onDataNotAvailable(message: Int?) {
                    showSnackbarMessage(message!!)
                    _isCheckBtnAvailable.value = true
                    _dataLoading.value = false
                }

            })
        } else _dataLoading.value = false


    }

}
