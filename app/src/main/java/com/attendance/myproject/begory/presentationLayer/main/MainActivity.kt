
package com.attendance.myproject.begory.presentationLayer.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.Internet
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.Utilities.ggle.replaceFragmentInActivity
import com.attendance.myproject.begory.databinding.ActivityMainBinding
import com.attendance.myproject.begory.presentationLayer.BaseActivity
import com.attendance.myproject.begory.presentationLayer.login.LoginActivity
import dagger.hilt.android.AndroidEntryPoint
import np.com.susanthapa.curved_bottom_navigation.CbnMenuItem
@AndroidEntryPoint
class MainActivity : BaseActivity() , MainNavigator {
    private lateinit var binding: ActivityMainBinding
    private  val mainViewModel: MainViewModel by viewModels()
    private val menuItems :Array<CbnMenuItem> = arrayOf(
            CbnMenuItem(
                    R.drawable.ic_notification, // the icon
                    R.drawable.avd_notification, // the AVD that will be shown in FAB
                    R.id.navigation_notifications // optional if you use Jetpack Navigation
            ),
            CbnMenuItem(
                    R.drawable.ic_dashboard,
                    R.drawable.avd_dashboard,
                    R.id.navigation_dashboard
            ),
            CbnMenuItem(
                    R.drawable.ic_shop,
                    R.drawable.avd_home,
                    R.id.navigation_shop
            ),
            CbnMenuItem(
                    R.drawable.ic_profile,
                    R.drawable.avd_profile,
                    R.id.navigation_profile
            ),
            CbnMenuItem(
                    R.drawable.ic_settings,
                    R.drawable.avd_settings,
                    R.id.navigation_settings
            )
    )
    override val layoutId: Int
        get() = R.layout.activity_main

    override fun initializeView() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mainViewModel=mainViewModel
        binding.lifecycleOwner = this
        subscribeToNavigationChanges(mainViewModel)
        val navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(
                setOf(
                        R.id.navigation_shop,
                        R.id.navigation_dashboard,
                        R.id.navigation_notifications,
                        R.id.navigation_profile,
                        R.id.navigation_settings
                )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        setMenuItem(1)
        binding.navView.setupWithNavController(navController)
//        replaceFragmentInActivity(findOrCreateViewFragment(), R.id.nav_host_fragment)
    }



    fun setMenuItem(i:Int){
        binding.navView.setMenuItems(menuItems, i)
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
                        if (it==true)openLoginActivity()
                    })
            snackbarMessage.observe(activity, Observer { showMessage(getString(it.getContentIfNotHandled()!!)) })
            snackbarMessage2.observe(activity, Observer { showMessage(it) })
        }
    }
}