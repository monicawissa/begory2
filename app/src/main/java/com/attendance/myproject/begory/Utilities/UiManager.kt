package com.attendance.myproject.begory.Utilities

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import com.attendance.myproject.begory.data.Models.User

object UiManager {
    fun startActivity(context: Context, cls: Class<*>) {
        val mIntent = Intent(context, cls)
        context.startActivity(mIntent)
    }
    fun startActivity(context: Context, cls: Class<*>,key:String, i:String) {
        val mIntent = Intent(context, cls).apply {
            putExtra(key, i)
        }
        context.startActivity(mIntent)
    }
    fun startActivity(context: Context, cls: Class<*>,key:String, i:Int) {
        val mIntent = Intent(context, cls).apply {
            putExtra(key, i)
        }
        context.startActivity(mIntent)
    }
    //for profile
    fun startActivity(context: Context, cls: Class<*>,key:String, i:User) {
        val mIntent = Intent(context, cls).apply {
            putExtra(key, i)
        }
        context.startActivity(mIntent)
    }
    //for update profile
    fun startActivity(context: Context, cls: Class<*>,key:String, i:User,key1:String, i1:String) {
        val mIntent = Intent(context, cls).apply {
            putExtra(key, i)
            putExtra(key1, i1)

        }
        context.startActivity(mIntent)
    }
    fun hideKeyboard(activity: Activity?) {
        if (activity == null) return
        val inputManager = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.hideSoftInputFromWindow(activity.currentFocus.windowToken,
                InputMethodManager.HIDE_NOT_ALWAYS)
    }
}
