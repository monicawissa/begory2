//package com.attendance.myproject.begory.presentationLayer.main.setting
//
//import android.graphics.Color
//import android.graphics.drawable.ColorDrawable
//import android.os.Bundle
//import android.util.Log
//import android.view.View
//import android.widget.*
//import androidx.appcompat.app.AppCompatActivity
//import com.attendance.myproject.begory.data.Models.Level
//import com.google.firebase.database.*
//import java.util.*
//
//class ShowLevelAttendanceActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {
//    private val mStudentList: ArrayList<StudentItem> = ArrayList<StudentItem>()
//    private var mAdapter: StudentAttendanceCountAdapter? = null
//    private val mStudentAttendancesList: ArrayList<StudentWithTotalAttendanceCount> = ArrayList<StudentWithTotalAttendanceCount>()
//    private var levelItem: LevelItem? = null
//    private var mLevelSpinner: Spinner? = null
//    private val mLevelsList: ArrayList<Level> = ArrayList<Level>()
//    private var mTerm1CheckBox: CheckBox? = null
//    private var mTerm2CheckBox: CheckBox? = null
//    private var mTerm3CheckBox: CheckBox? = null
//    protected fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_show_level_attendance)
//        getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        setTitle(R.string.m_level_attendance)
//        mTerm1CheckBox = findViewById(R.id.cb_term1)
//        mTerm2CheckBox = findViewById(R.id.cb_term2)
//        mTerm3CheckBox = findViewById(R.id.cb_term3)
//        mTerm1CheckBox!!.setOnCheckedChangeListener(this)
//        mTerm2CheckBox!!.setOnCheckedChangeListener(this)
//        mTerm3CheckBox!!.setOnCheckedChangeListener(this)
//        initRecyclerView()
//        initLevelsSpinner()
//    }
//
//    private fun initLevelsSpinner() {
//        var level = Level()
//        level.setLevelId("-1")
//        level.setLevelName(getString(R.string.choose_level))
//        mLevelsList.add(level)
//        val mAdmin: Admin = Utils.getAdmin(this)
//        if (mAdmin.isMainAdmin()) {
//            level = Level()
//            level.setLevelId(FBConnenctions.CONST_LEVEL_1)
//            level.setLevelName(getString(R.string.lev_1))
//            mLevelsList.add(level)
//            level = Level()
//            level.setLevelId(FBConnenctions.CONST_LEVEL_2)
//            level.setLevelName(getString(R.string.lev_2))
//            mLevelsList.add(level)
//            level = Level()
//            level.setLevelId(FBConnenctions.CONST_LEVEL_3)
//            level.setLevelName(getString(R.string.lev_3))
//            mLevelsList.add(level)
//            level = Level()
//            level.setLevelId(FBConnenctions.CONST_LEVEL_4)
//            level.setLevelName(getString(R.string.lev_4))
//            mLevelsList.add(level)
//            level = Level()
//            level.setLevelId(FBConnenctions.CONST_LEVEL_5)
//            level.setLevelName(getString(R.string.lev_5))
//            mLevelsList.add(level)
//            level = Level()
//            level.setLevelId(FBConnenctions.CONST_LEVEL_6)
//            level.setLevelName(getString(R.string.lev_6))
//            mLevelsList.add(level)
//        } else {
//            if (mAdmin.getLevels() != null) {
//                for (i in 0 until mAdmin.getLevels().size()) {
//                    if (mAdmin.getLevels().get(i).isSelected()) {
//                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_1)) {
//                            level = Level()
//                            level.setLevelId(FBConnenctions.CONST_LEVEL_1)
//                            level.setLevelName(getString(R.string.lev_1))
//                            mLevelsList.add(level)
//                        }
//                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_2)) {
//                            level = Level()
//                            level.setLevelId(FBConnenctions.CONST_LEVEL_2)
//                            level.setLevelName(getString(R.string.lev_2))
//                            mLevelsList.add(level)
//                        }
//                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_3)) {
//                            level = Level()
//                            level.setLevelId(FBConnenctions.CONST_LEVEL_3)
//                            level.setLevelName(getString(R.string.lev_3))
//                            mLevelsList.add(level)
//                        }
//                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_4)) {
//                            level = Level()
//                            level.setLevelId(FBConnenctions.CONST_LEVEL_4)
//                            level.setLevelName(getString(R.string.lev_4))
//                            mLevelsList.add(level)
//                        }
//                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_5)) {
//                            level = Level()
//                            level.setLevelId(FBConnenctions.CONST_LEVEL_5)
//                            level.setLevelName(getString(R.string.lev_5))
//                            mLevelsList.add(level)
//                        }
//                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_6)) {
//                            level = Level()
//                            level.setLevelId(FBConnenctions.CONST_LEVEL_6)
//                            level.setLevelName(getString(R.string.lev_6))
//                            mLevelsList.add(level)
//                        }
//                    }
//                }
//            }
//        }
//        mLevelSpinner = findViewById(R.id.sp_levels) as Spinner?
//        val dataAdapter: ArrayAdapter<Level> = ArrayAdapter<Level>(this@ShowLevelAttendanceActivity,
//                android.R.layout.simple_spinner_item, mLevelsList)
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        mLevelSpinner!!.adapter = dataAdapter
//        mLevelSpinner!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(adapterView: AdapterView<*>?, view: View, i: Int, l: Long) {
//                if (mLevelSpinner!!.selectedItemPosition > 0) {
//                    mStudentList.clear()
//                    mStudentAttendancesList.clear()
//                    mAdapter.notifyDataSetChanged()
//                    studentsList
//                }
//            }
//
//            override fun onNothingSelected(adapterView: AdapterView<*>?) {}
//        }
//    }
//
//    private fun initRecyclerView() {
//        val mRecyclerView: RecyclerView = findViewById(R.id.rv_attendance) as RecyclerView
//
//        // use this setting to improve performance if you know that changes
//        // in content do not change the layout size of the RecyclerView
//        mRecyclerView.setHasFixedSize(true)
//
//        // use a linear layout manager
//        val mLayoutManager = GridLayoutManager(this, 1)
//        mRecyclerView.setLayoutManager(mLayoutManager)
//        mAdapter = StudentAttendanceCountAdapter(this, mStudentAttendancesList, mTerm1CheckBox, mTerm2CheckBox, mTerm3CheckBox)
//        mRecyclerView.setAdapter(mAdapter)
//    }
//
//    private val studentsList: Unit
//        private get() {
//            findViewById(R.id.progressBar).setVisibility(View.VISIBLE)
//            try {
//                val database = FirebaseDatabase.getInstance()
//                val databaseReference = database.reference.child(Utils.getKey(this)).child((mLevelSpinner!!.selectedItem as Level).getLevelId())
//                databaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
//                    override fun onDataChange(dataSnapshot: DataSnapshot) {
//                        try {
//                            findViewById(R.id.progressBar).setVisibility(View.GONE)
//                            levelItem = dataSnapshot.getValue(LevelItem::class.java)
//                            if (levelItem.getStudents() != null) {
//                                mStudentList.addAll(levelItem.getStudents())
//                                manageStudentWithAttendance()
//                            }
//                        } catch (e: Exception) {
//                            Log.e("Exception is", e.toString())
//                        }
//                    }
//
//                    override fun onCancelled(databaseError: DatabaseError) {}
//                })
//            } catch (e: Exception) {
//                Log.e("Exception is", e.toString())
//            }
//        }
//
//    private fun manageStudentWithAttendance() {
//        for (i in mStudentList.indices) {
//            val studentWithAttendance = StudentWithTotalAttendanceCount()
//            studentWithAttendance.setId(mStudentList[i].getId())
//            studentWithAttendance.setName(mStudentList[i].getName())
//            if (mStudentList[i].getAttendanceItems() == null || mStudentList[i].getAttendanceItems().size() === 0) {
//                studentWithAttendance.setHesaAttendanceTotalCountTerm1(0)
//                studentWithAttendance.setHesaAttendanceTotalCountTerm2(0)
//                studentWithAttendance.setHesaAttendanceTotalCountTerm3(0)
//                studentWithAttendance.setKodasAttendanceTotalCountTerm1(0)
//                studentWithAttendance.setKodasAttendanceTotalCountTerm2(0)
//                studentWithAttendance.setKodasAttendanceTotalCountTerm3(0)
//                studentWithAttendance.setHesaTotalCountTerm1(0)
//                studentWithAttendance.setHesaTotalCountTerm2(0)
//                studentWithAttendance.setHesaTotalCountTerm3(0)
//                studentWithAttendance.setKodasTotalCountTerm1(0)
//                studentWithAttendance.setKodasTotalCountTerm2(0)
//                studentWithAttendance.setKodasTotalCountTerm3(0)
//            } else {
//                for (n in 0 until mStudentList[i].getAttendanceItems().size()) {
//                    val attendanceItem: AttendanceItem = mStudentList[i].getAttendanceItems().get(n)
//                    if (attendanceItem.getTermId() === 1) {
//                        studentWithAttendance.setHesaTotalCountTerm1(studentWithAttendance.getHesaTotalCountTerm1() + 1)
//                        studentWithAttendance.setKodasTotalCountTerm1(studentWithAttendance.getKodasTotalCountTerm1() + 1)
//                        if (attendanceItem.isAlhan()) studentWithAttendance.setKodasAttendanceTotalCountTerm1(studentWithAttendance.getKodasAttendanceTotalCountTerm1() + 1)
//                        if (attendanceItem.isHesa()) studentWithAttendance.setHesaAttendanceTotalCountTerm1(studentWithAttendance.getHesaAttendanceTotalCountTerm1() + 1)
//                    } else if (attendanceItem.getTermId() === 2) {
//                        studentWithAttendance.setHesaTotalCountTerm2(studentWithAttendance.getHesaTotalCountTerm2() + 1)
//                        studentWithAttendance.setKodasTotalCountTerm2(studentWithAttendance.getKodasTotalCountTerm2() + 1)
//                        if (attendanceItem.isAlhan()) studentWithAttendance.setKodasAttendanceTotalCountTerm2(studentWithAttendance.getKodasAttendanceTotalCountTerm2() + 1)
//                        if (attendanceItem.isHesa()) studentWithAttendance.setHesaAttendanceTotalCountTerm2(studentWithAttendance.getHesaAttendanceTotalCountTerm2() + 1)
//                    } else {
//                        studentWithAttendance.setHesaTotalCountTerm3(studentWithAttendance.getHesaTotalCountTerm3() + 1)
//                        studentWithAttendance.setKodasTotalCountTerm3(studentWithAttendance.getKodasTotalCountTerm3() + 1)
//                        if (attendanceItem.isAlhan()) studentWithAttendance.setKodasAttendanceTotalCountTerm3(studentWithAttendance.getKodasAttendanceTotalCountTerm3() + 1)
//                        if (attendanceItem.isHesa()) studentWithAttendance.setHesaAttendanceTotalCountTerm3(studentWithAttendance.getHesaAttendanceTotalCountTerm3() + 1)
//                    }
//                }
//            }
//            mStudentAttendancesList.add(studentWithAttendance)
//        }
//        mAdapter.notifyDataSetChanged()
//    }
//
//    override fun onCheckedChanged(compoundButton: CompoundButton, b: Boolean) {
//        mAdapter.notifyDataSetChanged()
//    }
//}