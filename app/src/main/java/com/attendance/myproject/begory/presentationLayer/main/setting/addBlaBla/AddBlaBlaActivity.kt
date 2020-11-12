package com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla

import android.content.ContentValues
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.androidbuts.multispinnerfilter.KeyPairBoolData
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.data.Models.Level
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.databinding.ActivityAddBlablaBinding
import com.attendance.myproject.begory.presentationLayer.main.setting.BaseActivity1
import dagger.hilt.android.AndroidEntryPoint
import java.util.*


@AndroidEntryPoint
class AddBlaBlaActivity : BaseActivity1() ,AddBlaBlaNavigator{
    private lateinit var binding: ActivityAddBlablaBinding
    private val mLevelsList: ArrayList<Level> = ArrayList<Level>()
    val list = listOf(R.string.lev_college, R.string.lev_Grad)
//        val list = listOf(R.string.lev_KG,R.string.lev_1,R.string.lev_2,R.string.lev_3,R.string.lev_4
//                ,R.string.lev_5,R.string.lev_6,R.string.lev_preparatory,R.string.lev_secondary,R.string.lev_college, R.string.lev_Grad)

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
        initLevelsMultiSelectSpinner()
        addBlaBlaViewModel.mTitleTV = intent.getStringExtra(this.getString(R.string.settingType))
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
        for(i in list){
            var level = KeyPairBoolData()
            level.id= R.string.lev_college.toLong()
            level.name = getString(R.string.lev_college)
            level.isSelected = false
            mLevelsList.add(level)
        }
        binding.multipleItemSelectionSpinner.setItems(mLevelsList) { items ->
            //The followings are selected items.
            var str:String =""
            for (i in 0 until items.size) {
                str+=FirebaseFilterType.fbConvert(items[i].id.toInt())
            }
            addBlaBlaViewModel.selectedItems=str
        }
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