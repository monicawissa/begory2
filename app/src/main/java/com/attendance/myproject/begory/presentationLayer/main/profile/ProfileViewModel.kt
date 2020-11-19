package com.attendance.myproject.begory.presentationLayer.main.profile
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
import com.attendance.myproject.begory.Utilities.ggle.Event
import com.attendance.myproject.begory.data.Models.Level
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.source.AppRepository
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource
import com.attendance.myproject.begory.presentationLayer.splash.SplashViewModel


class ProfileViewModel  @ViewModelInject constructor(private val appRepository: AppRepository,
                                                          @Assisted private val savedStateHandle: SavedStateHandle
) :
        ViewModel() ,LifecycleObserver {
    var usertmp:User= User()
    var name: String = ""
    var mobile: String =  ""
    var mobile2: String = ""
    var password: String =  ""
    var address: String =  ""
    var balanceBegory:String =""
    var balanceEqlomat:String =""
    var studentLevel: FirebaseFilterType.LevelFilterType? = null
    //var mTitleTV = savedStateHandle.getLiveData<String>("settingType").value
    var selectedData:String=""


    //clickable of button
    private val _isBtnAvailable = MutableLiveData<Boolean>()
    val isBtnAvailable: LiveData<Boolean>
        get() = _isBtnAvailable
    //to open main
    private val _isopenLogin = MutableLiveData<Boolean>()
    val isopenLogin: LiveData<Boolean>
        get() = _isopenLogin
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
        _isBtnAvailable.value = true
        getUser()
    }

    private fun getUser() {
        appRepository.getUserLastUpdate(object:IRemoteDataSource.LoginCallback{
            override fun onResponse(user: User) {
                name=usertmp.name!!
                mobile=usertmp.mobile!!
                mobile2=usertmp.mobile2!!
                balanceBegory=usertmp.balanceBegory.toString()
                balanceEqlomat=usertmp.balanceEqlomat.toString()
                password=usertmp.password!!
                address=usertmp.address!!
                studentLevel=usertmp.studentLevel!!
            }

            override fun onDataNotAvailable(message: Int?) {
            }

        })

    }


    private fun isDataValid(): Boolean {
        // validate
        Log.d(ContentValues.TAG, "showMessage: isDataValid")
        if (password.isEmpty()) {
            Log.d(ContentValues.TAG, "showMessage: PasswordValid")
            showSnackbarMessage(R.string.fill__password)
            return false
        }
        return true
    }


    fun update() {
        _dataLoading.value = true
        _isBtnAvailable.value=false
            if (isDataValid()) {
                usertmp.name=name
                usertmp.mobile=mobile
                usertmp.mobile2=mobile2
                usertmp.password=password
                usertmp.mobile_password="$mobile ${usertmp.password}"
                usertmp.address=address
                usertmp.studentLevel=studentLevel
                appRepository.updateStudent(usertmp, object : IRemoteDataSource.MessageCallback {
                    override fun onResponse(message: Int?) {
                        showSnackbarMessage(message!!)
                        _dataLoading.value = false
                        _isBtnAvailable.value = true
                    }

                    override fun onDataNotAvailable(message: Int?) {
                        showSnackbarMessage(message!!)
                        _dataLoading.value = false
                        _isBtnAvailable.value = true
                    }

                })
            } else _dataLoading.value = false

    }
    fun logout() {
        _dataLoading.value = true
        _isBtnAvailable.value=false

            appRepository.setUserAsLoggedOut()
            _isopenLogin.value=true
        _dataLoading.value=false
    }
}
