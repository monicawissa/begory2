package com.attendance.myproject.begory.data.source.remote

import androidx.annotation.VisibleForTesting
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.data.Models.User
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class RemoteDataSource :IRemoteDataSource {

    private val firebaseDatabase: FirebaseDatabase by lazy {
        FirebaseDatabase.getInstance()
    }
    companion object {
        private var INSTANCE: RemoteDataSource? = null

        @JvmStatic
        fun getInstance(): RemoteDataSource {
            if (INSTANCE == null) {
                synchronized(RemoteDataSource::javaClass) {
                    INSTANCE = RemoteDataSource()
                }
            }
            return INSTANCE!!
        }

        @VisibleForTesting
        fun clearInstance() {
            INSTANCE = null
        }
    }

    override fun login(mobile: String, password: String,callback: IRemoteDataSource.LoginCallback){
        val ref = firebaseDatabase.reference
                .child(FirebaseFilterType.users).orderByChild("mobile").equalTo(mobile)
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if(dataSnapshot.exists()){
                    val user= dataSnapshot.value as User?;
                    if (user!!.mobile_password.equals("$mobile $password"))
                        callback.onResponse(user)
                    else callback.onDataNotAvailable( R.string.wrong_password)
                }
                else callback.onDataNotAvailable( R.string.account_not_found)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                callback.onDataNotAvailable(R.string.error)
            }
        })

    }

    override fun register(mobile: String, admin: FirebaseFilterType.LevelFilterType?,
                          subAdmin: FirebaseFilterType.LevelFilterType?,
                          studentLevel: FirebaseFilterType.LevelFilterType?,
                          callback: IRemoteDataSource.MessageCallback) {
        val query =firebaseDatabase.reference.child(FirebaseFilterType.users)
        val id =firebaseDatabase.reference.child(FirebaseFilterType.users).push().key
        val user:User= User(mobile = mobile,password = mobile,mobile_password = "$mobile $mobile",id = id,
                adminLevel = admin,subAdminLevel = subAdmin,studentLevel = studentLevel)
        query.child(id!!).setValue(user).addOnSuccessListener { {{ callback.onResponse(R.string.added) }}  }
                .addOnFailureListener {  callback.onDataNotAvailable(R.string.error) }
    }


}
