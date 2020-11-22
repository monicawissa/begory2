package com.attendance.myproject.begory.presentationLayer.main.changePassword

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.databinding.ActivityPasswordBinding

import com.attendance.myproject.begory.presentationLayer.main.setting.BaseActivity1
import com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla.UpdateBlaBlaActivity
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class PasswordActivity : BaseActivity1() {
    private lateinit var binding: ActivityPasswordBinding
    private  val passwordViewModel: PasswordViewModel by viewModels()
    override val layoutId: Int
        get() = R.layout.activity_password
    override fun initializeView() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(ContentValues.TAG, "showMessage: create UpdateBlaBla")
        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.passwordViewModel=passwordViewModel
        binding.lifecycleOwner = this
        subscribeToNavigationChanges(passwordViewModel)
    }

//    override fun openMainActivity() {
//        UiManager.startActivity(this@UpdateBlaBlaActivity, MainActivity::class.java)
//        finish()
//    }

    private fun subscribeToNavigationChanges(viewModel: PasswordViewModel) {

        // The activity observes the navigation commands in the ViewModel
        val activity = this@PasswordActivity
        viewModel.run {
            ishideKeyboard.observe(activity,
                    Observer {
                        if (it == true) hide_Keyboard()
                    })
            snackbarMessage.observe(activity, Observer { showMessage(getString(it.getContentIfNotHandled()!!)) })
            snackbarMessage2.observe(activity, Observer { showMessage(it) })
        }
    }
}