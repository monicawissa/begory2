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
package com.attendance.myproject.begory.data.source.local.prefs

import android.content.Context
import androidx.annotation.VisibleForTesting
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.data.Models.Key
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource
import com.google.firebase.database.FirebaseDatabase

class AppPreferencesHelper constructor(private val context: Context) : PreferencesHelper {

    override fun getUser(callback: IRemoteDataSource.LoginCallback) {
        val mKeySavePrefs = SavePrefs<User>(context, User::class.java)
        val user=mKeySavePrefs.load(PREF_KEY_USER)
        callback.onResponse(user)
    }

    override fun setUser(user: User) {
            val mKeySavePrefs = SavePrefs<User>(context, User::class.java)
            mKeySavePrefs.save(PREF_KEY_USER, user!!)
        }

    override fun setUserAsLoggedOut() {
        val mKeySavePrefs = SavePrefs<User>(context, User::class.java)
        mKeySavePrefs.clear()
    }


//    override fun getCurrentUserLoggedInMode(): Int {
//        return mPrefs.getInt(PREF_KEY_USER_LOGGED_IN_MODE,
//                BaseDataSource.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.type)
//    }
//
//    override fun setCurrentUserLoggedInMode(mode: BaseDataSource.LoggedInMode) {
//        mPrefs.edit().putInt(PREF_KEY_USER_LOGGED_IN_MODE, mode.type).apply()
//    }


    companion object {
        private var INSTANCE: AppPreferencesHelper? = null

        @JvmStatic
        fun getInstance(context: Context): AppPreferencesHelper {
            if (INSTANCE == null) {
                synchronized(AppPreferencesHelper::javaClass) {
                    INSTANCE = AppPreferencesHelper(context)
                }
            }
            return INSTANCE!!
        }

        @VisibleForTesting
        fun clearInstance() {
            INSTANCE = null
        }

        private const val PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN"
        private const val PREF_KEY_USER = "PREF_KEY_USER"
//        private const val PREF_KEY_USER_LOGGED_IN_MODE = "PREF_KEY_USER_LOGGED_IN_MODE"
    }

}