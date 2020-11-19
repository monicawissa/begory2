package com.attendance.myproject.begory.data.source.local.prefs

import android.content.Context
import android.content.SharedPreferences
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource
import com.attendance.myproject.begory.di.PreferenceInfo
import com.attendance.myproject.begory.di.module.AppModule
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppPreferencesHelper @Inject constructor(@ApplicationContext context: Context) : IPreferencesHelper {
  private val mPrefs =AppModule.provideSavePref(context,User::class.java)

  companion object {
    private val PREF_KEY_ACCESS_TOKEN: String = "PREF_KEY_ACCESS_TOKEN"

  }
  override fun getUser():User? {
    return mPrefs.load(PREF_KEY_ACCESS_TOKEN)
  }

  override fun setUser(user: User) {
    mPrefs.save(PREF_KEY_ACCESS_TOKEN,user)
  }

  override fun setUserAsLoggedOut() {
    mPrefs.clear()
  }
}