package com.attendance.myproject.begory.presentationLayer

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.presentationLayer.login.LoginViewModel

abstract class BaseActivity : AppCompatActivity() {

    abstract val layoutId: Int

    protected abstract fun initializeView()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)


        initializeView()

    }

    fun showMessage(string: String){
        Toast.makeText(applicationContext, string, Toast.LENGTH_SHORT).show()
        Log.d(TAG, "showMessage: "+string)
    }
    fun hide_Keyboard() {
        UiManager.hideKeyboard(this)
    }
}
