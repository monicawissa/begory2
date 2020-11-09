package com.attendance.myproject.begory.data.source.remote

import android.content.ContentValues
import android.util.Log
import androidx.annotation.VisibleForTesting
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.Models.User
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val firebaseDatabase:FirebaseDatabase):IRemoteDataSource {

    override fun login(mobile: String, password: String,callback: IRemoteDataSource.LoginCallback){
        val ref = firebaseDatabase.reference
                .child(FirebaseFilterType.users).orderByChild("mobile").equalTo(mobile)
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if(dataSnapshot.exists()){
                    dataSnapshot.children.forEach{
                        val user= it.getValue(User::class.java) ;
                        if (user!!.mobile_password.equals("$mobile $password"))
                            callback.onResponse(user)
                        else callback.onDataNotAvailable( R.string.wrong_password)
                    }

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
        Log.d(ContentValues.TAG, "showMessage: "+query)
        val id =query.push().key
        val user:User= User(mobile = mobile,password = mobile,mobile_password = "$mobile $mobile",id = id,
                adminLevel = admin,subAdminLevel = subAdmin,studentLevel = studentLevel)
        query.child(id!!).setValue(user).addOnSuccessListener {
             callback.onResponse(R.string.added)   }
                .addOnFailureListener {  callback.onDataNotAvailable(R.string.error) }

    }
}
