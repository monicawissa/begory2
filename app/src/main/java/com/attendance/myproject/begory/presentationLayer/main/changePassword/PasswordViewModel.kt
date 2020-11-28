package com.attendance.myproject.begory.presentationLayer.main.changePassword
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


class PasswordViewModel  @ViewModelInject constructor(private val appRepository: AppRepository,
                                                      @Assisted private val savedStateHandle: SavedStateHandle
) :
        ViewModel() ,LifecycleObserver {
    var password: String = ""
    var mTitleTV = "تغيير الرقم السري"

    //Btn Update Available
    private val _isUpdateBtnAvailable = MutableLiveData<Boolean>()
    val isUpdateBtnAvailable: LiveData<Boolean>
        get() = _isUpdateBtnAvailable

    //progressbar
    private val _dataLoading = MutableLiveData<Boolean>()
    val dataLoading: LiveData<Boolean>
        get() = _dataLoading
    private val _ishideKeyboard = MutableLiveData<Boolean>()
    val ishideKeyboard: LiveData<Boolean>
        get() = _ishideKeyboard
    //openMain
    private val _isOpenMain = MutableLiveData<Boolean>()
    val isOpenMain: LiveData<Boolean>
        get() = _isOpenMain

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
        _isUpdateBtnAvailable.value=true
        _isOpenMain.value=false
    }


    private fun ismobileValid(): Boolean {
        // validate
        Log.d(ContentValues.TAG, "showMessage: isDataValid")

        if (TextUtils.isEmpty(password) || password.length >8) {

            showSnackbarMessage(R.string.fill_fixedPassword)
            return false
        }
        return true
    }

    fun update(){
        _ishideKeyboard.value = true
        _dataLoading.value = true
        if (ismobileValid()) {
            appRepository.updatePassword(password, object : IRemoteDataSource.MessageCallback {
                override fun onResponse(message: Int?) {
                    showSnackbarMessage(message!!)
                    _isUpdateBtnAvailable.value = false
                    _dataLoading.value = false
                    _isOpenMain.value=true

                }

                override fun onDataNotAvailable(message: Int?) {
                    showSnackbarMessage(message!!)
                    _isUpdateBtnAvailable.value = true
                    _dataLoading.value = false
                }
            })
        } else _dataLoading.value = false
    }

}
