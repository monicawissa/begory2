package com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla
import android.content.ContentValues
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.AdapterView
import androidx.annotation.StringRes
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.ggle.Event
import com.attendance.myproject.begory.data.Models.Level
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.source.AppRepository
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource


class AddBlaBlaViewModel  @ViewModelInject constructor(private val appRepository: AppRepository) :
        ViewModel() {
    var name: String = ""
    var mobile: String = ""
    var mobile2: String = ""
    var address: String = ""
    var isshamas: Boolean = false
    var studentLevel: FirebaseFilterType.LevelFilterType? = null
    var adminLevel: String? = ""
    var subAdminLevel: String? = ""
    var mTitleTV :String=""
    var selectedItems: String? = null
    val spinnerListener = object : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(parent: AdapterView<*>?) {

        }

        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            studentLevel = FirebaseFilterType.fbConvert(
                    ((parent!!.getItemAtPosition(position)) as Level).levelId!!
            )

        }
    }


    //clickable of button
    private val _isBtnAvailable = MutableLiveData<Boolean>()
    val isBtnAvailable: LiveData<Boolean>
        get() = _isBtnAvailable

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
        _isBtnAvailable.value = true
        _isStudentAvailable.value=(mTitleTV == "إضافة مخدوم")
    }


    private fun isDataValid(): Boolean {
        // validate
        Log.d(ContentValues.TAG, "showMessage: isDataValid")

        if (TextUtils.isEmpty(mobile) || mobile.length != 11) {
            Log.d(ContentValues.TAG, "showMessage: ismobile" + mobile.length)

            showSnackbarMessage(R.string.fill_mobiledata)
            return false
        }
        if (TextUtils.isEmpty(name) || (mTitleTV == "إضافة مخدوم" && studentLevel == null)) {
            Log.d(ContentValues.TAG, "showMessage: PasswordValid")
            showSnackbarMessage(R.string.fill_name_level)
            return false
        }
        return true
    }
    private fun isDataValidAdminOrSubAdmin(): Boolean {
        // validate
        Log.d(ContentValues.TAG, "showMessage: isDataValid")

        if (TextUtils.isEmpty(mobile) || mobile.length != 11) {
            Log.d(ContentValues.TAG, "showMessage: ismobile" + mobile.length)

            showSnackbarMessage(R.string.fill_mobiledata)
            return false
        }
        if ( (mTitleTV != "إضافة مخدوم" && selectedItems == null)) {
            Log.d(ContentValues.TAG, "showMessage: PasswordValid")
            showSnackbarMessage(R.string.fill__level)
            return false
        }
        return true
    }
    fun register() {
        _ishideKeyboard.value = true
        _dataLoading.value = true
        when(mTitleTV){
            "إضافة مخدوم"->{
                if (isDataValid()) {
                    if( mTitleTV == "إضافة خادم") subAdminLevel=  selectedItems
                    if( mTitleTV == "إضافة امين خدمة") adminLevel=  selectedItems
                    var user: User = User(name = name, mobile = mobile,
                            mobile2 = mobile2, password = mobile,
                            mobile_password = "$mobile $mobile", address = address,
                            isShamas = isshamas, studentLevel = studentLevel, adminLevel = adminLevel,
                            subAdminLevel =subAdminLevel)
                    appRepository.registerStudent(user, object : IRemoteDataSource.MessageCallback {
                        override fun onResponse(message: Int?) {
                            showSnackbarMessage(message!!)
                            _isBtnAvailable.value = false
                            _dataLoading.value = false
                        }

                        override fun onDataNotAvailable(message: Int?) {
                            showSnackbarMessage(message!!)
                            _isBtnAvailable.value = true
                            _dataLoading.value = false
                        }

                    })
                } else _dataLoading.value = false
            }
            "إضافة خادم"->{
                if (isDataValidAdminOrSubAdmin()) {
                    subAdminLevel=  selectedItems
                    //if( mTitleTV == "إضافة امين خدمة") adminLevel=  selectedItems
                    var user: User = User(mobile = mobile,
                            subAdminLevel =subAdminLevel)
                    appRepository.registerSubAdmin(user, object : IRemoteDataSource.MessageCallback {
                        override fun onResponse(message: Int?) {
                            showSnackbarMessage(message!!)
                            _isBtnAvailable.value = false
                            _dataLoading.value = false
                        }

                        override fun onDataNotAvailable(message: Int?) {
                            showSnackbarMessage(message!!)
                            _isBtnAvailable.value = true
                            _dataLoading.value = false
                        }

                    })
                } else _dataLoading.value = false
            }
            "إضافة امين خدمة"->{
                if (isDataValidAdminOrSubAdmin()) {
                    adminLevel=  selectedItems
                    var user: User = User(mobile = mobile,
                            adminLevel =adminLevel)
                    appRepository.registerAdmin(user, object : IRemoteDataSource.MessageCallback {
                        override fun onResponse(message: Int?) {
                            showSnackbarMessage(message!!)
                            _isBtnAvailable.value = false
                            _dataLoading.value = false
                        }

                        override fun onDataNotAvailable(message: Int?) {
                            showSnackbarMessage(message!!)
                            _isBtnAvailable.value = true
                            _dataLoading.value = false
                        }

                    })
                } else _dataLoading.value = false
            }
        }
    }
}
