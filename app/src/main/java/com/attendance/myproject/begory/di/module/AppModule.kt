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
package com.attendance.myproject.begory.di.module

import android.content.Context
import com.attendance.myproject.begory.Utilities.AppConstants
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.source.AppRepository
import com.attendance.myproject.begory.data.source.BaseDataSource
import com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper
import com.attendance.myproject.begory.data.source.local.prefs.IPreferencesHelper
import com.attendance.myproject.begory.data.source.local.prefs.SavePrefs
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource
import com.attendance.myproject.begory.data.source.remote.RemoteDataSource
import com.attendance.myproject.begory.di.PreferenceInfo
import com.google.firebase.database.FirebaseDatabase

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

/**
 * Created by amitshekhar on 07/07/17.
 */
@Module
@InstallIn(ApplicationComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideRemoteDataSource(mRemoteDataSource: RemoteDataSource): IRemoteDataSource {
        return mRemoteDataSource
    }
    @Provides
    @Singleton
    fun providefirebaseDatabase(): FirebaseDatabase {
        return FirebaseDatabase.getInstance()
    }

    @Provides
    @PreferenceInfo
    fun providePreferenceName(): String {
        return AppConstants.PREF_NAME
    }

    //Todo User to T
    @Provides
    fun provideSavePref(@ApplicationContext activity: Context, cls: Class<*>): SavePrefs<User> {
        return SavePrefs(activity, providePreferenceName(),cls)
    }

    @Provides
    @Singleton
    fun provideAppPreferencesHelper(appPreferencesHelper: AppPreferencesHelper): IPreferencesHelper {
        return appPreferencesHelper
    }

    @Singleton
    @Provides
    fun provideRepository(mRemoteDataSource: RemoteDataSource,
                          mPreferencesHelper: AppPreferencesHelper):BaseDataSource =
            AppRepository(mRemoteDataSource, mPreferencesHelper)

}