/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */
package com.attendance.myproject.begory.presentationLayer.splash

import android.annotation.SuppressLint
import android.app.Application
import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.StringRes
import androidx.annotation.VisibleForTesting
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
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

public class SplashViewModel @ViewModelInject constructor(private val appRepository: AppRepository,
                                                          private val networkHelper: NetworkHelper
): ViewModel() {
    private val mSplashState = MutableLiveData<SplashState>()
    val splashState: LiveData<SplashState>
        get() = mSplashState
    private val msnackbarText = MutableLiveData<Event<Int>>()
    val snackBarMessage: LiveData<Event<Int>>
        get() = msnackbarText



    init {
        viewModelScope.launch {
            delay(3000)
            if (networkHelper.isNetworkConnected()) {
                decideState()
            }
            else showSnackbarMessage(R.string.no_internet_connection)
        }
    }
    private fun showSnackbarMessage(@StringRes message: Int) {
        msnackbarText.value = Event(message)
    }
    //same as enum but in kotlin
    sealed class SplashState {
        class MainActivity : SplashState()
        class LoginActivity:SplashState()
    }
    private fun decideState() {

        appRepository.getUser(object :IRemoteDataSource.LoginCallback{
            override fun onResponse(user: User) {
                mSplashState.postValue(SplashState.MainActivity())

            }

            override fun onDataNotAvailable(message: Int?) {
                mSplashState.postValue(SplashState.LoginActivity())
            }

        })
    }


}