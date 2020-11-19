package com.attendance.myproject.begory.presentationLayer.splash

import com.attendance.myproject.begory.data.Models.User

interface SplashNavigator {
    fun openLoginActivity()
    fun openMainActivity(second: User)
}
