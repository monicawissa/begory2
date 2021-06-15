package com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.data.Models.Level
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper
import com.attendance.myproject.begory.databinding.ActivityShowRankBinding
import com.attendance.myproject.begory.presentationLayer.main.setting.BaseActivity1
import dagger.hilt.android.AndroidEntryPoint
import java.util.*


@AndroidEntryPoint
class ShowGiftBookedActivity : BaseActivity1() , CompoundButton.OnCheckedChangeListener{
    private lateinit var binding: ActivityShowRankBinding
    private val mLevelsList: ArrayList<Level> = ArrayList<Level>()
    private lateinit var  list :List<Int>

    private  val showGiftBookedViewModel: ShowGiftBookedViewModel by viewModels()
    var recyclerViewAdapter: ShowGiftBookedAdapter? = null
    lateinit var  settingType:String

    override val layoutId: Int
        get() = R.layout.activity_show_rank
    override fun initializeView() {
    }
    private fun fillMenu(): List<Int>? {
        val mItems = ArrayList<Int>()
        mItems.clear()
        val v= AppPreferencesHelper (applicationContext)
        val user=v.getUser()
        if((user!!.subAdminLevel.toString()).contains((FirebaseFilterType.LevelFilterType.College).toString())||
                (user.adminLevel.toString()).contains((FirebaseFilterType.LevelFilterType.College).toString()))
            mItems.add(R.string.lev_college)
        if((user.subAdminLevel.toString()).contains((FirebaseFilterType.LevelFilterType.Grad).toString())||
                (user.adminLevel.toString()).contains((FirebaseFilterType.LevelFilterType.Grad).toString()))
            mItems.add(R.string.lev_Grad)
        if((user.subAdminLevel.toString()).contains((FirebaseFilterType.LevelFilterType.Augustine).toString())||
                (user.adminLevel.toString()).contains((FirebaseFilterType.LevelFilterType.Augustine).toString()))
            mItems.add(R.string.lev_Augustine)
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(ContentValues.TAG, "showMessage: create UpdateBlaBla")
        binding = DataBindingUtil.setContentView(this, layoutId)
//        settingType= intent.getIntExtra(this.getString(R.string.settingType),0).toString()
        binding.showGiftBookedViewModel=showGiftBookedViewModel
        binding.lifecycleOwner = this
        list=fillMenu()!!
        // TODO: change id
        binding.rvAttendance.setHasFixedSize(true)
        //TODO: Choose your layout
        //GridLayout
        val gridLayoutManager: GridLayoutManager = GridLayoutManager(this, 1)
        binding.rvAttendance.layoutManager = gridLayoutManager
        initLevelsSpinner()
        subscribeToNavigationChanges(showGiftBookedViewModel)
    }
    private fun initRecyclerView( ) {
        //if()
        recyclerViewAdapter = ShowGiftBookedAdapter(this, showGiftBookedViewModel.mListLast)
        binding.rvAttendance.adapter = recyclerViewAdapter
        recyclerViewAdapter!!.notifyDataSetChanged()
        binding.rvAttendance.smoothScrollToPosition(0)
    }

    override fun onCheckedChanged(compoundButton: CompoundButton?, b: Boolean) {
        initRecyclerView()
    }

    //    override fun openMainActivity() {
//        UiManager.startActivity(this@UpdateBlaBlaActivity, MainActivity::class.java)
//        finish()
//    }
    private fun subscribeToNavigationChanges(viewModelShow: ShowGiftBookedViewModel) {

        // The activity observes the navigation commands in the ViewModel
        val activity = this@ShowGiftBookedActivity
        viewModelShow.run {
            ishideKeyboard.observe(activity,
                    Observer {
                        if (it == true) hide_Keyboard()
                    })
            mStudentAttendancesList.observe(activity, Observer { if (it == true) initRecyclerView() })
            snackbarMessage.observe(activity, Observer { showMessage(getString(it.getContentIfNotHandled()!!)) })
            snackbarMessage2.observe(activity, Observer { showMessage(it) })
        }
    }
}