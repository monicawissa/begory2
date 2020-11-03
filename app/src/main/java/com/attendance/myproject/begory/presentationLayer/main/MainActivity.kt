
package com.attendance.myproject.begory.presentationLayer.main

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.attendance.myproject.begory.Utilities.BaseActivity
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.Internet
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.databinding.ActivityMainBinding
import com.attendance.myproject.begory.presentationLayer.login.LoginActivity
import np.com.susanthapa.curved_bottom_navigation.CbnMenuItem

class MainActivity : BaseActivity() , MainNavigator {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
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
                    R.id.navigation_home
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = obtainViewModel()
        binding.mainViewModel
        subscribeToNavigationChanges(mainViewModel)
        val navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(
                setOf(
                        R.id.navigation_home,
                        R.id.navigation_dashboard,
                        R.id.navigation_notifications,
                        R.id.navigation_profile,
                        R.id.navigation_settings
                )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.navView.setupWithNavController(navController)
        if(!Internet.isOnline(applicationContext)) showMessage(getString(R.string.no_internet_connection))

    }
    fun setMenuItem(i:Int){
        binding.navView.setMenuItems(menuItems, i)
    }
    override fun openLoginActivity() {
        UiManager.startActivity(this@MainActivity, LoginActivity::class.java)
        finish()
    }

    override fun showMessage(string: String) {

    }
    private fun subscribeToNavigationChanges(viewModel: MainViewModel) {

        // The activity observes the navigation commands in the ViewModel
        val activity = this@MainActivity
//        viewModel.run {
//            isDataAvailable.observe(activity,
//                    Observer {
//                        if (it==true)openMainActivity()
//                    })
//            snackbarMessage.observe(activity, Observer { showMessage(getString(it.getContentIfNotHandled()!!)) })
//            snackbarMessage2.observe(activity, Observer { showMessage(it) })
//        }
    }
    fun obtainViewModel(): MainViewModel = ViewModelProviders.of(this@MainActivity).get(MainViewModel::class.java)


}