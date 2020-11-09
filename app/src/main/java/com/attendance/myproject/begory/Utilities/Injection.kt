
package com.attendance.myproject.begory.Utilities

import android.content.Context
import com.attendance.myproject.begory.data.source.AppRepository
import com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper
import com.attendance.myproject.begory.data.source.local.prefs.IPreferencesHelper
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource
import com.attendance.myproject.begory.data.source.remote.RemoteDataSource

/**
 * Enables injection of mock implementations for
 * [TasksDataSource] at compile time. This is useful for testing, since it allows us to use
 * a fake instance of the class to isolate the dependencies and run a test hermetically.
 */
//object Injection {
//
//    fun provideAppRepository(context: Context): AppRepository {
////        val database = FavoriteDataBase.getInstance(context)
//        val mRemoteDataSource:IRemoteDataSource=RemoteDataSource.getInstance();
//        val mIPreferencesHelper:IPreferencesHelper=AppPreferencesHelper.getInstance(context)
////        val mLocalDataSource:ILocalDataSource= LocalDataSource.getInstance(AppExecutors(), database?.FavoriteDao()!!)!!
//        return AppRepository.getInstance(mRemoteDataSource = mRemoteDataSource,
//                mPreferencesHelper = mIPreferencesHelper)
//    }
//}
