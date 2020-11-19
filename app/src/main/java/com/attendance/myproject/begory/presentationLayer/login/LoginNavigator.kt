package com.attendance.myproject.begory.presentationLayer.login

import com.attendance.myproject.begory.data.Models.User


interface LoginNavigator {
    fun openMainActivity(user: User?)
}