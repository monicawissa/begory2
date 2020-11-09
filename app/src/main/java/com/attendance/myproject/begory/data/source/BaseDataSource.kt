
package com.attendance.myproject.begory.data.source

import com.attendance.myproject.begory.data.source.local.prefs.IPreferencesHelper
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource

interface BaseDataSource : IPreferencesHelper,IRemoteDataSource{

    enum class LoggedInMode(val type: Int) {
        LOGGED_IN_MODE_LOGGED_OUT(0), LOGGED_IN_MODE_GOOGLE(1), LOGGED_IN_MODE_FB(2), LOGGED_IN_MODE_SERVER(3);

    }

//    fun updateApiHeader(userId: Long?, accessToken: String?)
//
//    fun updateUserInfo(
//            accessToken: String?,
//            userId: Long?,
//            loggedInMode: LoggedInMode?,
//            userName: String?,
//            email: String?,
//            profilePicPath: String?)
//

}