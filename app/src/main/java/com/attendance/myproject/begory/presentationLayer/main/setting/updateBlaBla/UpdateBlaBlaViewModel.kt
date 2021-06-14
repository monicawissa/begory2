package com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla
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


class UpdateBlaBlaViewModel  @ViewModelInject constructor(private val appRepository: AppRepository,
                                                       @Assisted private val savedStateHandle: SavedStateHandle
) :
        ViewModel() ,LifecycleObserver {
    var usertmp:User=savedStateHandle.getLiveData<User>("userType").value as User
    var name: String = usertmp.name!!
    var mobile: String =  usertmp.mobile!!
    var mobile2: String =  usertmp.mobile2!!
    var address: String =  usertmp.address!!
    var isshamas: Boolean =  usertmp.isShamas!!
    var studentLevel:  String? = usertmp.studentLevel
    var adminLevel: String? = usertmp.adminLevel!!
    var subAdminLevel: String? =  usertmp.subAdminLevel!!
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
            studentLevel += FirebaseFilterType.fbConvert(
                    ((parent!!.getItemAtPosition(position)) as Level).levelId!!
            )
            studentLevel+='_'

        }
    }


    //clickable of button
    private val _isBtnAvailable = MutableLiveData<Boolean>()
    val isBtnAvailable: LiveData<Boolean>
        get() = _isBtnAvailable

    //openMain
    private val _isOpenMain = MutableLiveData<Boolean>()
    val isOpenMain: LiveData<Boolean>
        get() = _isOpenMain
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
        _isStudentAvailable.value = (mTitleTV.equals("تعديل مخدوم"))
        _isOpenMain.value=false
    }


    private fun isDataValid(): Boolean {
        // validate
        Log.d(ContentValues.TAG, "showMessage: isDataValid")

        if (TextUtils.isEmpty(mobile) || mobile.length != 11) {
            Log.d(ContentValues.TAG, "showMessage: ismobile" + mobile.length)

            showSnackbarMessage(R.string.fill_mobiledata)
            return false
        }
        if (TextUtils.isEmpty(name) || (mTitleTV.equals("تعديل مخدوم") && studentLevel == null)) {
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
        if ((!mTitleTV.equals("تعديل مخدوم") && selectedData.isEmpty())) {
            Log.d(ContentValues.TAG, "showMessage: PasswordValid")
            showSnackbarMessage(R.string.fill__level)
            return false
        }
        return true
    }

    fun register() {
        _dataLoading.value = true
        _isBtnAvailable.value=false
        if (mTitleTV.equals("تعديل مخدوم")) {
            if (isDataValid()) {
                usertmp.name=name
                usertmp.mobile=mobile
                usertmp.mobile2=mobile2
                usertmp.mobile_password="$mobile ${usertmp.password}"
                usertmp.address=address
                usertmp.isShamas=isshamas
                usertmp.studentLevel=studentLevel
                appRepository.updateStudentelse(usertmp, object : IRemoteDataSource.MessageCallback {
                    override fun onResponse(message: Int?) {
                        showSnackbarMessage(message!!)
                        _dataLoading.value = false
                        _isBtnAvailable.value = true

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
        else if (mTitleTV.equals("تعديل خادم")) {
            if (isDataValidAdminOrSubAdmin()) {
                usertmp.mobile=mobile
                usertmp.subAdminLevel=selectedData
                appRepository.updateSubAdmin(usertmp, object : IRemoteDataSource.MessageCallback {
                    override fun onResponse(message: Int?) {
                        showSnackbarMessage(message!!)
                        _dataLoading.value = false
                        _isBtnAvailable.value = true

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
        else if (mTitleTV.equals("تعديل امين خدمة")) {
            if (isDataValidAdminOrSubAdmin()) {
                usertmp.mobile=mobile
                usertmp.adminLevel=selectedData
                appRepository.updateAdmin(usertmp, object : IRemoteDataSource.MessageCallback {
                    override fun onResponse(message: Int?) {
                        showSnackbarMessage(message!!)
                        _dataLoading.value = false
                        _isBtnAvailable.value = true

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
