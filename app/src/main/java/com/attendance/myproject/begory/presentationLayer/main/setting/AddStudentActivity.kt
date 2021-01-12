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
//class AddStudentActivity : AppCompatActivity() {
//    private var mLevelSpinner: Spinner? = null
//    private val mLevelsList: ArrayList<Level> = ArrayList<Level>()
//    private var levelItem: LevelItem? = null
//    protected fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_add_student)
//        getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        initLevelsSpinner()
//        findViewById(R.id.btn_add).setOnClickListener(View.OnClickListener { add() })
//    }
//
//    private fun initLevelsSpinner() {
//        var level = Level()
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
//        val dataAdapter: ArrayAdapter<Level> = ArrayAdapter<Level>(this@AddStudentActivity,
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
//    private fun add() {
//        val mIdEditText = findViewById(R.id.et_id) as EditText
//        val mNameEditText = findViewById(R.id.et_name) as EditText
//        val mAddressEditText = findViewById(R.id.et_address) as EditText
//        val mPhoneEditText = findViewById(R.id.et_mobile) as EditText
//        val mPhone2EditText = findViewById(R.id.et_mobile2) as EditText
//        val mShamas: CheckBox = findViewById(R.id.cb_shamas)
//        if (TextUtils.isEmpty(mIdEditText.text.toString()) || TextUtils.isEmpty(mNameEditText.text.toString())) {
//            Toast.makeText(getApplicationContext(), R.string.fill_data, Toast.LENGTH_SHORT).show()
//            return
//        }
//        Utils.hideKeyboard(this)
//        val student = StudentItem()
//        student.setId(mIdEditText.text.toString())
//        student.setName(mNameEditText.text.toString())
//        student.setAddress(mAddressEditText.text.toString())
//        student.setMobile(mPhoneEditText.text.toString())
//        student.setfMobile(mPhone2EditText.text.toString())
//        student.setShamas(mShamas.isChecked)
//        if (levelItem.getStudents() == null) levelItem.setStudents(ArrayList<StudentItem>())
//        levelItem.getStudents().add(student)
//        findViewById(R.id.progressBar).setVisibility(View.VISIBLE)
//        val mDatabase = FirebaseDatabase.getInstance().reference.child(Utils.getKey(this))
//        val databaseReference = mDatabase.child((mLevelSpinner!!.selectedItem as Level).getLevelId())
//        databaseReference.setValue(levelItem).addOnSuccessListener { // Write was successful!
//            // ...
//            findViewById(R.id.progressBar).setVisibility(View.GONE)
//            mNameEditText.setText("")
//            mIdEditText.setText("")
//            mPhoneEditText.setText("")
//            mPhone2EditText.setText("")
//            mAddressEditText.setText("")
//            mShamas.isChecked = false
//            Toast.makeText(getApplicationContext(), R.string.added, Toast.LENGTH_SHORT).show()
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