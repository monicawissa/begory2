package com.attendance.myproject.begory.Utilities

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager

class Internet {

    companion object {
        @SuppressLint("MissingPermission")
        fun isOnline(context: Context): Boolean {
            val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkInfo = connectivityManager.activeNetworkInfo
            return networkInfo !!.isConnected
        }
    }
}