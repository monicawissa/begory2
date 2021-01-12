//package com.attendance.myproject.begory.presentationLayer.main.attendence
//
//import android.graphics.Color
//import android.graphics.drawable.ColorDrawable
//import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
//import android.support.v7.widget.GridLayoutManager
//import android.support.v7.widget.RecyclerView
//import android.util.Log
//import android.view.View
//import android.widget.AdapterView
//import android.widget.ArrayAdapter
//import android.widget.Spinner
//import android.widget.Toast
//import com.attendance.myproject.attendanceregister.R
//import com.attendance.myproject.attendanceregister.Utils.FBConnenctions
//import com.attendance.myproject.attendanceregister.Utils.Utils
//import com.attendance.myproject.attendanceregister.adapters.StudentResultAdapter
//import com.attendance.myproject.attendanceregister.beans.LevelItem
//import com.attendance.myproject.attendanceregister.beans.ResultItem
//import com.attendance.myproject.attendanceregister.beans.StudentItem
//import com.attendance.myproject.attendanceregister.beans.StudentWithResult
//import com.attendance.myproject.attendanceregister.beans.TermItem
//import com.attendance.myproject.attendanceregister.entites.Level
//import com.google.firebase.database.*
//import java.util.*
//
//class LevelResultActivity : AppCompatActivity() {
//    private val mStudentList: ArrayList<StudentItem> = ArrayList<StudentItem>()
//    private var mAdapter: StudentResultAdapter? = null
//    private val mStudentWithResultsList: ArrayList<StudentWithResult> = ArrayList<StudentWithResult>()
//    private var levelItem: LevelItem? = null
//    private var mLevelSpinner: Spinner? = null
//    private val mLevelsList: ArrayList<Level> = ArrayList<Level>()
//    protected fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_level_result)
//        getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        setTitle(R.string.m_add_results)
//        initLevelsSpinner()
//        initRecyclerView()
//        findViewById(R.id.btn_add).setOnClickListener(View.OnClickListener { if (mStudentWithResultsList.size > 0) onSave() })
//    }
//
//    private fun initLevelsSpinner() {
//        var level = Level()
//        level.setLevelId("-1")
//        level.setLevelName(getString(R.string.choose_level))
//        mLevelsList.add(level)
//        level = Level()
//        level.setLevelId(FBConnenctions.CONST_LEVEL_1)
//        level.setLevelName(getString(R.string.lev_1))
//        mLevelsList.add(level)
//        level = Level()
//        level.setLevelId(FBConnenctions.CONST_LEVEL_2)
//        level.setLevelName(getString(R.string.lev_2))
//        mLevelsList.add(level)
//        level = Level()
//        level.setLevelId(FBConnenctions.CONST_LEVEL_3)
//        level.setLevelName(getString(R.string.lev_3))
//        mLevelsList.add(level)
//        level = Level()
//        level.setLevelId(FBConnenctions.CONST_LEVEL_4)
//        level.setLevelName(getString(R.string.lev_4))
//        mLevelsList.add(level)
//        level = Level()
//        level.setLevelId(FBConnenctions.CONST_LEVEL_5)
//        level.setLevelName(getString(R.string.lev_5))
//        mLevelsList.add(level)
//        level = Level()
//        level.setLevelId(FBConnenctions.CONST_LEVEL_6)
//        level.setLevelName(getString(R.string.lev_6))
//        mLevelsList.add(level)
//        mLevelSpinner = findViewById(R.id.sp_levels) as Spinner?
//        val dataAdapter: ArrayAdapter<Level> = ArrayAdapter<Level>(this@LevelResultActivity,
//                android.R.layout.simple_spinner_item, mLevelsList)
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        mLevelSpinner!!.adapter = dataAdapter
//        mLevelSpinner!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(adapterView: AdapterView<*>?, view: View, i: Int, l: Long) {
//                if (mLevelSpinner!!.selectedItemPosition > 0) {
//                    mStudentList.clear()
//                    mStudentWithResultsList.clear()
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
//        mAdapter = StudentResultAdapter(this, mStudentWithResultsList)
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
//            if (mStudentList[i].getStudentRes() == null) {
//                setEmptyResult(i)
//            } else {
//                val studentWithResult = StudentWithResult()
//                studentWithResult.setId(mStudentList[i].getId())
//                studentWithResult.setName(mStudentList[i].getName())
//                studentWithResult.setResultItem(mStudentList[i].getStudentRes())
//                mStudentWithResultsList.add(studentWithResult)
//            }
//        }
//        mAdapter.notifyDataSetChanged()
//    }
//
//    private fun setEmptyResult(index: Int) {
//        val studentWithResult = StudentWithResult()
//        studentWithResult.setId(mStudentList[index].getId())
//        studentWithResult.setName(mStudentList[index].getName())
//        val resultItem = ResultItem()
//        var termItem = TermItem()
//        termItem.setsSubGrade(-1)
//        termItem.setfSubGrade(-1)
//        resultItem.setfTerm(termItem)
//        termItem = TermItem()
//        termItem.setsSubGrade(-1)
//        termItem.setfSubGrade(-1)
//        resultItem.setsTerm(termItem)
//        termItem = TermItem()
//        termItem.setsSubGrade(-1)
//        termItem.setfSubGrade(-1)
//        resultItem.settTerm(termItem)
//        resultItem.setTotalGrade(-1)
//        studentWithResult.setResultItem(resultItem)
//        mStudentWithResultsList.add(studentWithResult)
//    }
//
//    private fun onSave() {
//        for (i in mStudentList.indices) {
//            mStudentList[i].setStudentRes(mStudentWithResultsList[i].getResultItem())
//        }
//
//        //here save data to database
//        add()
//    }
//
//    private fun add() {
//        findViewById(R.id.progressBar).setVisibility(View.VISIBLE)
//        val mDatabase = FirebaseDatabase.getInstance().reference.child(Utils.getKey(this))
//        val databaseReference = mDatabase.child((mLevelSpinner!!.selectedItem as Level).getLevelId())
//        levelItem.setId((mLevelSpinner!!.selectedItem as Level).getLevelId())
//        levelItem.setStudents(mStudentList)
//        databaseReference.setValue(levelItem).addOnSuccessListener { // Write was successful!
//            // ...
//            findViewById(R.id.progressBar).setVisibility(View.GONE)
//            Toast.makeText(getApplicationContext(), R.string.added, Toast.LENGTH_SHORT).show()
//            finish()
//        }
//                .addOnFailureListener { // Write failed
//                    // ...
//                    findViewById(R.id.progressBar).setVisibility(View.GONE)
//                    Toast.makeText(getApplicationContext(), R.string.error, Toast.LENGTH_SHORT).show()
//                }
//    }
//}