package com.attendance.myproject.begory.presentationLayer.main

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.databinding.ActivityMainBinding
import com.attendance.myproject.begory.presentationLayer.BaseActivity
import com.attendance.myproject.begory.presentationLayer.login.LoginActivity
import com.attendance.myproject.begory.presentationLayer.main.MainNavigator
import com.attendance.myproject.begory.presentationLayer.main.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() , MainNavigator {
    private lateinit var binding: ActivityMainBinding
    private  val mainViewModel: MainViewModel by viewModels()
    override val layoutId: Int
        get() = R.layout.activity_main

    override fun initializeView() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(ContentValues.TAG, "showMessage: create Main")

        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.mainViewModel=mainViewModel
        binding.lifecycleOwner = this
        subscribeToNavigationChanges(mainViewModel)

    }

    override fun openLoginActivity() {
        UiManager.startActivity(this@MainActivity, LoginActivity::class.java)
        finish()
    }

    private fun subscribeToNavigationChanges(viewModel: MainViewModel) {

        // The activity observes the navigation commands in the ViewModel
        val activity = this@MainActivity
        viewModel.run {
            isLogOut.observe(activity,
                    Observer {
                        if (it==true){openLoginActivity()
                        }
                    })
            snackbarMessage.observe(activity, Observer { showMessage(getString(it.getContentIfNotHandled()!!)) })
            snackbarMessage2.observe(activity, Observer { showMessage(it) })
        }
    }
}