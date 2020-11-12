//package com.attendance.myproject.begory.presentationLayer.main.attendence
//
//import android.app.DatePickerDialog
//import android.app.DatePickerDialog.OnDateSetListener
//import android.graphics.Color
//import android.graphics.drawable.ColorDrawable
//import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
//import android.support.v7.widget.GridLayoutManager
//import android.support.v7.widget.RecyclerView
//import android.util.Log
//import android.view.View
//import android.widget.EditText
//import android.widget.RadioButton
//import android.widget.RadioGroup
//import android.widget.Toast
//import com.attendance.myproject.attendanceregister.R
//import com.attendance.myproject.attendanceregister.Utils.FBConnenctions
//import com.attendance.myproject.attendanceregister.Utils.Utils
//import com.attendance.myproject.attendanceregister.adapters.StudentAttendanceAdapter
//import com.attendance.myproject.attendanceregister.beans.AttendanceItem
//import com.attendance.myproject.attendanceregister.beans.LevelItem
//import com.attendance.myproject.attendanceregister.beans.StudentItem
//import com.attendance.myproject.attendanceregister.beans.StudentWithAttendance
//import com.google.firebase.database.*
//import java.text.SimpleDateFormat
//import java.util.*
//
//class LevelAttendanceActivity : AppCompatActivity() {
//    private val mStudentList: ArrayList<StudentItem> = ArrayList<StudentItem>()
//    private var mAdapter: StudentAttendanceAdapter? = null
//    private val mStudentAttendancesList: ArrayList<StudentWithAttendance> = ArrayList<StudentWithAttendance>()
//    private var mSelectedDate: String? = null
//    private var mSelectedTermId = 0
//    private var levelItem: LevelItem? = null
//    private var myCalendar: Calendar? = null
//    private var mDateEditText: EditText? = null
//    private var mTermsRadioGroup: RadioGroup? = null
//    private var mLevelKey = ""
//    protected fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_level_attendance)
//        getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        val level: String = getIntent().getStringExtra("level")
//        mLevelKey = level
//        screenTitle(level)
//        initRecyclerView()
//        myCalendar = Calendar.getInstance()
//        mTermsRadioGroup = findViewById(R.id.rg_terms)
//        mDateEditText = findViewById(R.id.et_date) as EditText?
//        val date = OnDateSetListener { view, year, monthOfYear, dayOfMonth -> // TODO Auto-generated method stub
//            myCalendar.set(Calendar.YEAR, year)
//            myCalendar.set(Calendar.MONTH, monthOfYear)
//            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
//            updateLabel()
//        }
//        mDateEditText!!.setOnClickListener(View.OnClickListener {
//            if (mSelectedTermId == 0) {
//                Toast.makeText(getApplicationContext(), R.string.choose_term, Toast.LENGTH_LONG).show()
//                return@OnClickListener
//            }
//            DatePickerDialog(this@LevelAttendanceActivity, date, myCalendar
//                    .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
//                    myCalendar.get(Calendar.DAY_OF_MONTH)).show()
//        })
//        mTermsRadioGroup!!.setOnCheckedChangeListener { radioGroup, id -> mSelectedTermId = if (id == R.id.rb_term1) 1 else if (id == R.id.rb_term2) 2 else 3 }
//        findViewById(R.id.btn_add).setOnClickListener(View.OnClickListener { if (mSelectedDate != null && mSelectedTermId > 0 && mStudentAttendancesList.size > 0) onSave() })
//    }
//
//    private fun screenTitle(level: String) {
//        if (level == FBConnenctions.CONST_LEVEL_1) {
//            setTitle(R.string.a_lev_1)
//        } else if (level == FBConnenctions.CONST_LEVEL_2) {
//            setTitle(R.string.a_lev_2)
//        } else if (level == FBConnenctions.CONST_LEVEL_3) {
//            setTitle(R.string.a_lev_3)
//        } else if (level == FBConnenctions.CONST_LEVEL_4) {
//            setTitle(R.string.a_lev_4)
//        } else if (level == FBConnenctions.CONST_LEVEL_5) {
//            setTitle(R.string.a_lev_5)
//        } else if (level == FBConnenctions.CONST_LEVEL_6) {
//            setTitle(R.string.a_lev_6)
//        }
//    }
//
//    private fun updateLabel() {
//        val myFormat = "dd-MM-YYYY" //In which you need put here
//        val sdf = SimpleDateFormat(myFormat, Locale.US)
//        mDateEditText!!.setText(sdf.format(myCalendar!!.time))
//        mSelectedDate = mDateEditText!!.text.toString()
//        mStudentList.clear()
//        mStudentAttendancesList.clear()
//        mAdapter.notifyDataSetChanged()
//        for (i in 0 until mTermsRadioGroup!!.childCount) {
//            (mTermsRadioGroup!!.getChildAt(i) as RadioButton).isEnabled = false
//        }
//        studentsList
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
//        mAdapter = StudentAttendanceAdapter(this, mStudentAttendancesList)
//        mRecyclerView.setAdapter(mAdapter)
//    }
//
//    private val studentsList: Unit
//        private get() {
//            findViewById(R.id.progressBar).setVisibility(View.VISIBLE)
//            try {
//                val database = FirebaseDatabase.getInstance()
//                val databaseReference = database.reference.child(Utils.getKey(this)).child(mLevelKey)
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
//            if (mStudentList[i].getAttendanceItems() == null || mStudentList[i].getAttendanceItems().size() === 0) {
//                setEmptyAttendance(i)
//            } else {
//                var found = false
//                for (n in 0 until mStudentList[i].getAttendanceItems().size()) {
//                    if (mSelectedDate == mStudentList[i].getAttendanceItems().get(n).getDate()) {
//                        found = true
//                        val studentWithAttendance = StudentWithAttendance()
//                        studentWithAttendance.setId(mStudentList[i].getId())
//                        studentWithAttendance.setName(mStudentList[i].getName())
//                        studentWithAttendance.setAttendance(mStudentList[i].getAttendanceItems().get(n))
//                        mStudentAttendancesList.add(studentWithAttendance)
//                        break
//                    }
//                }
//                if (!found) {
//                    setEmptyAttendance(i)
//                }
//            }
//        }
//        mAdapter.notifyDataSetChanged()
//    }
//
//    private fun setEmptyAttendance(index: Int) {
//        val studentWithAttendance = StudentWithAttendance()
//        studentWithAttendance.setId(mStudentList[index].getId())
//        studentWithAttendance.setName(mStudentList[index].getName())
//        val attendanceItem = AttendanceItem()
//        attendanceItem.setDate(mSelectedDate)
//        attendanceItem.setAlhan(false)
//        attendanceItem.setHesa(false)
//        attendanceItem.setTermId(mSelectedTermId)
//        studentWithAttendance.setAttendance(attendanceItem)
//        mStudentAttendancesList.add(studentWithAttendance)
//    }
//
//    private fun onSave() {
//        for (i in mStudentList.indices) {
//            if (mStudentList[i].getAttendanceItems() == null || mStudentList[i].getAttendanceItems().size() === 0) {
//                val attendanceItems: ArrayList<AttendanceItem> = ArrayList<AttendanceItem>()
//                attendanceItems.add(mStudentAttendancesList[i].getAttendance())
//                mStudentList[i].setAttendanceItems(attendanceItems)
//            } else {
//                var found = false
//                for (n in 0 until mStudentList[i].getAttendanceItems().size()) {
//                    if (mSelectedDate == mStudentList[i].getAttendanceItems().get(n).getDate()) {
//                        found = true
//                        mStudentList[i].getAttendanceItems().set(n, mStudentAttendancesList[i].getAttendance())
//                        break
//                    }
//                }
//                if (!found) {
//                    mStudentList[i].getAttendanceItems().add(mStudentAttendancesList[i].getAttendance())
//                }
//            }
//        }
//
//        //here save data to database
//        add()
//    }
//
//    private fun add() {
//        findViewById(R.id.progressBar).setVisibility(View.VISIBLE)
//        val mDatabase = FirebaseDatabase.getInstance().reference.child(Utils.getKey(this))
//        val databaseReference = mDatabase.child(mLevelKey)
//        levelItem.setId(mLevelKey)
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