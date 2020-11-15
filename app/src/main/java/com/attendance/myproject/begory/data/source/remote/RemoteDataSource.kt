package com.attendance.myproject.begory.data.source.remote

import android.content.ContentValues
import android.util.Log
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val firebaseDatabase: FirebaseDatabase):IRemoteDataSource {
    val baseRef = firebaseDatabase.reference

    override fun login(mobile: String, password: String, callback: IRemoteDataSource.LoginCallback){
        val ref = baseRef.child(FirebaseFilterType.users).orderByChild("mobile").equalTo(mobile)
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    dataSnapshot.children.forEach {
                        val user = it.getValue(User::class.java);
                        if (user!!.mobile_password.equals("$mobile $password"))
                            callback.onResponse(user)
                        else callback.onDataNotAvailable(R.string.wrong_password)
                    }

                } else callback.onDataNotAvailable(R.string.account_not_found)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                callback.onDataNotAvailable(R.string.error)
            }
        })

    }
    override fun registerStudent(user: User,
                                 callback: IRemoteDataSource.MessageCallback) {
        val ref = baseRef.child(FirebaseFilterType.users).orderByChild("mobile").equalTo(user.mobile)
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    callback.onDataNotAvailable(R.string.user_exist)
                } else {
                    val query =baseRef.child(FirebaseFilterType.users)
                    Log.d(ContentValues.TAG, "showMessage: " + query)
                    val id = query.push().key
                    user.id = id
                    query.child(id!!).setValue(user).addOnSuccessListener {
                        callback.onResponse(R.string.added)
                    }
                            .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                callback.onDataNotAvailable(R.string.error)
            }
        })
    }
    override fun registerSubAdmin(user1: User,
                                  callback: IRemoteDataSource.MessageCallback) {
        val ref = baseRef.child(FirebaseFilterType.users).orderByChild("mobile").equalTo(user1.mobile)
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    dataSnapshot.children.forEach {
                        val user = it.getValue(User::class.java);
                        if (user!!.subAdminLevel!!.isEmpty()) {
                            var query = baseRef.child(FirebaseFilterType.users).child(user!!.id!!).child("subAdminLevel").setValue(user1.subAdminLevel)
                                    .addOnSuccessListener { callback.onResponse(R.string.added) }
                                    .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }
                        } else callback.onDataNotAvailable(R.string.user_exist)
                    }
                } else {
                    val query =baseRef.child(FirebaseFilterType.users)
                    Log.d(ContentValues.TAG, "showMessage: " + query)
                    val id = query.push().key
                    user1.id = id
                    query.child(id!!).setValue(user1)
                            .addOnSuccessListener { callback.onResponse(R.string.added) }
                            .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                callback.onDataNotAvailable(R.string.error)
            }
        })


    }
    override fun registerAdmin(user1: User,
                               callback: IRemoteDataSource.MessageCallback) {
        val ref = baseRef.child(FirebaseFilterType.users).orderByChild("mobile").equalTo(user1.mobile)
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    dataSnapshot.children.forEach {
                        val user = it.getValue(User::class.java);
                        if (user!!.adminLevel!!.isEmpty()) {
                            var query = baseRef.child(FirebaseFilterType.users).child(user!!.id!!).child("adminLevel").setValue(user1.adminLevel)
                                    .addOnSuccessListener { callback.onResponse(R.string.added) }
                                    .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }
                        } else callback.onDataNotAvailable(R.string.user_exist)
                    }
                } else {
                    val query = baseRef.child(FirebaseFilterType.users)
                    Log.d(ContentValues.TAG, "showMessage: " + query)
                    val id = query.push().key
                    user1.id = id
                    query.child(id!!).setValue(user1)
                            .addOnSuccessListener { callback.onResponse(R.string.added) }
                            .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                callback.onDataNotAvailable(R.string.error)
            }
        })


    }
    override fun checkUserExist(mobile: String, callback: IRemoteDataSource.LoginCallback){
        val ref = baseRef.child(FirebaseFilterType.users).orderByChild("mobile").equalTo(mobile)
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    dataSnapshot.children.forEach {
                        val user = it.getValue(User::class.java);
                        callback.onResponse(user!!)
                    }
                } else {
                    callback.onDataNotAvailable(R.string.account_not_found)
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                callback.onDataNotAvailable(R.string.error)
            }
        })
    }
    override fun updateStudent(user: User, callback: IRemoteDataSource.MessageCallback){
        baseRef.child(FirebaseFilterType.users).child(user.id!!).setValue(user).addOnSuccessListener { callback.onResponse(R.string.edited) }
                .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }
    }
    override fun updateSubAdmin(user: User, callback: IRemoteDataSource.MessageCallback){
        baseRef.child(FirebaseFilterType.users).child(user.id!!).child("subAdminLevel").setValue(user.subAdminLevel).addOnSuccessListener { callback.onResponse(R.string.edited) }
                .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }

    }
    override fun updateAdmin(user: User, callback: IRemoteDataSource.MessageCallback){
        baseRef.child(FirebaseFilterType.users).child(user.id!!).child("adminLevel").setValue(user.adminLevel).addOnSuccessListener { callback.onResponse(R.string.edited) }
                .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }
    }

}
