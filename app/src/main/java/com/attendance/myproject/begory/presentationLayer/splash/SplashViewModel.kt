package com.attendance.myproject.begory.presentationLayer.Splash
import android.content.ContentValues
import android.text.TextUtils
import android.util.Log
import androidx.annotation.StringRes
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.ggle.Event
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.source.AppRepository
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource
import com.attendance.myproject.begory.di.module.NetworkHelper
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel  @ViewModelInject constructor(private val appRepository: AppRepository,
                                                    private val networkHelper: NetworkHelper
) :
        ViewModel() {

        private val msplashState = MutableLiveData<SplashState>()
        val splashState: LiveData<SplashState>
                get() = msplashState
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
                viewModelScope.launch {
                        delay(3000)
                        if(networkHelper.isNetworkConnected()){
                                appRepository.getUser(object :IRemoteDataSource.LoginCallback{
                                        override fun onResponse(user: User) {
                                                msplashState.postValue(SplashState.MainActivity())

                                        }

                                        override fun onDataNotAvailable(message: Int?) {
                                                msplashState.postValue(SplashState.LoginActivity())
                                        }

                                })
                        }
                        else showSnackbarMessage(R.string.no_internet_connection)
                }
        }
}
//same as enum
sealed class SplashState {
        class MainActivity : SplashState()
        class LoginActivity : SplashState()

}