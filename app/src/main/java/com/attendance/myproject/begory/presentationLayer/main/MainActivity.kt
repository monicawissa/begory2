package com.attendance.myproject.begory.presentationLayer.main

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.databinding.ActivityMainBinding
import com.attendance.myproject.begory.presentationLayer.BaseActivity
import com.attendance.myproject.begory.presentationLayer.login.LoginActivity
import com.attendance.myproject.begory.presentationLayer.main.changePassword.PasswordActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*


@AndroidEntryPoint
class MainActivity : BaseActivity() , MainNavigator {
    private lateinit var binding: ActivityMainBinding
    private  val mainViewModel: MainViewModel by viewModels()
    private lateinit var navController: NavController

    lateinit var user: User

    override val layoutId: Int
        get() = R.layout.activity_main

    override fun initializeView() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        Log.d(ContentValues.TAG, "showMessage: create Main")
        user=intent.getSerializableExtra(this.getString(R.string.userType)) as User

        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.mainViewModel=mainViewModel
        binding.lifecycleOwner = this
        subscribeToNavigationChanges(mainViewModel)
        //nav
        navController = findNavController(R.id.nav_host_fragment)


        if(user.firstTime_ToLogin)openFistTimeToLoginActivity()
        val bottomNavigationView = findViewById<View>(R.id.bottomBar) as BottomNavigationView
        if(user.subAdminLevel.isNullOrEmpty()&&user.adminLevel.isNullOrEmpty())
            bottomNavigationView.menu.removeItem(R.id.navigation_attendance)
        if(user.adminLevel.isNullOrEmpty())
            bottomNavigationView.menu.removeItem(R.id.navigation_settings)
        //bottomNavigationView.menu.removeItem(R.id.navigation_notifications)

        bottomNavigationView.setupWithNavController(navController)
    }

//    override fun onSupportNavigateUp(): Boolean {
//        navController.navigateUp()
//        return true
//    }
    override fun openLoginActivity() {
        UiManager.startActivity(this@MainActivity, LoginActivity::class.java)
        finish()
    }
    override fun openFistTimeToLoginActivity() {
        UiManager.startActivity(this@MainActivity, PasswordActivity::class.java)
    }

    override fun onNavigationItemSelected(menu: Menu?): Any {
        TODO("Not yet implemented")
    }

    private fun subscribeToNavigationChanges(viewModel: MainViewModel) {

        // The activity observes the navigation commands in the ViewModel
        val activity = this@MainActivity
        viewModel.run {

            snackbarMessage.observe(activity, Observer { showMessage(getString(it.getContentIfNotHandled()!!)) })
            snackbarMessage2.observe(activity, Observer { showMessage(it) })

        }
    }
}