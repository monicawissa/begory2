package com.attendance.myproject.begory.presentationLayer.main.bookedGift
import androidx.annotation.StringRes
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.attendance.myproject.begory.Utilities.ggle.Event
import com.attendance.myproject.begory.data.Models.Gift
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.source.AppRepository
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource


class BookedViewModel  @ViewModelInject constructor(private val appRepository: AppRepository,
                                                    @Assisted private val savedStateHandle: SavedStateHandle
) :
        ViewModel() ,LifecycleObserver {
    var mGiftList: ArrayList<Gift> = ArrayList()
    val mUserPrice= MutableLiveData<String>()
    var studentLevel: FirebaseFilterType.LevelFilterType? = null
    private val _mGiftListListener= MutableLiveData<Boolean>()
    val mGiftListListener: LiveData<Boolean>
        get() = _mGiftListListener
    var mTitleTV = savedStateHandle.getLiveData<String>("settingType").value

//    //Btn check Available
//    private val _isCheckBtnAvailable = MutableLiveData<Boolean>()
//    val isCheckBtnAvailable: LiveData<Boolean>
//        get() = _isCheckBtnAvailable
    //progressbar
    private val _dataLoading = MutableLiveData<Boolean>()
    val dataLoading: LiveData<Boolean>
        get() = _dataLoading
//    private val _ishideKeyboard = MutableLiveData<Boolean>()
//    val ishideKeyboard: LiveData<Boolean>
//        get() = _ishideKeyboard

    private val _msnackbarText = MutableLiveData<Event<Int>>()
    val snackbarMessage: LiveData<Event<Int>>
        get() = _msnackbarText
    private val _msnackbarText2 = MutableLiveData<String>()
    val snackbarMessage2: LiveData<String>
        get() = _msnackbarText2

    private fun showSnackbarMessage(@StringRes message: Int) {
        _msnackbarText.value = Event(message)
    }

    private fun showSnackbarMessage2(message: String) {
        _msnackbarText2.value = message
    }

    init {
        getUser()
        _mGiftListListener.value=false
        getGiftsList()
    }
     var user: User?=null

    private fun getUser() {
        user=appRepository.getUser()
    }
    fun updateui(user: User) {
        this.user=user
        mUserPrice.value= user.price.toString()
        //_mGiftListListener.value=true
    }
    fun getGiftsList() {
        mUserPrice.value=user!!.price.toString();
        _dataLoading.value = true
//        _isCheckBtnAvailable.value=false
        appRepository.getUserbyLevel( object : IRemoteDataSource.LoginCallback {
            override fun onResponse(user: User) {
                mGiftList.addAll(user.selectedGifts!!.toList())
                _mGiftListListener.value=true
                _dataLoading.value = false
            }

            override fun onDataNotAvailable(message: Int?) {
                showSnackbarMessage(message!!)
                _dataLoading.value = false
            }
        })
    }

}
