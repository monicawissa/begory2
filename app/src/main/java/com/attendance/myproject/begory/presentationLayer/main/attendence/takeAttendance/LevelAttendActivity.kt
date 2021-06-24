package com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance

import android.app.DatePickerDialog
import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.databinding.ActivityLevelAttendanceBinding

import com.attendance.myproject.begory.presentationLayer.main.setting.BaseActivity1
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*


@AndroidEntryPoint
class LevelAttendActivity : BaseActivity1() {
    private lateinit var binding: ActivityLevelAttendanceBinding
    private  val levelAttendViewModel: LevelAttendViewModel by viewModels()
    var recyclerViewAdapter: StudentAttendanceAdapter? = null
    lateinit var  settingType:String

    private var myCalendar: Calendar? = null


    override val layoutId: Int
        get() = R.layout.activity_level_attendance
    override fun initializeView() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(ContentValues.TAG, "showMessage: create UpdateBlaBla")
        binding = DataBindingUtil.setContentView(this, layoutId)
//        settingType= intent.getIntExtra(this.getString(R.string.settingType),0).toString()
        binding.levelAttendViewModel=levelAttendViewModel
        binding.lifecycleOwner = this
        // TODO: change id
        (binding.rvAttendance as (RecyclerView)).setHasFixedSize(true)
        //TODO: Choose your layout
        //GridLayout
        val gridLayoutManager: GridLayoutManager = GridLayoutManager(this, 1)
        binding.rvAttendance.layoutManager = gridLayoutManager
        init()
        subscribeToNavigationChanges(levelAttendViewModel)
    }
    private fun initRecyclerView( ) {
        recyclerViewAdapter = StudentAttendanceAdapter(this, levelAttendViewModel.mListLast)
        binding.rvAttendance.adapter = recyclerViewAdapter
        recyclerViewAdapter!!.notifyDataSetChanged()
        binding.rvAttendance.smoothScrollToPosition(0)
    }
    private fun init() {
        myCalendar = Calendar.getInstance()
        val date = DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth -> // TODO Auto-generated method stub
            myCalendar!!.set(Calendar.YEAR, year)
            myCalendar!!.set(Calendar.MONTH, monthOfYear)
            myCalendar!!.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            updateLabel()
        }
        (binding.etDate!! as EditText).setOnClickListener(View.OnClickListener {
//            if (levelAttendViewModel.mSelectedTermId == 0) {
//                Toast.makeText(applicationContext, R.string.choose_term, Toast.LENGTH_LONG).show()
//                return@OnClickListener
//            }
            DatePickerDialog(this@LevelAttendActivity, date, myCalendar!!
                    .get(Calendar.YEAR), myCalendar!!.get(Calendar.MONTH),
                    myCalendar!!.get(Calendar.DAY_OF_MONTH)).show()
        })
//        binding.rgTerms!!.setOnCheckedChangeListener { radioGroup, id -> levelAttendViewModel.mSelectedTermId = if (id == binding.rbTerm1.id) 1 else 2  }
//        //Todo

    }

//    override fun openMainActivity() {
//        UiManager.startActivity(this@UpdateBlaBlaActivity, MainActivity::class.java)
//        finish()
//    }
    private fun updateLabel() {
        val myFormat = "dd-MM-YYYY" //In which you need put here
        val sdf = SimpleDateFormat(myFormat, Locale.US)
        binding.etDate!!.setText(sdf.format(myCalendar!!.time))
        levelAttendViewModel.mSelectedDate = binding.etDate!!.text.toString()
        levelAttendViewModel.mStudentList.clear()
        levelAttendViewModel.mListLast.clear()
        initRecyclerView()
//        for (i in 0 until binding.rgTerms!!.childCount) {
//            (binding.rgTerms!!.getChildAt(i) as RadioButton).isEnabled = false
//        }

        levelAttendViewModel.getStudentList()
    }
    private fun subscribeToNavigationChanges(viewModel: LevelAttendViewModel) {

        // The activity observes the navigation commands in the ViewModel
        val activity = this@LevelAttendActivity
        viewModel.run {
            ishideKeyboard.observe(activity,
                    Observer {
                        if (it == true) hide_Keyboard()
                    })
            isclose.observe(activity,{if(it)finish()})
            mStudentAttendancesList.observe(activity, Observer {if (it == true) initRecyclerView()})
            snackbarMessage.observe(activity, Observer { showMessage(getString(it.getContentIfNotHandled()!!)) })
            snackbarMessage2.observe(activity, Observer { showMessage(it) })

        }
    }
}