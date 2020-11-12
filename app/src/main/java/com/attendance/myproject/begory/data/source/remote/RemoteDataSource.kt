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
    override fun registerStudent(user: User,
                                 callback: IRemoteDataSource.MessageCallback) {
        val ref = firebaseDatabase.reference
                .child(FirebaseFilterType.users).orderByChild("mobile").equalTo(user.mobile)
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if(dataSnapshot.exists()){
                    callback.onDataNotAvailable(R.string.user_exist)
                }
                else {
                    val query =firebaseDatabase.reference.child(FirebaseFilterType.users)
                    Log.d(ContentValues.TAG, "showMessage: "+query)
                    val id =query.push().key
                    user.id=id
                    query.child(id!!).setValue(user).addOnSuccessListener {
                        callback.onResponse(R.string.added)   }
                            .addOnFailureListener {  callback.onDataNotAvailable(R.string.error) }
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                callback.onDataNotAvailable(R.string.error)
            }
        })
    }
    override fun registerSubAdmin(user1: User,
                          callback: IRemoteDataSource.MessageCallback) {
        val ref = firebaseDatabase.reference
                .child(FirebaseFilterType.users).orderByChild("mobile").equalTo(user1.mobile)
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if(dataSnapshot.exists()){
                    dataSnapshot.children.forEach{
                        val user= it.getValue(User::class.java) ;
                        if (user!!.subAdminLevel!!.isEmpty()){
                            var query =firebaseDatabase.reference.child(FirebaseFilterType.users).
                            child(user!!.id!!).child("subAdminLevel").setValue(user1.subAdminLevel)
                                    .addOnSuccessListener { callback.onResponse(R.string.added)   }
                                    .addOnFailureListener {  callback.onDataNotAvailable(R.string.error) }
                        }
                        else callback.onDataNotAvailable(R.string.user_exist)
                    }
                }
                else {
                    val query =firebaseDatabase.reference.child(FirebaseFilterType.users)
                    Log.d(ContentValues.TAG, "showMessage: "+query)
                    val id =query.push().key
                    user1.id=id
                    query.child(id!!).setValue(user1)
                            .addOnSuccessListener { callback.onResponse(R.string.added)   }
                            .addOnFailureListener {  callback.onDataNotAvailable(R.string.error) }
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                callback.onDataNotAvailable(R.string.error)
            }
        })


    }
    override fun registerAdmin(user1: User,
                                  callback: IRemoteDataSource.MessageCallback) {
        val ref = firebaseDatabase.reference
                .child(FirebaseFilterType.users).orderByChild("mobile").equalTo(user1.mobile)
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if(dataSnapshot.exists()){
                    dataSnapshot.children.forEach{
                        val user= it.getValue(User::class.java) ;
                        if (user!!.adminLevel!!.isEmpty()){
                            var query =firebaseDatabase.reference.child(FirebaseFilterType.users).
                            child(user!!.id!!).child("adminLevel").setValue(user1.adminLevel)
                                    .addOnSuccessListener { callback.onResponse(R.string.added)   }
                                    .addOnFailureListener {  callback.onDataNotAvailable(R.string.error) }
                        }
                        else callback.onDataNotAvailable(R.string.user_exist)
                    }
                }
                else {
                    val query =firebaseDatabase.reference.child(FirebaseFilterType.users)
                    Log.d(ContentValues.TAG, "showMessage: "+query)
                    val id =query.push().key
                    user1.id=id
                    query.child(id!!).setValue(user1)
                            .addOnSuccessListener { callback.onResponse(R.string.added)   }
                            .addOnFailureListener {  callback.onDataNotAvailable(R.string.error) }
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                callback.onDataNotAvailable(R.string.error)
            }
        })


    }
}
