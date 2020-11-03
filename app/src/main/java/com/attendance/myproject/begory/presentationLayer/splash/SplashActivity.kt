package com.attendance.myproject.begory.presentationLayer.splash

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.Injection
import com.attendance.myproject.begory.Utilities.Internet
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.Utilities.ggle.ViewModelFactory
import com.attendance.myproject.begory.Utilities.ggle.obtainViewModel
import com.attendance.myproject.begory.databinding.ActivityLoginBinding
import com.attendance.myproject.begory.databinding.ActivitySplashBinding
import com.attendance.myproject.begory.presentationLayer.login.LoginActivity


class SplashActivity: AppCompatActivity() ,SplashNavigator {
    private lateinit var binding: ActivitySplashBinding
    private lateinit var splashViewModel: SplashViewModel by ViewModel()
    override fun openLoginActivity() {
        UiManager.startActivity(this@SplashActivity, LoginActivity::class.java)
        finish()
    }
    override fun openMainActivity() {
//        UiManager.startActivity(this@SplashActivity, MainActivity::class.java)
//        finish()
    }

    private fun showMessage(message:String) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        if(!Internet.isOnline(applicationContext)) showMessage(getString(R.string.no_internet_connection))

        binding= DataBindingUtil.setContentView(this, R.layout.activity_splash)
        binding.splashViewModel
        subscribeToNavigationChanges(splashViewModel)

    }

    private fun subscribeToNavigationChanges(viewModel: SplashViewModel) {

        // The activity observes the navigation commands in the ViewModel
        val activity = this@SplashActivity
        viewModel.run {
            splashState.observe(activity,
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
        }
    }

}

private operator fun ViewModel.getValue(splashActivity: SplashActivity, property: KProperty<*>): SplashViewModel {

}


