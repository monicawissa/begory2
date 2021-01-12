package com.attendance.myproject.begory.presentationLayer.splash
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

        private val msplashState = MutableLiveData<Pair<SplashState,User?>>()
        val splashState: LiveData<Pair<SplashState,User?>>
                get() = msplashState
        private val msnackbarText = MutableLiveData<Event<Int>>()
        val snackbarMessage: LiveData<Event<Int>>
                get() = msnackbarText
        private val msnackbarText2 = MutableLiveData<String>()
        val snackbarMessage2: LiveData<String>
                get() = msnackbarText2
        //same as enum
        sealed class SplashState {
                class MainActivity : SplashState()
                class LoginActivity : SplashState()

        }
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
                                val user=appRepository.getUser()
                                if(user==null)msplashState.postValue(Pair(SplashState.LoginActivity(),null))
                                else{  msplashState.postValue(Pair(SplashState.MainActivity(),user))
                                }
                        }
                        else showSnackbarMessage(R.string.no_internet_connection)
                }
        }
}
