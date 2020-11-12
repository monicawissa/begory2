package com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla

import android.content.ContentValues
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.data.Models.Level
import com.attendance.myproject.begory.databinding.ActivityAddBlablaBinding
import com.attendance.myproject.begory.presentationLayer.main.MainActivity
import com.attendance.myproject.begory.presentationLayer.main.setting.BaseActivity1
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

@AndroidEntryPoint
class AddBlaBlaActivity : BaseActivity1() ,AddBlaBlaNavigator{
    private lateinit var binding: ActivityAddBlablaBinding
    private val mLevelsList: ArrayList<Level> = ArrayList<Level>()

    private  val addBlaBlaViewModel: AddBlaBlaViewModel by viewModels()
    override val layoutId: Int
        get() = R.layout.activity_add_blabla

    override fun initializeView() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(ContentValues.TAG, "showMessage: create addBlaBla")
        window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.addBlaBlaViewModel=addBlaBlaViewModel
        binding.lifecycleOwner = this
        subscribeToNavigationChanges(addBlaBlaViewModel)
        initLevelsSpinner()

    }
    private fun initLevelsSpinner() {
        var level = Level(R.string.lev_college,getString(R.string.lev_college))
        mLevelsList.add(level)
        level = Level(R.string.lev_Grad,getString(R.string.lev_Grad))
        mLevelsList.add(level)
//        level = Level(R.string.lev_KG,getString(R.string.lev_KG))
//        mLevelsList.add(level)
//        level = Level(R.string.lev_1,getString(R.string.lev_1))
//        mLevelsList.add(level)
//        level = Level(R.string.lev_2,getString(R.string.lev_2))
//        mLevelsList.add(level)
//        level = Level(R.string.lev_3,getString(R.string.lev_3))
//        mLevelsList.add(level)
//        level = Level(R.string.lev_4,getString(R.string.lev_4))
//        mLevelsList.add(level)
//        level = Level(R.string.lev_5,getString(R.string.lev_5))
//        mLevelsList.add(level)
//        level = Level(R.string.lev_6,getString(R.string.lev_6))
//        mLevelsList.add(level)
//        level = Level(R.string.lev_preparatory,getString(R.string.lev_preparatory))
//        mLevelsList.add(level)
//        level = Level(R.string.lev_secondary,getString(R.string.lev_secondary))
//        mLevelsList.add(level)
        binding.spLevels
        val dataAdapter: ArrayAdapter<Level> = ArrayAdapter<Level>(this,
                android.R.layout.simple_spinner_item, mLevelsList)
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spLevels.adapter = dataAdapter
    }
//    override fun openMainActivity() {
//        UiManager.startActivity(this@AddBlaBlaActivity, MainActivity::class.java)
//        finish()
//    }

    private fun subscribeToNavigationChanges(viewModel: AddBlaBlaViewModel) {

        // The activity observes the navigation commands in the ViewModel
        val activity = this@AddBlaBlaActivity
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