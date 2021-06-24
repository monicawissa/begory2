package com.attendance.myproject.begory.data.source.remote

import android.content.ContentValues
import android.util.Log
import androidx.core.net.toUri
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.AppConstants
import com.attendance.myproject.begory.data.Models.Attendance
import com.attendance.myproject.begory.data.Models.Gift
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.Models.FbUserLevel
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.google.firebase.database.*
import com.google.firebase.storage.FirebaseStorage
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

class RemoteDataSource @Inject constructor(private val firebaseDatabase: FirebaseDatabase):IRemoteDataSource {
    val baseRef = firebaseDatabase.reference
    val baseStorage=FirebaseStorage.getInstance().reference.child("images/")
    override fun addGift(gift: Gift, levels: String, callback: IRemoteDataSource.MessageCallback) {
        val i=baseStorage.child(UUID.randomUUID().toString())
        i.putFile(gift.imagePath!!.toUri()).addOnSuccessListener {
            i.downloadUrl.addOnSuccessListener { it-> gift.imagePath= it.toString()

                val y=levels.split('_').dropLast(1)
                //levels.dropLast(1)
                var p=0
                for(level in y){

                    val ref = baseRef.child(FirebaseFilterType.gifts).child(level.toString())
                    val id = ref.push().key
                    gift.id = id
                    ref.child(id!!).setValue(gift).addOnSuccessListener {
                        if (level==y[p])callback.onResponse(R.string.added)
                    }.addOnFailureListener {
                        callback.onDataNotAvailable(R.string.error) }
                    p++;
                }

            }// Image uploaded successfully

        }.addOnFailureListener(){
            callback.onDataNotAvailable(R.string.error)}

    }

    override fun updateGift(gift: Gift, level: String, callback: IRemoteDataSource.MessageCallback) {
        val ref = baseRef.child(FirebaseFilterType.gifts).child(level.toString())
        ref.child(gift.id!!).setValue(gift).addOnSuccessListener {
            callback.onResponse(R.string.edited)
        }.addOnFailureListener { callback.onDataNotAvailable(R.string.error) }    }

    override fun deleteGift(gift: Gift,level: FirebaseFilterType.LevelFilterType, callback: IRemoteDataSource.MessageCallback) {
        val ref = baseRef.child(FirebaseFilterType.gifts).child(level.toString())
        ref.child(gift.id!!).removeValue().addOnSuccessListener {
            callback.onResponse(R.string.deleted)
        }.addOnFailureListener { callback.onDataNotAvailable(R.string.error) }
    }

