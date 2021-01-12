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
package com.attendance.myproject.begory.presentationLayer.main
import android.text.TextUtils
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
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(private val appRepository: AppRepository) :
        ViewModel()  {

    private  var user: User?=null
    private val _isDataAvailable = MutableLiveData<Boolean>()
    val isDataAvailable: LiveData<Boolean>
        get() = _isDataAvailable

    //tabs availability
    private val _isShopAvailable = MutableLiveData<Boolean>()
    val isShopAvailable: LiveData<Boolean>
        get() = _isShopAvailable
    private val _isAttendanceAvailable = MutableLiveData<Boolean>()
    val isAttendanceAvailable: LiveData<Boolean>
        get() = _isAttendanceAvailable
    private val _isProfileAvailable = MutableLiveData<Boolean>()
    val isProfileAvailable: LiveData<Boolean>
        get() = _isProfileAvailable
    private val _isLogOut = MutableLiveData<Boolean>()
    val isLogOut: LiveData<Boolean>
        get() = _isLogOut

    private val _dataLoading = MutableLiveData<Boolean>()
    val dataLoading: LiveData<Boolean>
        get() = _dataLoading


    private val msnackbarText = MutableLiveData<Event<Int>>()
    val snackbarMessage: LiveData<Event<Int>>
        get() = msnackbarText
    private val msnackbarText2 = MutableLiveData<String>()
    val snackbarMessage2: LiveData<String>
        get() = msnackbarText2

    private fun showSnackbarMessage(@StringRes message: Int) {
        msnackbarText.value = Event(message)
    }
    private fun showSnackbarMessage2( message: String) {
        msnackbarText2.value = message
    }
    fun logout(){
        appRepository.setUserAsLoggedOut()
        _isLogOut.value=true
    }

    init {
        _dataLoading.value=false
        _isAttendanceAvailable.value=false
        _isShopAvailable.value=false
        _isLogOut.value=false
        _isProfileAvailable.value=true
        viewModelScope.launch {
        getUser()
        }
    }

    private fun getUser() {
        user=appRepository.getUser()
            if(user==null)logout()
            else{
              //go to profile if it's first time
            }
    }
}