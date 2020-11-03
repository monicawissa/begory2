
package com.attendance.myproject.begory.data.source.local.prefs

import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource

interface PreferencesHelper {

    fun getUser(callback: IRemoteDataSource.LoginCallback)
    fun setUser(user: User)
    fun setUserAsLoggedOut()
}