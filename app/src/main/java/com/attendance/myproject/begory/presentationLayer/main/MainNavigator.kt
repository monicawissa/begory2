package com.attendance.myproject.begory.presentationLayer.main

import android.view.Menu


interface MainNavigator {
	fun openLoginActivity()
    fun onNavigationItemSelected(menu: Menu?): Any
    fun openFistTimeToLoginActivity()
}
