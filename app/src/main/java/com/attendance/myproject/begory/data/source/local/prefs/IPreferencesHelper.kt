
package com.attendance.myproject.begory.data.source.local.prefs

import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource

interface IPreferencesHelper {

    fun getUser():User?
    fun setUser(user: User)
    fun setUserAsLoggedOut()
    fun getLevel(): String
    fun setLevel(l: String)
}