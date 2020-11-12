package com.attendance.myproject.begory.Utilities

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.inputmethod.InputMethodManager

object UiManager {
    fun startActivity(context: Context, cls: Class<*>) {
        val mIntent = Intent(context, cls)
        context.startActivity(mIntent)
    }
    fun startActivity(context: Context, cls: Class<*>,key:String, i:String) {
        val mIntent = Intent(context, cls)
        mIntent.putExtra(key, i);
        context.startActivity(mIntent)
    }
    fun hideKeyboard(activity: Activity?) {
        if (activity == null) return
        val inputManager = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.hideSoftInputFromWindow(activity.currentFocus.windowToken,
                InputMethodManager.HIDE_NOT_ALWAYS)
    }
}
