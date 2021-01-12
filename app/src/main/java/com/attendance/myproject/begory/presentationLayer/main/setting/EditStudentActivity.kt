//package com.attendance.myproject.begory.presentationLayer.main.setting
//
//import android.graphics.Color
//import android.graphics.drawable.ColorDrawable
//import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
//import android.text.TextUtils
//import android.util.Log
//import android.view.View
//import android.widget.*
//import com.attendance.myproject.attendanceregister.R
//import com.attendance.myproject.attendanceregister.Utils.FBConnenctions
//import com.attendance.myproject.attendanceregister.Utils.Utils
//import com.attendance.myproject.attendanceregister.beans.LevelItem
//import com.attendance.myproject.attendanceregister.beans.StudentItem
//import com.attendance.myproject.attendanceregister.entites.Level
//import com.google.firebase.database.*
//import java.util.*
//
//class EditStudentActivity : AppCompatActivity() {
//    private var mLevelSpinner: Spinner? = null
//    private val mLevelsList: ArrayList<Level> = ArrayList<Level>()
//    private var mStudentsSpinner: Spinner? = null
//    private val mStudentsList: ArrayList<StudentItem> = ArrayList<StudentItem>()
//    private var levelItem: LevelItem? = null
//    private var mSelectedStudent: StudentItem? = null
//    private var mIdEditText: EditText? = null
//    private var mNameEditText: EditText? = null
//    private var mAddressEditText: EditText? = null
//    private var mPhoneEditText: EditText? = null
//    private var mPhone2EditText: EditText? = null
//    private var mShamas: CheckBox? = null
//    protected fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_edit_student)
//        getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        mIdEditText = findViewById(R.id.et_id) as EditText?
//        mNameEditText = findViewById(R.id.et_name) as EditText?
//        mAddressEditText = findViewById(R.id.et_address) as EditText?
//        mPhoneEditText = findViewById(R.id.et_mobile) as EditText?
//        mPhone2EditText = findViewById(R.id.et_mobile2) as EditText?
//        mShamas = findViewById(R.id.cb_shamas)
//        initLevelsSpinner()
//        findViewById(R.id.btn_add).setOnClickListener(View.OnClickListener { add() })
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
//        val dataAdapter: ArrayAdapter<Level> = ArrayAdapter<Level>(this@EditStudentActivity,
//                android.R.layout.simple_spinner_item, mLevelsList)
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        mLevelSpinner!!.adapter = dataAdapter
//        mLevelSpinner!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(adapterView: AdapterView<*>?, view: View, i: Int, l: Long) {
//                studentsList
//            }
//
//            override fun onNothingSelected(adapterView: AdapterView<*>?) {}
//        }
//    }
//
//    private fun setStudentsSpinner() {
//        mStudentsSpinner = findViewById(R.id.sp_students) as Spinner?
//        val dataAdapter: ArrayAdapter<StudentItem> = ArrayAdapter<Any?>(this@EditStudentActivity,
//                android.R.layout.simple_spinner_item, mStudentsList)
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        mStudentsSpinner!!.adapter = dataAdapter
//        mStudentsSpinner!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(adapterView: AdapterView<*>?, view: View, i: Int, l: Long) {
//                mSelectedStudent = mStudentsList[i]
//                mIdEditText.setText(mSelectedStudent.getId())
//                mAddressEditText.setText(mSelectedStudent.getAddress())
//                mNameEditText.setText(mSelectedStudent.getName())
//                mPhoneEditText.setText(mSelectedStudent.getMobile())
//                mPhone2EditText.setText(mSelectedStudent.getfMobile())
//                mShamas!!.isChecked = mSelectedStudent.isShamas()
//            }
//
//            override fun onNothingSelected(adapterView: AdapterView<*>?) {}
//        }
//    }
//
//    private fun add() {
//        if (TextUtils.isEmpty(mIdEditText!!.text.toString()) || TextUtils.isEmpty(mNameEditText!!.text.toString())) {
//            Toast.makeText(getApplicationContext(), R.string.fill_data, Toast.LENGTH_SHORT).show()
//            return
//        }
//        Utils.hideKeyboard(this)
//        mSelectedStudent.setId(mIdEditText!!.text.toString())
//        mSelectedStudent.setName(mNameEditText!!.text.toString())
//        mSelectedStudent.setAddress(mAddressEditText!!.text.toString())
//        mSelectedStudent.setMobile(mPhoneEditText!!.text.toString())
//        mSelectedStudent.setfMobile(mPhone2EditText!!.text.toString())
//        mSelectedStudent.setShamas(mShamas!!.isChecked)
//        levelItem.getStudents().set(mStudentsSpinner!!.selectedItemPosition, mSelectedStudent)
//        findViewById(R.id.progressBar).setVisibility(View.VISIBLE)
//        val mDatabase = FirebaseDatabase.getInstance().reference.child(Utils.getKey(this))
//        val databaseReference = mDatabase.child((mLevelSpinner!!.selectedItem as Level).getLevelId())
//        databaseReference.setValue(levelItem).addOnSuccessListener { // Write was successful!
//            // ...
//            findViewById(R.id.progressBar).setVisibility(View.GONE)
//            Toast.makeText(getApplicationContext(), R.string.edited, Toast.LENGTH_SHORT).show()
//            mSelectedStudent = null
//        }
//                .addOnFailureListener { // Write failed
//                    // ...
//                    findViewById(R.id.progressBar).setVisibility(View.GONE)
//                    Toast.makeText(getApplicationContext(), R.string.error, Toast.LENGTH_SHORT).show()
//                }
//    }
//
//    private val studentsList: Unit
//        private get() {
//            findViewById(R.id.progressBar).setVisibility(View.VISIBLE)
//            try {
//                val database = FirebaseDatabase.getInstance()
//                val databaseReference = database.reference.child(Utils.getKey(this))
//                        .child((mLevelSpinner!!.selectedItem as Level).getLevelId())
//                databaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
//                    override fun onDataChange(dataSnapshot: DataSnapshot) {
//                        try {
//                            findViewById(R.id.progressBar).setVisibility(View.GONE)
//                            levelItem = dataSnapshot.getValue(LevelItem::class.java)
//                            mStudentsList.clear()
//                            if (levelItem.getStudents() != null) mStudentsList.addAll(levelItem.getStudents())
//                            setStudentsSpinner()
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
//}