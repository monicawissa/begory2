package com.attendance.myproject.begory.presentationLayer.login

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.attendance.myproject.begory.Utilities.BaseActivity
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.Internet
import com.attendance.myproject.begory.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity() ,LoginNavigator{
    private lateinit var binding: ActivityLoginBinding
    private lateinit var loginViewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        if(!Internet.isOnline(applicationContext)) showMessage(getString(R.string.no_internet_connection))

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        loginViewModel = obtainViewModel()
        binding.loginViewModel
        subscribeToNavigationChanges(loginViewModel)

    }

    override fun openMainActivity() {
//        UiManager.startActivity(this@SplashActivity, MainActivity::class.java)
        finish()
    }

    override fun showMessage(string: String) {

    }
    private fun subscribeToNavigationChanges(viewModel: LoginViewModel) {

        // The activity observes the navigation commands in the ViewModel
        val activity = this@LoginActivity
        viewModel.run {
            isDataAvailable.observe(activity,
                    Observer {
                        if (it==true)openMainActivity()
                    })
            snackbarMessage.observe(activity, Observer { showMessage(getString(it.getContentIfNotHandled()!!)) })
            snackbarMessage2.observe(activity, Observer { showMessage(it) })
        }
    }
    fun obtainViewModel(): LoginViewModel = ViewModelProviders.of(this@LoginActivity).get(LoginViewModel::class.java)

//        findViewById<View>(R.id.btn_login).setOnClickListener {
//            val mNameEditText = findViewById<View>(R.id.et_username) as EditText
//            val PasswordEditText = findViewById<View>(R.id.et_password) as EditText
//            if (!TextUtils.isEmpty(mNameEditText.text.toString()) &&
//                    !TextUtils.isEmpty(PasswordEditText.text.toString())) {
//                try {
//                    Utils.hideKeyboard(this@LoginActivity)
//                    findViewById<View>(R.id.progressBar).visibility = View.VISIBLE
//                    val database = FirebaseDatabase.getInstance()
//                    val databaseReference = database.reference.child(Utils.getKey(this@LoginActivity))
//                            .child(FBConnenctions.CONST_ADMINS).orderByChild("adminName").equalTo(mNameEditText.text.toString())
//                    databaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
//                        override fun onDataChange(dataSnapshot: DataSnapshot) {
//                            try {
//                                findViewById<View>(R.id.progressBar).visibility = View.GONE
//                                val children = dataSnapshot.children
//                                var isFound = false
//                                for (child in children) {
//                                    val admin = child.getValue(Admin::class.java)!!
//                                    isFound = true
//                                    if (admin.isAccountActive) {
//                                        if (PasswordEditText.text.toString() != admin.adminPassword) {
//                                            Toast.makeText(applicationContext, R.string.wrong_password, Toast.LENGTH_SHORT).show()
//                                            return
//                                        } else {
//                                            Utils.saveAdmin(this@LoginActivity, admin)
//                                            UiManager.startHomeActivity(this@LoginActivity)
//                                            finish()
//                                        }
//                                    } else Toast.makeText(applicationContext, R.string.account_deactivated, Toast.LENGTH_SHORT).show()
//                                }
//                                if (!isFound) Toast.makeText(applicationContext, R.string.account_not_found, Toast.LENGTH_SHORT).show()
//                            } catch (e: Exception) {
//                                Log.e("Exception is", e.toString())
//                                findViewById<View>(R.id.progressBar).visibility = View.GONE
//                            }
//                        }
//
//                        override fun onCancelled(databaseError: DatabaseError) {
//                            findViewById<View>(R.id.progressBar).visibility = View.GONE
//                            Toast.makeText(applicationContext, R.string.error, Toast.LENGTH_SHORT).show()
//                        }
//                    })
//                } catch (e: Exception) {
//                    Log.e("Exception is", e.toString())
//                    findViewById<View>(R.id.progressBar).visibility = View.GONE
//                    Toast.makeText(applicationContext, R.string.error, Toast.LENGTH_SHORT).show()
//                }
//            } else Toast.makeText(applicationContext, R.string.fill_data, Toast.LENGTH_SHORT).show()
//        }
}