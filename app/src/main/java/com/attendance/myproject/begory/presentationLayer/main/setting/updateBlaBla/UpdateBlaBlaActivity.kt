package com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla

import android.content.ContentValues
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.data.Models.Level
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.databinding.ActivityUpdateblablaBinding
import com.androidbuts.multispinnerfilter.KeyPairBoolData

import com.attendance.myproject.begory.presentationLayer.main.setting.BaseActivity1
import dagger.hilt.android.AndroidEntryPoint
import java.util.*


@AndroidEntryPoint
class UpdateBlaBlaActivity : BaseActivity1() {
    private lateinit var binding: ActivityUpdateblablaBinding
    private val mLevelsList: ArrayList<Level> = ArrayList<Level>()
    val list = listOf(R.string.lev_college, R.string.lev_Grad)
//        val list = listOf(R.string.lev_KG,R.string.lev_1,R.string.lev_2,R.string.lev_3,R.string.lev_4
//                ,R.string.lev_5,R.string.lev_6,R.string.lev_preparatory,R.string.lev_secondary,R.string.lev_college, R.string.lev_Grad)

    private  val updateBlaBlaViewModel: UpdateBlaBlaViewModel by viewModels()
    override val layoutId: Int
        get() = R.layout.activity_updateblabla
    override fun initializeView() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(ContentValues.TAG, "showMessage: create UpdateBlaBla")
        binding = DataBindingUtil.setContentView(this, layoutId)
        val settingType=intent.getStringExtra(this.getString(R.string.settingType))
        binding.updateBlaBlaViewModel=updateBlaBlaViewModel
        binding.lifecycleOwner = this
        subscribeToNavigationChanges(updateBlaBlaViewModel)
        if(settingType==getString(R.string.m_edit_student))initLevelsSpinner()
        else initLevelsMultiSelectSpinner()
    }
    private fun initLevelsSpinner() {
        mLevelsList.clear()
        for(i in list){
        var level = Level(i, getString(i))
        mLevelsList.add(level)
        }
        val dataAdapter: ArrayAdapter<Level> = ArrayAdapter<Level>(this,
                android.R.layout.simple_spinner_item, mLevelsList)
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spLevels.adapter = dataAdapter
    }
    private fun initLevelsMultiSelectSpinner() {
        val mLevelsList: MutableList<KeyPairBoolData> = ArrayList()

        var t=1
        for(i in list){
            var level = KeyPairBoolData()
            level.id= i.toLong()
            t++
            level.name = getString(i)
            level.isSelected = false
            mLevelsList.add(level)
        }
        binding.multipleItemSelectionSpinner.setItems(mLevelsList)

    }

//    override fun openMainActivity() {
//        UiManager.startActivity(this@UpdateBlaBlaActivity, MainActivity::class.java)
//        finish()
//    }

    private fun subscribeToNavigationChanges(viewModel: UpdateBlaBlaViewModel) {

        // The activity observes the navigation commands in the ViewModel
        val activity = this@UpdateBlaBlaActivity
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