    //filter user in users list by mobile...if exist merge data from levels>level>id and Users>id ...
    override fun login(mobile: String, password: String, selectedLevel: String, callback: IRemoteDataSource.LoginCallback){
        val ref = baseRef.child(FirebaseFilterType.users).orderByChild("mobile").equalTo(mobile)
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    dataSnapshot.children.forEach {
                        val user = it.getValue(User::class.java);
                        if (user!!.mobile_password.equals("$mobile $password")&&user!!.studentLevel!!.contains(selectedLevel)){
                            val ref = baseRef.child(FirebaseFilterType.levels).child(selectedLevel).child(user.id!!).addListenerForSingleValueEvent(object :ValueEventListener{
                                override fun onDataChange(snapshot: DataSnapshot) {
                                    if (snapshot.exists()) {

                                        val fbuser = snapshot.getValue(FbUserLevel::class.java);
                                        user.price=fbuser!!.price
                                        user.realPrice=fbuser!!.realPrice
                                        user.selectedGifts=fbuser!!.selectedGifts
                                        user.listOfAttendence=fbuser!!.listOfAttendence
                                        callback.onResponse(user)
                                    }
                                }

                                override fun onCancelled(error: DatabaseError) {
                                    TODO("Not yet implemented")
                                }

                            }
                            )
                        }
                        else callback.onDataNotAvailable(R.string.wrong_password)
                    }

                } else callback.onDataNotAvailable(R.string.account_not_found)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                callback.onDataNotAvailable(R.string.error)
            }
        })

    }
    override fun registerStudent(user: User, callback: IRemoteDataSource.MessageCallback) {
        val ref = baseRef.child(FirebaseFilterType.users).orderByChild("mobile").equalTo(user.mobile)
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    dataSnapshot.children.forEach {
                        val user2 = it.getValue(User::class.java);
                            if (user2!!.studentLevel!!.contains(user!!.studentLevel!!) )callback.onDataNotAvailable(R.string.user_exist)
                            else{user2.studentLevel+=(user.studentLevel+'_')
                                if (user2.name!!.isEmpty())  user2.name= user.name
                                baseRef.child(FirebaseFilterType.users).child(user2.id!!).setValue(user2).addOnSuccessListener { callback.onResponse(R.string.added) }
                                        .addOnFailureListener { callback.onDataNotAvailable(R.string.error)
                                        }
                                baseRef.child(FirebaseFilterType.levels).child(user.studentLevel!!).child(user2.id!!).setValue(FbUserLevel(id=user2.id!!,name = user2.name)).addOnSuccessListener { callback.onResponse(R.string.added) }
                                        .addOnFailureListener { callback.onDataNotAvailable(R.string.error)
                                        }
                        }
                    }
                } else
                {
                    val query =baseRef.child(FirebaseFilterType.users)
                    Log.d(ContentValues.TAG, "showMessage: " + query)
                    val id = query.push().key
                    user.id = id
                    baseRef.child(FirebaseFilterType.levels).child(user.studentLevel!!).child(user.id!!).setValue(FbUserLevel(id=user.id!!,name = user.name)).addOnSuccessListener { callback.onResponse(R.string.added) }
                            .addOnFailureListener { callback.onDataNotAvailable(R.string.error)
                            }
                    user.studentLevel+='_'
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
                        if (user!!.subAdminLevel!! !=user1.subAdminLevel) {
                            var query = baseRef.child(FirebaseFilterType.users).child(user!!.id!!).child("subAdminLevel").setValue(user1.subAdminLevel)
                                    .addOnSuccessListener { callback.onResponse(R.string.added) }
                                    .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }
                            baseRef.child(FirebaseFilterType.levels).child(FirebaseFilterType.LevelFilterType.Servant.toString()).child(user.id!!)
                                    .addListenerForSingleValueEvent(object :ValueEventListener{
                                        override fun onDataChange(snapshot: DataSnapshot) {
                                            if (!snapshot.exists()) {
                                                baseRef.child(FirebaseFilterType.levels).child(FirebaseFilterType.LevelFilterType.Servant.toString()).child(user.id!!).setValue(FbUserLevel(id=user.id!!,name = user.name)).addOnSuccessListener { callback.onResponse(R.string.added) }
                                                    .addOnFailureListener { callback.onDataNotAvailable(R.string.error)
                                                    }}
                                        }

                                        override fun onCancelled(error: DatabaseError) {
                                            TODO("Not yet implemented")
                                        }

                                    }
                            )
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
                    baseRef.child(FirebaseFilterType.levels).child(FirebaseFilterType.LevelFilterType.Servant.toString()).child(user1.id!!).setValue(FbUserLevel(id=user1.id!!,name = user1.name)).addOnSuccessListener { callback.onResponse(R.string.added) }
                            .addOnFailureListener { callback.onDataNotAvailable(R.string.error)
                            }
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
                        if (user!!.adminLevel!! != user1.adminLevel) {
                            var query = baseRef.child(FirebaseFilterType.users).child(user!!.id!!).child("adminLevel").setValue(user1.adminLevel)
                                    .addOnSuccessListener { callback.onResponse(R.string.added) }
                                    .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }
                            baseRef.child(FirebaseFilterType.levels).child(FirebaseFilterType.LevelFilterType.Servant.toString()).child(user.id!!)
                                    .addListenerForSingleValueEvent(object :ValueEventListener{
                                        override fun onDataChange(snapshot: DataSnapshot) {
                                            if (!snapshot.exists()) { baseRef.child(FirebaseFilterType.levels).child(FirebaseFilterType.LevelFilterType.Servant.toString()).child(user.id!!).setValue(FbUserLevel(id=user.id!!,name = user.name)).addOnSuccessListener { callback.onResponse(R.string.added) }
                                                    .addOnFailureListener { callback.onDataNotAvailable(R.string.error)
                                                    }}
                                        }

                                        override fun onCancelled(error: DatabaseError) {
                                            TODO("Not yet implemented")
                                        }

                                    }
                                    )
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
                    baseRef.child(FirebaseFilterType.levels).child(FirebaseFilterType.LevelFilterType.Servant.toString()).child(user1.id!!).setValue(FbUserLevel(id=user1.id!!,name = user1.name)).addOnSuccessListener { callback.onResponse(R.string.added) }
                            .addOnFailureListener { callback.onDataNotAvailable(R.string.error)
                }
            }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                callback.onDataNotAvailable(R.string.error)
            }
        })


    }


    override fun getUserbyLevel(mobile: String, level: String, callback: IRemoteDataSource.LoginCallback) {
        val ref = baseRef.child(FirebaseFilterType.users).orderByChild("mobile").equalTo(mobile)
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    dataSnapshot.children.forEach {
                        val user = it.getValue(User::class.java);
                        baseRef.child(FirebaseFilterType.levels).child(level.toString()).child(user!!.id!!)
                                .addListenerForSingleValueEvent(object :ValueEventListener{
                                    override fun onDataChange(snapshot: DataSnapshot) {
                                        if (snapshot.exists()) {
                                            val fbuser = snapshot.getValue(FbUserLevel::class.java);
                                            user.price=fbuser!!.price
                                            user.realPrice=fbuser!!.realPrice
                                            user.listOfAttendence=fbuser!!.listOfAttendence
                                            user.selectedGifts=fbuser!!.selectedGifts
                                            callback.onResponse(user!!)
                                        }
                                    }

                                    override fun onCancelled(error: DatabaseError) {
                                        TODO("Not yet implemented")
                                    }

                                }
                                )

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

    override fun updateStudent(user: User, selectedLevel:String, callback: IRemoteDataSource.MessageCallback){
        if(selectedLevel.isNotEmpty()){
        val sel=selectedLevel
        val old=user.studentLevel!!
//        val sel=selectedLevel.split('_').dropLast(1)
//        val old=user.studentLevel!!.split('_').dropLast(1)
        //levels.dropLast(1)
        for (level in AppConstants.levels)
        {
            if(old.contains(level)&&!sel.contains(level))
            baseRef.child(FirebaseFilterType.levels).child(level).child(user.id!!).removeValue()
            else if (sel.contains(level)&&!old.contains(level)){
                        baseRef.child(FirebaseFilterType.levels).child(level).child(user.id!!).setValue(FbUserLevel(id=user.id!!,name = user.name)).addOnSuccessListener { callback.onResponse(R.string.added) }
                .addOnFailureListener { callback.onDataNotAvailable(R.string.error)
                }}
        }
        user.studentLevel=selectedLevel
        }
        user.price = 0.0
        user.realPrice=0.0
        user.listOfAttendence=null
        user.selectedGifts=ArrayList<Gift>()

        baseRef.child(FirebaseFilterType.users).child(user.id!!).setValue(user).addOnSuccessListener { callback.onResponse(R.string.edited) }
                .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }
    }

    override fun updateStudentbyLevel(user: User, level: String, callback: IRemoteDataSource.MessageCallback) {
        baseRef.child(FirebaseFilterType.levels).child(level).child(user.id!!).setValue(
                FbUserLevel(id=user.id!!,name = user.name,price = user.price,realPrice = user.realPrice,listOfAttendence = user.listOfAttendence,selectedGifts = user.selectedGifts)).addOnSuccessListener { callback.onResponse(R.string.added) }
                .addOnFailureListener { callback.onDataNotAvailable(R.string.error)
                }}


    override fun updateSubAdmin(user: User, callback: IRemoteDataSource.MessageCallback){
        baseRef.child(FirebaseFilterType.levels).child(FirebaseFilterType.LevelFilterType.Servant.toString()).child(user.id!!)
                .addListenerForSingleValueEvent(object :ValueEventListener{
                    override fun onDataChange(snapshot: DataSnapshot) {
                        if (!snapshot.exists()) {
                            baseRef.child(FirebaseFilterType.levels).child(FirebaseFilterType.LevelFilterType.Servant.toString()).child(user.id!!).setValue(FbUserLevel(id=user.id!!,name = user.name)).addOnSuccessListener { callback.onResponse(R.string.added) }
                                .addOnFailureListener { callback.onDataNotAvailable(R.string.error)
                                }}
                        else{
                            print("not")
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }

                }
                )

        user.price = 0.0
        user.realPrice=0.0
        user.listOfAttendence=null
        user.selectedGifts=ArrayList<Gift>()

//        baseRef.child(FirebaseFilterType.users).child(user.id!!).setValue(user).addOnSuccessListener { callback.onResponse(R.string.edited) }
//                .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }

        baseRef.child(FirebaseFilterType.users).child(user.id!!).child("subAdminLevel").setValue(user.subAdminLevel).addOnSuccessListener { callback.onResponse(R.string.edited) }
                .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }

    }
    override fun updateAdmin(user: User, callback: IRemoteDataSource.MessageCallback){
        baseRef.child(FirebaseFilterType.levels).child(FirebaseFilterType.LevelFilterType.Servant.toString()).child(user.id!!)
                .addListenerForSingleValueEvent(object :ValueEventListener{
                    override fun onDataChange(snapshot: DataSnapshot) {
                        if (!snapshot.exists()) {  baseRef.child(FirebaseFilterType.levels).child(FirebaseFilterType.LevelFilterType.Servant.toString()).child(user.id!!).setValue(FbUserLevel(id=user.id!!,name = user.name)).addOnSuccessListener { callback.onResponse(R.string.added) }
                                .addOnFailureListener { callback.onDataNotAvailable(R.string.error)
                                }}
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }

                }
                )
        user.price = 0.0
        user.realPrice=0.0
        user.listOfAttendence=null
        user.selectedGifts=ArrayList<Gift>()
//        baseRef.child(FirebaseFilterType.users).child(user.id!!).setValue(user).addOnSuccessListener { callback.onResponse(R.string.edited) }
//                .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }


        baseRef.child(FirebaseFilterType.users).child(user.id!!).child("adminLevel").setValue(user.adminLevel).addOnSuccessListener { callback.onResponse(R.string.edited) }
                .addOnFailureListener { callback.onDataNotAvailable(R.string.error) }
    }

    override fun updatePassword(userr: User,level: String, callback: IRemoteDataSource.LoginCallback) {
        getUserbyLevel(userr.mobile!!,level,object : IRemoteDataSource.LoginCallback{
            override fun onResponse(user: User) {
                user.price = 0.0
                user.realPrice=0.0
                user.listOfAttendence=null
                user.selectedGifts=ArrayList<Gift>()

                user.password=userr.password
                user.mobile_password="${user.mobile} ${user.password}"
                user.firstTime_ToLogin=false
                baseRef.child(FirebaseFilterType.users).child(user.id!!).setValue(user).addOnSuccessListener {
                    callback.onResponse(user)
                }.addOnFailureListener { callback.onDataNotAvailable(R.string.error) }
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }

        })

    }

    override fun filterLevel(level: String, callback: IRemoteDataSource.UsersCallback) {
        val ref = baseRef.child(FirebaseFilterType.levels).child(level.toString())
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    var mlist:ArrayList<User> = ArrayList()
                    dataSnapshot.children.forEach {
                        //var user:User=User(it.value)
                        mlist.add( it.getValue(User::class.java)!! )

                    }
                    callback.onResponse(mlist.toList())
                } else {
                    callback.onDataNotAvailable(R.string.no_student)
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                callback.onDataNotAvailable(R.string.error)
            }
        })
    }
    //not used: return list of users with changing name of student to the list of his gifts
    override fun bookingGifts(level: FirebaseFilterType.LevelFilterType, callback: IRemoteDataSource.ShowBookingGiftsCallback) {
        val ref = baseRef.child(FirebaseFilterType.users).orderByChild("studentLevel").equalTo(level.toString())
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    var mlist:ArrayList<User> = ArrayList()
                    dataSnapshot.children.forEach {
                        //var user:User=User(it.value)
                        mlist.add( it.getValue(User::class.java)!! )

                    }
                    mlist.sortWith((compareByDescending({ it.realPrice })))
                    for (student in mlist)
                    {
                        var bookedItems = ""
                        if (student.selectedGifts!=null) {
                            bookedItems = "\n"
                            for (gift in student.selectedGifts!!)
                                bookedItems += gift.name + " ( " + gift.price + " )" + "\n"
                        }

                        if (!bookedItems.equals("")) {
                            student.name = StringBuilder().append(student.name).append("\n").append(bookedItems).toString()
                            student.name = student.name!!.substring(0, student.name!!.length-1)
                        }
                    }
                    callback.onResponse(mlist.toList())
                } else {
                    callback.onDataNotAvailable(R.string.no_booking_gift)
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                callback.onDataNotAvailable(R.string.error)
            }
        })
    }
    override fun filterGift(level: String, callback: IRemoteDataSource.ShowGiftsCallback) {
        val ref = baseRef.child(FirebaseFilterType.gifts).child(level.toString())
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    var mlist:ArrayList<Gift> = ArrayList()
                    dataSnapshot.children.forEach {
                        //var user:User=User(it.value)
                        mlist.add( it.getValue(Gift::class.java)!! )
                        mlist.sortWith((compareByDescending({ it.price })))
                    }
                    callback.onResponse(mlist.toList())
                } else {
                    callback.onDataNotAvailable(R.string.no_gift)
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                callback.onDataNotAvailable(R.string.error)
            }
        })
    }
    fun Boolean.toInt() = if (this) 1 else 0

    override fun updateAttendance(listOfAttendence: List<Attendance>?,level:String, callback: IRemoteDataSource.MessageCallback) {
        for (i in listOfAttendence!!){
            baseRef.child(FirebaseFilterType.levels).child(level).child(i.id).child("listOfAttendence")
                    .child(i.date).addListenerForSingleValueEvent(object :ValueEventListener{
                        override fun onDataChange(snapshot: DataSnapshot) {
                            if (snapshot.exists()) {
                                var mlist: ArrayList<User> = ArrayList()
                                snapshot.children.forEach {
                                    var user:User=it.getValue(User::class.java)!!
                                    var cal=0;
                                    if (i.isA3traf!=user.listOfAttendence!![i.date]!!.isA3traf&&i.isA3traf)cal+=5
                                    else if (i.isA3traf!=user.listOfAttendence!![i.date]!!.isA3traf&&!i.isA3traf)cal-=5
                                    if (i.isAttend!=user.listOfAttendence!![i.date]!!.isAttend&&i.isAttend)cal+=5
                                    else if (i.isAttend!=user.listOfAttendence!![i.date]!!.isAttend&&!i.isAttend)cal-=5
                                    if (i.isTnawel!=user.listOfAttendence!![i.date]!!.isTnawel&&i.isTnawel)cal+=5
                                    else if (i.isTnawel!=user.listOfAttendence!![i.date]!!.isTnawel&&!i.isTnawel)cal-=5
                                    if (i.iskodas!=user.listOfAttendence!![i.date]!!.iskodas&&i.iskodas)cal+=5
                                    else if (i.iskodas!=user.listOfAttendence!![i.date]!!.iskodas&&!i.iskodas)cal-=5

                                    baseRef.child(FirebaseFilterType.levels).child(level).child(i.id).child("listOfAttendence")
                                            .child(i.date).setValue(i)
                                            .addOnFailureListener { callback.onDataNotAvailable(R.string.error)   }
                                    baseRef.child(FirebaseFilterType.levels).child(level).child(i.id).child("realPrice").setValue(ServerValue.increment(cal.toDouble()))
                                    baseRef.child(FirebaseFilterType.levels).child(level).child(i.id).child("price").setValue(ServerValue.increment(cal.toDouble()))
                                    callback.onResponse(R.string.edited)
                            }
                            }
                        }
                        override fun onCancelled(error: DatabaseError) {
                            callback.onDataNotAvailable(R.string.error)                        }

                    })}
    }
}
