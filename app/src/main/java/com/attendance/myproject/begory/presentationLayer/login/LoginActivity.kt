package com.attendance.myproject.begory.presentationLayer.login

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.data.Models.Level
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper
import com.attendance.myproject.begory.databinding.ActivityLoginBinding
import com.attendance.myproject.begory.presentationLayer.BaseActivity
import com.attendance.myproject.begory.presentationLayer.main.MainActivity
import dagger.hilt.android.AndroidEntryPoint
import java.util.ArrayList

@AndroidEntryPoint
class LoginActivity : BaseActivity() ,LoginNavigator{
    private lateinit var binding: ActivityLoginBinding
    private  val loginViewModel: LoginViewModel by viewModels()
    override val layoutId: Int
        get() = R.layout.activity_login
    private val mLevelsList: ArrayList<Level> = ArrayList<Level>()
    private lateinit var  list :List<Int>

    override fun initializeView() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(ContentValues.TAG, "showMessage: create login")

        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.loginViewModel=loginViewModel
        binding.lifecycleOwner = this
        subscribeToNavigationChanges(loginViewModel)
        list=fillMenu()!!
        initLevelsSpinner()

    }
    private fun fillMenu(): List<Int>? {
        val mItems = ArrayList<Int>()
        mItems.clear()
        val v= AppPreferencesHelper (applicationContext)
        mItems.add(R.string.lev_college)
        mItems.add(R.string.lev_Grad)
        mItems.add(R.string.lev_Augustine)
        mItems.add(R.string.lev_Servant)
        return mItems.toList()
    }
    private fun initLevelsSpinner() {
        mLevelsList.clear()
        val level = Level(-1, getString(R.string.choose_level))
        mLevelsList.add(level)
        for(i in list){

            mLevelsList.add(Level(i, getString(i)))
        }
        val dataAdapter: ArrayAdapter<Level> = ArrayAdapter<Level>(this,
                android.R.layout.simple_spinner_item, mLevelsList)
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spLevels.adapter = dataAdapter
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