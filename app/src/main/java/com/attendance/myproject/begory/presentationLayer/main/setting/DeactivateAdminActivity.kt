//package com.attendance.myproject.begory.presentationLayer.main.setting
//
//import android.content.DialogInterface
//import android.content.DialogInterface.OnMultiChoiceClickListener
//import android.graphics.Color
//import android.graphics.drawable.ColorDrawable
//import android.os.Bundle
//import android.support.v7.app.AlertDialog
//import android.support.v7.app.AppCompatActivity
//import android.util.Log
//import android.view.View
//import android.widget.*
//import com.attendance.myproject.attendanceregister.R
//import com.attendance.myproject.attendanceregister.Utils.FBConnenctions
//import com.attendance.myproject.attendanceregister.Utils.Utils
//import com.attendance.myproject.attendanceregister.beans.LevelItem
//import com.attendance.myproject.attendanceregister.entites.Admin
//import com.google.firebase.database.*
//import java.util.*
//
//class DeactivateAdminActivity : AppCompatActivity() {
//    private var mAdminSpinner: Spinner? = null
//    private val mAdminsList: ArrayList<Admin?> = ArrayList<Admin?>()
//    private val mLevelsList: ArrayList<LevelItem> = ArrayList<LevelItem>()
//    private var mSelectedAdmin: Admin? = null
//    private var mIsActiveCheckBox: CheckBox? = null
//    protected fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_deactivate_admin)
//        getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        mIsActiveCheckBox = findViewById(R.id.cb_is_active)
//        findViewById(R.id.btn_add).setOnClickListener(View.OnClickListener { add() })
//        findViewById(R.id.btn_select_levels).setOnClickListener(View.OnClickListener { selectLevels() })
//        initUsersSpinner()
//    }
//
//    private fun selectLevels() {
//        mLevelsList.clear()
//        if (mSelectedAdmin.getLevels() == null) {
//            var level = LevelItem()
//            level.setId(FBConnenctions.CONST_LEVEL_1)
//            level.setName(getString(R.string.lev_1))
//            level.setSelected(false)
//            mLevelsList.add(level)
//            level = LevelItem()
//            level.setId(FBConnenctions.CONST_LEVEL_2)
//            level.setName(getString(R.string.lev_2))
//            level.setSelected(false)
//            mLevelsList.add(level)
//            level = LevelItem()
//            level.setId(FBConnenctions.CONST_LEVEL_3)
//            level.setName(getString(R.string.lev_3))
//            level.setSelected(false)
//            mLevelsList.add(level)
//            level = LevelItem()
//            level.setId(FBConnenctions.CONST_LEVEL_4)
//            level.setName(getString(R.string.lev_4))
//            level.setSelected(false)
//            mLevelsList.add(level)
//            level = LevelItem()
//            level.setId(FBConnenctions.CONST_LEVEL_5)
//            level.setName(getString(R.string.lev_5))
//            level.setSelected(false)
//            mLevelsList.add(level)
//            level = LevelItem()
//            level.setId(FBConnenctions.CONST_LEVEL_6)
//            level.setName(getString(R.string.lev_6))
//            level.setSelected(false)
//            mLevelsList.add(level)
//        } else {
//            mLevelsList.addAll(mSelectedAdmin.getLevels())
//        }
//        val checkedItems = BooleanArray(mLevelsList.size)
//        val items = arrayOfNulls<String>(mLevelsList.size)
//        for (i in mLevelsList.indices) {
//            checkedItems[i] = mLevelsList[i].isSelected()
//            items[i] = mLevelsList[i].getName()
//        }
//        val builder: AlertDialog.Builder = Builder(this@DeactivateAdminActivity)
//        builder.setTitle(R.string.update_levels)
//        builder.setMultiChoiceItems(items, checkedItems, OnMultiChoiceClickListener { dialog, selectedItem, isChecked -> //Toast.makeText(DeactivateAdminActivity.this, "Position: " + which + " Value: " + listItems[which] + " State: " + (isChecked ? "checked" : "unchecked"), Toast.LENGTH_LONG).show();
//            mLevelsList[selectedItem].setSelected(isChecked)
//        })
//        builder.setPositiveButton(getString(R.string.save), DialogInterface.OnClickListener { dialog, which -> dialog.dismiss() })
//        val dialog: AlertDialog = builder.create()
//        dialog.show()
//    }
//
//    private fun initUsersSpinner() {
//        mAdminSpinner = findViewById(R.id.sp_levels) as Spinner?
//        findViewById(R.id.progressBar).setVisibility(View.VISIBLE)
//        try {
//            val database = FirebaseDatabase.getInstance()
//            val databaseReference = database.reference.child(Utils.getKey(this))
//            databaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
//                override fun onDataChange(dataSnapshot: DataSnapshot) {
//                    try {
//                        findViewById(R.id.progressBar).setVisibility(View.GONE)
//                        val children = dataSnapshot.child(FBConnenctions.CONST_ADMINS).children
//                        for (child in children) {
//                            val std1: Admin? = child.getValue(Admin::class.java)
//                            mAdminsList.add(std1)
//                        }
//                        val dataAdapter: ArrayAdapter<Admin> = ArrayAdapter<Admin>(this@DeactivateAdminActivity,
//                                android.R.layout.simple_spinner_item, mAdminsList)
//                        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//                        mAdminSpinner!!.adapter = dataAdapter
//                        mAdminSpinner!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//                            override fun onItemSelected(adapterView: AdapterView<*>?, view: View, i: Int, l: Long) {
//                                mSelectedAdmin = mAdminsList[i]
//                                if (!mAdminsList[i].isAccountActive()) mIsActiveCheckBox!!.isChecked = true else mIsActiveCheckBox!!.isChecked = false
//                                if (mSelectedAdmin.isMainAdmin()) findViewById(R.id.btn_select_levels).setVisibility(View.GONE) else findViewById(R.id.btn_select_levels).setVisibility(View.VISIBLE)
//                            }
//
//                            override fun onNothingSelected(adapterView: AdapterView<*>?) {}
//                        }
//                        mAdminSpinner!!.setSelection(0)
//                        mSelectedAdmin = mAdminsList[0]
//                        if (mSelectedAdmin.isMainAdmin()) findViewById(R.id.btn_select_levels).setVisibility(View.GONE) else findViewById(R.id.btn_select_levels).setVisibility(View.VISIBLE)
//                    } catch (e: Exception) {
//                        Log.e("Exception is", e.toString())
//                    }
//                }
//
//                override fun onCancelled(databaseError: DatabaseError) {}
//            })
//        } catch (e: Exception) {
//            Log.e("Exception is", e.toString())
//        }
//    }
//
//    private fun add() {
//        if (mAdminsList.size == 0) {
//            Toast.makeText(getApplicationContext(), R.string.choose_name, Toast.LENGTH_SHORT).show()
//            return
//        }
//        findViewById(R.id.progressBar).setVisibility(View.VISIBLE)
//        val mDatabase = FirebaseDatabase.getInstance().reference.child(Utils.getKey(this))
//        val attendanceDatabaseReference = mDatabase.child(FBConnenctions.CONST_ADMINS)
//        val admin: Admin? = mAdminsList[mAdminSpinner!!.selectedItemPosition]
//        admin.setAccountActive(!mIsActiveCheckBox!!.isChecked)
//        if (!mAdminsList[mAdminSpinner!!.selectedItemPosition].isMainAdmin()) admin.setLevels(mLevelsList)
//        mAdminsList[mAdminSpinner!!.selectedItemPosition] = admin
//        attendanceDatabaseReference.child(admin.getAdminId()).setValue(admin).addOnSuccessListener { // Write was successful!
//            // ...
//            findViewById(R.id.progressBar).setVisibility(View.GONE)
//            Toast.makeText(getApplicationContext(), R.string.edited, Toast.LENGTH_SHORT).show()
//            finish()
//        }
//                .addOnFailureListener { // Write failed
//                    // ...
//                    Toast.makeText(getApplicationContext(), R.string.error, Toast.LENGTH_SHORT).show()
//                }
//    }
//}