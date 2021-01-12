package com.attendance.myproject.begory.presentationLayer.main.setting.userExist

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.databinding.ActivityUserBinding

import com.attendance.myproject.begory.presentationLayer.main.setting.BaseActivity1
import com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla.UpdateBlaBlaActivity
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class UserActivity : BaseActivity1() {
    private lateinit var binding: ActivityUserBinding
    private  val userViewModel: UserViewModel by viewModels()
    lateinit var  settingType:String
    override val layoutId: Int
        get() = R.layout.activity_user
    override fun initializeView() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(ContentValues.TAG, "showMessage: create UpdateBlaBla")
        binding = DataBindingUtil.setContentView(this, layoutId)
        settingType=intent.getStringExtra(this.getString(R.string.settingType))
        binding.userViewModel=userViewModel
        binding.lifecycleOwner = this
        subscribeToNavigationChanges(userViewModel)
    }

//    override fun openMainActivity() {
//        UiManager.startActivity(this@UpdateBlaBlaActivity, MainActivity::class.java)
//        finish()
//    }

    private fun subscribeToNavigationChanges(viewModel: UserViewModel) {

        // The activity observes the navigation commands in the ViewModel
        val activity = this@UserActivity
        viewModel.run {
            ishideKeyboard.observe(activity,
                    Observer {
                        if (it == true) hide_Keyboard()
                    })
            snackbarMessage.observe(activity, Observer { showMessage(getString(it.getContentIfNotHandled()!!)) })
            snackbarMessage2.observe(activity, Observer { showMessage(it) })
            isCheckStatus.observe(activity, Observer {
                UiManager.startActivity(applicationContext, UpdateBlaBlaActivity::class.java, applicationContext.getString(R.string.userType), usertmp,
                        getString(R.string.settingType),settingType)
                finish()
            })
        }
    }
}