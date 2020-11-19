package com.attendance.myproject.begory.presentationLayer.login

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.databinding.ActivityLoginBinding
import com.attendance.myproject.begory.presentationLayer.BaseActivity
import com.attendance.myproject.begory.presentationLayer.main.MainActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : BaseActivity() ,LoginNavigator{
    private lateinit var binding: ActivityLoginBinding
    private  val loginViewModel: LoginViewModel by viewModels()
    override val layoutId: Int
        get() = R.layout.activity_login

    override fun initializeView() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(ContentValues.TAG, "showMessage: create login")

        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.loginViewModel=loginViewModel
        binding.lifecycleOwner = this
        subscribeToNavigationChanges(loginViewModel)

    }

    override fun openMainActivity(second: User?) {
        UiManager.startActivity(this@LoginActivity, MainActivity::class.java,getString(R.string.userType),second!!)
        finish()
    }

    private fun subscribeToNavigationChanges(viewModel: LoginViewModel) {

        // The activity observes the navigation commands in the ViewModel
        val activity = this@LoginActivity
        viewModel.run {
            isopenMain.observe(activity,
                    Observer {
                        if (it.first)openMainActivity(it.second!!)
                    })
            ishideKeyboard.observe(activity,
                    Observer {
                        if (it==true)hide_Keyboard()
                    })
            snackbarMessage.observe(activity, Observer { showMessage(getString(it.getContentIfNotHandled()!!)) })
            snackbarMessage2.observe(activity, Observer { showMessage(it) })
        }
    }
}