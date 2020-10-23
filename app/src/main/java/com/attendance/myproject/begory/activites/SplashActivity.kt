package com.attendance.myproject.begory.activites

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.UiManager

class SplashActivity : AppCompatActivity() {
    private var handler: Handler? = null
    private val SPLASH_DELAY: Long = 3000

    private val runnable: Runnable = Runnable {
        if (!isFinishing) {
            UiManager.startActivity(this@SplashActivity,LoginActivity::class.java)
            finish()
        }
    }


    private fun checkInternet()=
            if (Internet.isOnline(this)) {
                // Toast.makeText(this, getString(R.string.connected), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, getString(R.string.no_internet_connection), Toast.LENGTH_LONG).show()
            }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        checkInternet()

        handler = Handler()
        handler!!.postDelayed(runnable, SPLASH_DELAY)
    }
}