package com.attendance.myproject.begory.presentationLayer.login
import android.content.ContentValues
import android.text.TextUtils
import android.util.Log
import androidx.annotation.StringRes
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.ggle.Event
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.source.AppRepository
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource

class LoginViewModel  @ViewModelInject constructor(private val appRepository: AppRepository) :
        ViewModel() {

    var mobile:String = ""
    var password :String=""
    //clickable of button
    private val _isDataAvailable = MutableLiveData<Boolean>()
    val isDataAvailable: LiveData<Boolean>
        get() = _isDataAvailable
    //progressbar
    private val _dataLoading = MutableLiveData<Boolean>()
    val dataLoading: LiveData<Boolean>
        get() = _dataLoading

    //to open main
    private val _isopenMain = MutableLiveData<Boolean>()
    val isopenMain: LiveData<Boolean>
        get() = _isopenMain
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
        _isopenMain.value=false
        _ishideKeyboard.value=false
        _isDataAvailable.value=true
    }
    private fun ismobileAndPasswordValid(): Boolean {
        // validate email and password
        Log.d(ContentValues.TAG, "showMessage: ismobileAndPasswordValid")

        if (TextUtils.isEmpty(mobile)||mobile.length!=11) {
            Log.d(ContentValues.TAG, "showMessage: ismobile" + mobile.length)

            showSnackbarMessage(R.string.fill_mobiledata)
            return false
        }
        if( TextUtils.isEmpty(password)){
            Log.d(ContentValues.TAG, "showMessage: PasswordValid")
            showSnackbarMessage(R.string.fill_passworddata)
            return false
        }
        return true
    }
    fun login(){
        _ishideKeyboard.value=true
        _dataLoading.value=true
        if(ismobileAndPasswordValid()){
            appRepository.login(mobile, password, object : IRemoteDataSource.LoginCallback {
                override fun onResponse(user: User) {
                    showSnackbarMessage2("Welcome " + user.name)
                    _isDataAvailable.value = false
                    _dataLoading.value = false
                    _isopenMain.value = true

                }

                override fun onDataNotAvailable(message: Int?) {
                    showSnackbarMessage(message!!)
                    _isDataAvailable.value = true
                    _dataLoading.value = false
                }

            })
        }
        else  _dataLoading.value = false
    }
}
