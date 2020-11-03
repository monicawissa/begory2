package com.attendance.myproject.begory.Utilities

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.inputmethod.InputMethodManager

object UiManager {
    fun startActivity(context: Context, activity: Class<*>?) {
        val mIntent = Intent(context, activity)
        context.startActivity(mIntent)
    }
    @JvmStatic
    fun hideKeyboard(activity: Activity?) {
        if (activity == null) return
        val inputManager = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.hideSoftInputFromWindow(activity.currentFocus.windowToken,
                InputMethodManager.HIDE_NOT_ALWAYS)
    }
}