//package com.attendance.myproject.begory.presentationLayer.main.setting
//
//import android.graphics.Color
//import android.graphics.drawable.ColorDrawable
//import android.os.Bundle
//import android.text.TextUtils
//import android.view.View
//import android.widget.CheckBox
//import android.widget.EditText
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import com.attendance.myproject.begory.R
//import com.google.firebase.database.FirebaseDatabase
//
//class AddAdminActivity : AppCompatActivity() {
//    protected override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_add_admin)
//        window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        findViewById(R.id.btn_add).setOnClickListener(View.OnClickListener { add() })
//    }
//
//    private fun add() {
//        val mPasswordEditText = findViewById(R.id.et_password) as EditText
//        val mNameEditText = findViewById(R.id.et_name) as EditText
//        if (TextUtils.isEmpty(mPasswordEditText.text.toString()) || TextUtils.isEmpty(mNameEditText.text.toString())) {
//            Toast.makeText(getApplicationContext(), R.string.fill_data, Toast.LENGTH_SHORT).show()
//            return
//        }
//        Utils.hideKeyboard(this)
//        val admin = Admin()
//        admin.setAdminName(mNameEditText.text.toString())
//        admin.setAdminPassword(mPasswordEditText.text.toString())
//        admin.setAccountActive(true)
//        admin.setMainAdmin((findViewById(R.id.cb_is_Admin) as CheckBox).isChecked)
//        findViewById(R.id.progressBar).setVisibility(View.VISIBLE)
//        val mDatabase = FirebaseDatabase.getInstance().reference.child(Utils.getKey(this))
//        val attendanceDatabaseReference = mDatabase.child(FBConnenctions.CONST_ADMINS)
//        val key = attendanceDatabaseReference.push().key
//        admin.setAdminId(key)
//        attendanceDatabaseReference.child(key!!).setValue(admin).addOnSuccessListener { // Write was successful!
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