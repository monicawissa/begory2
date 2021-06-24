package com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla
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


class AddBlaBlaViewModel  @ViewModelInject constructor(private val appRepository: AppRepository,
                                                       @Assisted private val savedStateHandle: SavedStateHandle
) :
        ViewModel() ,LifecycleObserver {
    var name: String = ""
    var mobile: String = ""
    var mobile2: String = ""
    var address: String = ""
    var isshamas: Boolean = false
    var studentLevel: String? = ""
    var adminLevel: String? = ""
    var subAdminLevel: String? = ""
    var mTitleTV = savedStateHandle.getLiveData<String>("settingType").value
    var selectedData:String=""
    var selectedItemsListener= MultiSpinnerListener { items -> //The followings are selected items.
        var str:String =""
        for (i in 0 until items.size) {
            str+=(FirebaseFilterType.fbConvert(items[i].id.toInt()))
            str+='_'
        }
        selectedData=str
    }
    val spinnerListener = object : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(parent: AdapterView<*>?) {

        }

        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            var levelId= FirebaseFilterType.fbConvert(((parent!!.getItemAtPosition(position)) as Level).levelId!!)
            if(levelId!=FirebaseFilterType.LevelFilterType.no){
                studentLevel=""
                studentLevel += levelId
            }
            //studentLevel+='_'
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
    //openMain
    private val _isOpenMain = MutableLiveData<Boolean>()
    val isOpenMain: LiveData<Boolean>
        get() = _isOpenMain
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
        _isOpenMain.value=false
        _isBtnAvailable.value = true
        _isStudentAvailable.value = (mTitleTV.equals("إضافة مخدوم"))
    }


    private fun isDataValid(): Boolean {
        // validate
        Log.d(ContentValues.TAG, "showMessage: isDataValid")

        if (TextUtils.isEmpty(mobile) || mobile.length != 11) {
            Log.d(ContentValues.TAG, "showMessage: ismobile" + mobile.length)

            showSnackbarMessage(R.string.fill_mobiledata)
            return false
        }
        if (TextUtils.isEmpty(name) || (mTitleTV.equals("إضافة مخدوم") && studentLevel!!.isEmpty())) {
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
        if ((!mTitleTV.equals("إضافة مخدوم") && selectedData.isEmpty())) {
            Log.d(ContentValues.TAG, "showMessage: PasswordValid")
            showSnackbarMessage(R.string.fill__level)
            return false
        }
        return true
    }

    fun register() {
        _ishideKeyboard.value = true
        _dataLoading.value = true
        if (mTitleTV.equals("إضافة مخدوم")) {
            if (isDataValid()) {
                var user: User = User(name = name, mobile = mobile,
                        mobile2 = mobile2, password = mobile,
                        mobile_password = "$mobile $mobile", address = address,
                        isShamas = isshamas, studentLevel = studentLevel)
                appRepository.registerStudent(user, object : IRemoteDataSource.MessageCallback {
                    override fun onResponse(message: Int?) {
                        showSnackbarMessage(message!!)
                        _isBtnAvailable.value = false
                        _dataLoading.value = false
                        _isOpenMain.value=true

                    }

                    override fun onDataNotAvailable(message: Int?) {
                        showSnackbarMessage(message!!)
                        _isBtnAvailable.value = true
                        _dataLoading.value = false
                        _isOpenMain.value=true
                    }

                })
            } else _dataLoading.value = false
        } else if (mTitleTV.equals("إضافة خادم")) {
            if (isDataValidAdminOrSubAdmin()) {
                subAdminLevel = selectedData
                //if( mTitleTV == "إضافة امين خدمة") adminLevel=  selectedItems
                var user: User = User(mobile = mobile,
                        mobile_password = "$mobile $mobile",
                        subAdminLevel = subAdminLevel,name = name, studentLevel = FirebaseFilterType.LevelFilterType.Servant.toString()+'_')
                appRepository.registerSubAdmin(user, object : IRemoteDataSource.MessageCallback {
                    override fun onResponse(message: Int?) {
                        showSnackbarMessage(message!!)
                        _isBtnAvailable.value = false
                        _dataLoading.value = false
                        _isOpenMain.value=true

                    }

                    override fun onDataNotAvailable(message: Int?) {
                        showSnackbarMessage(message!!)
                        _isBtnAvailable.value = true
                        _dataLoading.value = false
                        _isOpenMain.value=true

                    }

                })
            } else _dataLoading.value = false
        } else if (mTitleTV.equals("إضافة امين خدمة")) {
            if (isDataValidAdminOrSubAdmin()) {
                adminLevel = selectedData
                var user: User = User(mobile = mobile,mobile_password = "$mobile $mobile",
                        adminLevel = adminLevel,name = name, studentLevel = FirebaseFilterType.LevelFilterType.Servant.toString()+'_')
                appRepository.registerAdmin(user, object : IRemoteDataSource.MessageCallback {
                    override fun onResponse(message: Int?) {
                        showSnackbarMessage(message!!)
                        _isBtnAvailable.value = false
                        _dataLoading.value = false
                        _isOpenMain.value=true

                    }

                    override fun onDataNotAvailable(message: Int?) {
                        showSnackbarMessage(message!!)
                        _isBtnAvailable.value = true
                        _dataLoading.value = false
                        _isOpenMain.value=true

                    }

                })
            } else _dataLoading.value = false
        }
    }
}
