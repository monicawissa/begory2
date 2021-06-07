package com.attendance.myproject.begory.presentationLayer.main.setting.addGift
import android.content.ContentValues
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.AdapterView
import androidx.annotation.StringRes
import androidx.core.text.isDigitsOnly
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.androidbuts.multispinnerfilter.KeyPairBoolData
import com.androidbuts.multispinnerfilter.MultiSpinnerListener
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.ggle.Event
import com.attendance.myproject.begory.data.Models.Gift
import com.attendance.myproject.begory.data.Models.Level
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.source.AppRepository
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource


class AddGiftViewModel  @ViewModelInject constructor(private val appRepository: AppRepository,
                                                       @Assisted private val savedStateHandle: SavedStateHandle
) :
        ViewModel() ,LifecycleObserver {
    var name: String = ""
    var number: String = ""
    var notes: String = ""
    var cost: String = ""
    var image_path:  String = ""

    //var studentLevel: FirebaseFilterType.LevelFilterType? = null
    //var adminLevel: String? = ""
    //var subAdminLevel: String? = ""
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
//    val spinnerListener = object : AdapterView.OnItemSelectedListener {
//        override fun onNothingSelected(parent: AdapterView<*>?) {
//
//        }
//
//        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//            studentLevel = FirebaseFilterType.fbConvert(
//                    ((parent!!.getItemAtPosition(position)) as Level).levelId!!
//            )
//        }
//    }

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

        if (TextUtils.isEmpty(name)||!cost.isDigitsOnly()||cost.toDouble()>0 ||!selectedData.isEmpty()) {
            showSnackbarMessage(R.string.fill_cost_level)
            return false
        }
        return true
    }

    fun register() {
        _ishideKeyboard.value = true
        _dataLoading.value = true
        if (mTitleTV.equals("إضافة هدية")&&isDataValid()) {
                var gift: Gift = Gift(name = name, price = cost.toDouble(),
                        notes = notes, numberOfItem = number.toInt(),imagePath =image_path )
                appRepository.addGift(gift,(selectedData.split("_") as List<FirebaseFilterType.LevelFilterType>), object : IRemoteDataSource.MessageCallback {
                    override fun onResponse(message: Int?) {
                        showSnackbarMessage(message!!)
                        _isBtnAvailable.value = false
                        _dataLoading.value = false
                        _isOpenMain.value=true
                        name=""
                        number=""
                        cost=""
                        selectedData=""
                        notes=""
                        image_path=""
                    }

                    override fun onDataNotAvailable(message: Int?) {
                        showSnackbarMessage(message!!)
                        _isBtnAvailable.value = true
                        _dataLoading.value = false
                        _isOpenMain.value=true
                    }

                })
        }
        else {
            _isBtnAvailable.value = true
            _dataLoading.value = false
            _isOpenMain.value=true
        }

    }
}
