package com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla
import android.content.ContentValues
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.AdapterView
import androidx.annotation.StringRes
import androidx.databinding.BaseObservable
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
    var adminLevel: FirebaseFilterType.LevelFilterType? = null
    var subAdminLevel: FirebaseFilterType.LevelFilterType? = null
    val spinnerListener = object : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(parent: AdapterView<*>?) {

        }

        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            studentLevel = FirebaseFilterType.fbConvert(
                    ((parent!!.getItemAtPosition(position)) as Level).levelId!!
            )

        }

        //clickable of button
        private val _isDataAvailable = MutableLiveData<Boolean>()
        val isDataAvailable: LiveData<Boolean>
            get() = _isDataAvailable

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
            _isDataAvailable.value = true
        }

        private fun isDataValid(): Boolean {
            // validate
            Log.d(ContentValues.TAG, "showMessage: isDataValid")

            if (TextUtils.isEmpty(mobile) || mobile.length != 11) {
                Log.d(ContentValues.TAG, "showMessage: ismobile" + mobile.length)

                showSnackbarMessage(R.string.fill_mobiledata)
                return false
            }
            if (TextUtils.isEmpty(name) || studentLevel == null) {
                Log.d(ContentValues.TAG, "showMessage: PasswordValid")
                showSnackbarMessage(R.string.fill_name_level)
                return false
            }
            return true
        }

        fun register() {
            _ishideKeyboard.value = true
            _dataLoading.value = true
            if (isDataValid()) {
                var user: User = User(name = name, mobile = mobile,
                        mobile2 = mobile2, password = mobile,
                        mobile_password = "$mobile $mobile", address = address,
                        isShamas = isshamas, studentLevel = studentLevel, adminLevel = adminLevel,
                        subAdminLevel = subAdminLevel)
                appRepository.register(user, object : IRemoteDataSource.MessageCallback {
                    override fun onResponse(message: Int?) {
                        showSnackbarMessage(message!!)
                        _isDataAvailable.value = false
                        _dataLoading.value = false
                    }

                    override fun onDataNotAvailable(message: Int?) {
                        showSnackbarMessage(message!!)
                        _isDataAvailable.value = true
                        _dataLoading.value = false
                    }

                })
            } else _dataLoading.value = false
        }
    }
}