package com.attendance.myproject.begory.presentationLayer.splash

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.Internet
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.databinding.ActivitySplashBinding
import com.attendance.myproject.begory.presentationLayer.BaseActivity
import com.attendance.myproject.begory.presentationLayer.login.LoginActivity
import com.attendance.myproject.begory.presentationLayer.main.MainActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity: BaseActivity(),SplashNavigator {
    private lateinit var binding: ActivitySplashBinding
    private val splashViewModel: SplashViewModel by viewModels()
    override val layoutId: Int
        get() = R.layout.activity_splash

    override fun initializeView() {

    }

    override fun openLoginActivity() {
        UiManager.startActivity(this@SplashActivity, LoginActivity::class.java)
        finish()
    }
    override fun openMainActivity() {
        UiManager.startActivity(this@SplashActivity, MainActivity::class.java)
        finish()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,layoutId )
        binding.lifecycleOwner = this
        binding.splashViewModel=splashViewModel
        subscribeToNavigationChanges(splashViewModel)

    }

    private fun subscribeToNavigationChanges(viewModel: SplashViewModel) {

        // The activity observes the navigation commands in the ViewModel
        viewModel.run {
            splashState.observe(this@SplashActivity,
                    Observer {
                        when (it) {
                            is SplashViewModel.SplashState.MainActivity -> {
                                openMainActivity()
                            }
                            is SplashViewModel.SplashState.LoginActivity -> {
                                openLoginActivity()
                            }
                        }
                    })
            snackBarMessage.observe(this@SplashActivity,
                    Observer { showMessage(getString(it.getContentIfNotHandled()!!)) })



        }
    }

}
