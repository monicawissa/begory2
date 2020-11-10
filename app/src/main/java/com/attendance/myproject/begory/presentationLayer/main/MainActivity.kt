package com.attendance.myproject.begory.presentationLayer.main

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.activity.viewModels
import androidx.annotation.NonNull
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.databinding.ActivityMainBinding
import com.attendance.myproject.begory.presentationLayer.BaseActivity
import com.attendance.myproject.begory.presentationLayer.login.LoginActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : BaseActivity() , MainNavigator {
    private lateinit var binding: ActivityMainBinding
    private  val mainViewModel: MainViewModel by viewModels()
    private lateinit var navController: NavController



    override val layoutId: Int
        get() = R.layout.activity_main

    override fun initializeView() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        Log.d(ContentValues.TAG, "showMessage: create Main")

        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.mainViewModel=mainViewModel
        binding.lifecycleOwner = this
        subscribeToNavigationChanges(mainViewModel)
        //nav
        navController = findNavController(R.id.nav_host_fragment)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        bottomBar.setupWithNavController(menu!!,navController)
        return true
    }
//    override fun onSupportNavigateUp(): Boolean {
//        navController.navigateUp()
//        return true
//    }
    override fun openLoginActivity() {
        UiManager.startActivity(this@MainActivity, LoginActivity::class.java)
        finish()
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