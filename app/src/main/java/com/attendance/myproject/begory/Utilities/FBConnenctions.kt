//package com.attendance.myproject.begory.Utilities
//
//import android.content.Context
//import android.util.Log
//import android.view.View
//import android.widget.ProgressBar
//import android.widget.Toast
//import com.attendance.myproject.begory.R
//import com.attendance.myproject.begory.entites.Admin
//import com.attendance.myproject.begory.data.Models.Attendance
//import com.attendance.myproject.begory.data.Models.Level
//import com.attendance.myproject.begory.data.Models.User
//import com.google.firebase.database.*
//
//object FBConnenctions {
//
//    fun addNewStudent(context: Context?, user: User, progressBar: ProgressBar) {
//        val mDatabase = FirebaseDatabase.getInstance().reference.child(Utils.getKey(context))
//        mDatabase.child(CONST_STUDENTS).child(user.studentId).setValue(user).addOnSuccessListener { // Write was successful!
//            // ...
//            progressBar.visibility = View.GONE
//            Toast.makeText(context, R.string.added, Toast.LENGTH_SHORT).show()
//        }
//                .addOnFailureListener { // Write failed
//                    // ...
//                    progressBar.visibility = View.GONE
//                    Toast.makeText(context, R.string.error, Toast.LENGTH_SHORT).show()
//                }
//    }
//
//    @JvmStatic
//    fun getStudents(context: Context?) {
//        try {
//            val database = FirebaseDatabase.getInstance()
//            val databaseReference = database.reference.child(Utils.getKey(context))
//            databaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
//                override fun onDataChange(dataSnapshot: DataSnapshot) {
//                    try {
//
//                        // Toast.makeText(StudentInformationActivity.this, "Hello bro Again", Toast.LENGTH_SHORT).show();
//                        val children = dataSnapshot.child(CONST_STUDENTS).children
//                        for (child in children) {
//                            val std1 = child.getValue(User::class.java)!!
//                            Log.d("student", std1.studentName)
//                        }
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
//    fun getStudentInfo(context: Context?, studentId: String?) {
//        val database = FirebaseDatabase.getInstance()
//        val databaseReference = database.reference.child(Utils.getKey(context))
//        val query: Query = databaseReference.child(CONST_STUDENTS).child(studentId)
//        query.addListenerForSingleValueEvent(object : ValueEventListener {
//            override fun onDataChange(dataSnapshot: DataSnapshot) {
//                try {
//                    val std1 = dataSnapshot.getValue(User::class.java)!!
//                    Log.d("student", std1.studentName)
//                } catch (e: Exception) {
//                    Log.e("Exception is", e.toString())
//                }
//            }
//
//            override fun onCancelled(databaseError: DatabaseError) {}
//        })
//    }
//
//    fun addLevel(context: Context?, student: Level) {
//        val mDatabase = FirebaseDatabase.getInstance().reference.child(Utils.getKey(context))
//        val databaseReference = mDatabase.child(CONST_LEVELS)
//        val key = databaseReference.push().key
//        student.levelId = key
//        mDatabase.child(key).setValue(student).addOnSuccessListener { // Write was successful!
//            // ...
//            Toast.makeText(context, "Added", Toast.LENGTH_SHORT).show()
//        }
//                .addOnFailureListener { // Write failed
//                    // ...
//                    Toast.makeText(context, "Not Added", Toast.LENGTH_SHORT).show()
//                }
//    }
//
//    fun getLevels(context: Context?) {
//        try {
//            val database = FirebaseDatabase.getInstance()
//            val databaseReference = database.reference.child(Utils.getKey(context))
//            databaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
//                override fun onDataChange(dataSnapshot: DataSnapshot) {
//                    try {
//
//                        // Toast.makeText(StudentInformationActivity.this, "Hello bro Again", Toast.LENGTH_SHORT).show();
//                        val children = dataSnapshot.child(CONST_LEVELS).children
//                        for (child in children) {
//                            val std1 = child.getValue(Level::class.java)!!
//                            Log.d("student", std1.levelName)
//                        }
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
//    fun addAttendance(context: Context?, attendance: Attendance) {
//        val mDatabase = FirebaseDatabase.getInstance().reference.child(Utils.getKey(context))
//        val attendanceDatabaseReference = mDatabase.child(CONST_ATTENDANCE)
//        val key = attendanceDatabaseReference.push().key
//
//        //key += "@@@"+attendance.getLevelId()+"@@@"+attendance.getStudentId(); //here we append levelId & StudentId at end of key to be able to query them
//        attendance.id = key
//        attendanceDatabaseReference.child(key).setValue(attendance).addOnSuccessListener { // Write was successful!
//            // ...
//            Toast.makeText(context, "Added", Toast.LENGTH_SHORT).show()
//        }
//                .addOnFailureListener { // Write failed
//                    // ...
//                    Toast.makeText(context, "Not Added", Toast.LENGTH_SHORT).show()
//                }
//    }
//
//    fun getAttendance(context: Context?) {
//        try {
//            val database = FirebaseDatabase.getInstance()
//            val databaseReference = database.reference.child(Utils.getKey(context))
//            databaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
//                override fun onDataChange(dataSnapshot: DataSnapshot) {
//                    try {
//                        val children = dataSnapshot.child(CONST_ATTENDANCE).children
//                        for (child in children) {
//                            val std1 = child.getValue(Attendance::class.java)!!
//                            Log.d("student", std1.studentId)
//                        }
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
//    fun getSpecificAttendanceInfoByStudentId(context: Context?, studentId: String?) {
//        val database = FirebaseDatabase.getInstance()
//        val databaseReference = database.reference.child(Utils.getKey(context))
//        val query = databaseReference.child(CONST_ATTENDANCE).orderByChild("studentId").equalTo(studentId) //get attendance where studentId = 1000
//        query.addListenerForSingleValueEvent(object : ValueEventListener {
//            override fun onDataChange(dataSnapshot: DataSnapshot) {
//                try {
//                    val children = dataSnapshot.children
//                    for (child in children) {
//                        val std1 = child.getValue(Attendance::class.java)!!
//                        Log.d("student", std1.id + "     level=" + std1.levelId)
//                    }
//                } catch (e: Exception) {
//                    Log.e("Exception is", e.toString())
//                }
//            }
//
//            override fun onCancelled(databaseError: DatabaseError) {}
//        })
//    }
//
//    fun getSpecificAttendanceInfoByLevelId(context: Context?, levelId: String?) {
//        val database = FirebaseDatabase.getInstance()
//        val databaseReference = database.reference.child(Utils.getKey(context))
//        val query = databaseReference.child(CONST_ATTENDANCE).orderByChild("levelId").equalTo(levelId) //get attendance where studentId = 1000
//        query.addListenerForSingleValueEvent(object : ValueEventListener {
//            override fun onDataChange(dataSnapshot: DataSnapshot) {
//                try {
//                    val children = dataSnapshot.children
//                    for (child in children) {
//                        val std1 = child.getValue(Attendance::class.java)!!
//                        Log.d("student", std1.id + "     level=" + std1.levelId)
//                    }
//                } catch (e: Exception) {
//                    Log.e("Exception is", e.toString())
//                }
//            }
//
//            override fun onCancelled(databaseError: DatabaseError) {}
//        })
//    }
//
//    @JvmStatic
//    fun addAdmin(context: Context?, admin: Admin) {
//        val mDatabase = FirebaseDatabase.getInstance().reference.child(Utils.getKey(context))
//        val attendanceDatabaseReference = mDatabase.child(CONST_ADMINS)
//        val key = attendanceDatabaseReference.push().key
//
//        //key += "@@@"+attendance.getLevelId()+"@@@"+attendance.getStudentId(); //here we append levelId & StudentId at end of key to be able to query them
//        admin.adminId = key
//        attendanceDatabaseReference.child(key).setValue(admin).addOnSuccessListener { // Write was successful!
//            // ...
//            Toast.makeText(context, "Added", Toast.LENGTH_SHORT).show()
//        }
//                .addOnFailureListener { // Write failed
//                    // ...
//                    Toast.makeText(context, "Not Added", Toast.LENGTH_SHORT).show()
//                }
//    }
//
//    fun deactivateAdmin(context: Context?, adminId: String?, admin: Admin?) {
//        val mDatabase = FirebaseDatabase.getInstance().reference.child(Utils.getKey(context))
//        val attendanceDatabaseReference = mDatabase.child(CONST_ADMINS)
//        attendanceDatabaseReference.child(adminId).setValue(admin).addOnSuccessListener { // Write was successful!
//            // ...
//            Toast.makeText(context, "Edited", Toast.LENGTH_SHORT).show()
//        }
//                .addOnFailureListener { // Write failed
//                    // ...
//                    Toast.makeText(context, "Not Added", Toast.LENGTH_SHORT).show()
//                }
//    }
//
//    fun getAllAdmins(context: Context?) {
//        try {
//            val database = FirebaseDatabase.getInstance()
//            val databaseReference = database.reference.child(Utils.getKey(context))
//            databaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
//                override fun onDataChange(dataSnapshot: DataSnapshot) {
//                    try {
//                        val children = dataSnapshot.child(CONST_ADMINS).children
//                        for (child in children) {
//                            val std1 = child.getValue(Admin::class.java)!!
//                            Log.d("student", std1.adminName + "  isActive" + std1.isAccountActive + "adminId" + std1.adminId)
//                        }
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
//    fun getAdminByName(context: Context?, name: String?) {
//        try {
//            val database = FirebaseDatabase.getInstance()
//            val databaseReference = database.reference.child(Utils.getKey(context)).child(CONST_ADMINS).orderByChild("adminName").equalTo(name)
//            databaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
//                override fun onDataChange(dataSnapshot: DataSnapshot) {
//                    try {
//                        val children = dataSnapshot.children
//                        for (child in children) {
//                            val std1 = child.getValue(Admin::class.java)!!
//                            Log.d("student", std1.adminName + "  isActive" + std1.isAccountActive + "adminId" + std1.adminId)
//                        }
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
//}