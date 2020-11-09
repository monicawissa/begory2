package com.attendance.myproject.begory.Utilities

//import android.content.Context
//import android.util.Log
//import android.view.View
//import android.widget.ProgressBar
//import android.widget.Toast
//import com.attendance.myproject.attendanceregister.R
//import com.attendance.myproject.attendanceregister.entites.Admin
//import com.attendance.myproject.attendanceregister.entites.Attendance
//import com.attendance.myproject.attendanceregister.entites.Level
//import com.attendance.myproject.attendanceregister.entites.Student
//import com.google.firebase.database.*


//object FBConnenctions {
//    const val CONST_STUDENTS = "StudentsList"
//    const val CONST_LEVELS = "LevelsList"
//    const val CONST_ATTENDANCE = "StudentAttendence"
//    const val CONST_ADMINS = "AdminsList"
//    const val CONST_LEVEL_1 = "Level1"
//    const val CONST_LEVEL_2 = "Level2"
//    const val CONST_LEVEL_3 = "Level3"
//    const val CONST_LEVEL_4 = "Level4"
//    const val CONST_LEVEL_5 = "Level5"
//    const val CONST_LEVEL_6 = "Level6"
//    const val CONST_GRADE_FEAR = 0
//    const val CONST_GRADE_ACCEPTABLE = 1
//    const val CONST_GRADE_GOOD = 2
//    const val CONST_GRADE_VERY_GOOD = 3
//    const val CONST_GRADE_EXCELLENT = 4
//    fun addNewStudent(context: Context?, student: Student, progressBar: ProgressBar) {
//        val mDatabase = FirebaseDatabase.getInstance().reference.child(Utils.getKey(context))
//        mDatabase.child(CONST_STUDENTS).child(student.getStudentId()).setValue(student).addOnSuccessListener { // Write was successful!
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
//                            val std1: Student? = child.getValue(Student::class.java)
//                            Log.d("student", std1.getStudentName())
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
//        val query: Query = databaseReference.child(CONST_STUDENTS).child(studentId!!)
//        query.addListenerForSingleValueEvent(object : ValueEventListener {
//            override fun onDataChange(dataSnapshot: DataSnapshot) {
//                try {
//                    val std1: Student? = dataSnapshot.getValue(Student::class.java)
//                    Log.d("student", std1.getStudentName())
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
//        student.setLevelId(key)
//        mDatabase.child(key!!).setValue(student).addOnSuccessListener { // Write was successful!
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
//                            val std1: Level? = child.getValue(Level::class.java)
//                            Log.d("student", std1.getLevelName())
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
//        attendance.setId(key)
//        attendanceDatabaseReference.child(key!!).setValue(attendance).addOnSuccessListener { // Write was successful!
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
//                            val std1: Attendance? = child.getValue(Attendance::class.java)
//                            Log.d("student", std1.getStudentId())
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
//                        val std1: Attendance? = child.getValue(Attendance::class.java)
//                        Log.d("student", std1.getId().toString() + "     level=" + std1.getLevelId())
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
//                        val std1: Attendance? = child.getValue(Attendance::class.java)
//                        Log.d("student", std1.getId().toString() + "     level=" + std1.getLevelId())
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
//    fun addAdmin(context: Context?, admin: Admin) {
//        val mDatabase = FirebaseDatabase.getInstance().reference.child(Utils.getKey(context))
//        val attendanceDatabaseReference = mDatabase.child(CONST_ADMINS)
//        val key = attendanceDatabaseReference.push().key
//
//        //key += "@@@"+attendance.getLevelId()+"@@@"+attendance.getStudentId(); //here we append levelId & StudentId at end of key to be able to query them
//        admin.setAdminId(key)
//        attendanceDatabaseReference.child(key!!).setValue(admin).addOnSuccessListener { // Write was successful!
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
//        attendanceDatabaseReference.child(adminId!!).setValue(admin).addOnSuccessListener { // Write was successful!
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
//                            val std1: Admin? = child.getValue(Admin::class.java)
//                            Log.d("student", std1.getAdminName().toString() + "  isActive" + std1.isAccountActive() + "adminId" + std1.getAdminId())
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
//                            val std1: Admin? = child.getValue(Admin::class.java)
//                            Log.d("student", std1.getAdminName().toString() + "  isActive" + std1.isAccountActive() + "adminId" + std1.getAdminId())
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
