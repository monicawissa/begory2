package com.attendance.myproject.begory.data.source
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.data.Models.Attendance
import com.attendance.myproject.begory.data.Models.Gift
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.source.local.prefs.IPreferencesHelper
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource
import javax.inject.Inject


/**
 * Concrete implementation to load tasks from the data sources into a cache.
 *
 *
 * For simplicity, this implements a dumb synchronisation between locally persisted data and data
 * obtained from the server, by using the remote data source only if the local database doesn't
 * exist or is empty.
 */
class AppRepository @Inject constructor(private val mRemoteDataSource: IRemoteDataSource,private val mIPreferencesHelper: IPreferencesHelper)
    : BaseDataSource {

    override fun getUser():User? {
        return mIPreferencesHelper.getUser()
    }

    override fun getUserbyLevel(mobile: String, level: String, callback: IRemoteDataSource.LoginCallback) {
    }
    fun getUserbyLevel(callback: IRemoteDataSource.LoginCallback) {
        val u=getUser()
        mRemoteDataSource.getUserbyLevel(u!!.mobile!!,mIPreferencesHelper.getLevel(),object :IRemoteDataSource.LoginCallback{
            override fun onResponse(user: User) {
                mIPreferencesHelper.setUser(user)
                callback.onResponse(user)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }
        })

    }
    override fun setUser(user: User) {
        mIPreferencesHelper.setUser(user)    }

    override fun setUserAsLoggedOut() {
        mIPreferencesHelper.setUserAsLoggedOut()
    }

    override fun getLevel(): String {
        return mIPreferencesHelper.getLevel()
    }

    override fun setLevel(l: String) {
        mIPreferencesHelper.setLevel(l)
    }

    override fun addGift(gift: Gift, level: String, callback: IRemoteDataSource.MessageCallback) {
        mRemoteDataSource.addGift(gift,level,object :IRemoteDataSource.MessageCallback{
            override fun onResponse(message: Int?) {
                callback.onResponse(message)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }

        })    }

    override fun updateGift(gift: Gift, level: String, callback: IRemoteDataSource.MessageCallback) {
        mRemoteDataSource.updateGift(gift,level,object :IRemoteDataSource.MessageCallback{
            override fun onResponse(message: Int?) {
                callback.onResponse(message)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }
        })
    }

    override fun deleteGift(gift: Gift, level: FirebaseFilterType.LevelFilterType, callback: IRemoteDataSource.MessageCallback) {
        mRemoteDataSource.deleteGift(gift,level,object :IRemoteDataSource.MessageCallback{
            override fun onResponse(message: Int?) {
                callback.onResponse(message)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }
        })    }

    override fun login(mobile: String, password: String,  selectedLevel: String, callback: IRemoteDataSource.LoginCallback) {
        mRemoteDataSource.login(mobile,password,selectedLevel,object :IRemoteDataSource.LoginCallback{
            override fun onResponse(user: User) {
                mIPreferencesHelper.setLevel(selectedLevel)
                mIPreferencesHelper.setUser(user)
                callback.onResponse(user)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }

        })
    }

    override fun registerStudent(user: User,
                                 callback: IRemoteDataSource.MessageCallback) {
        mRemoteDataSource.registerStudent(user,object :IRemoteDataSource.MessageCallback{
            override fun onResponse(message: Int?) {
                callback.onResponse(message)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }

        })
    }

    override fun registerSubAdmin(user: User, callback: IRemoteDataSource.MessageCallback) {
        mRemoteDataSource.registerSubAdmin(user,object :IRemoteDataSource.MessageCallback{
            override fun onResponse(message: Int?) {
                callback.onResponse(message)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }

        })
    }
    override fun registerAdmin(user: User, callback: IRemoteDataSource.MessageCallback) {
        mRemoteDataSource.registerAdmin(user,object :IRemoteDataSource.MessageCallback{
            override fun onResponse(message: Int?) {
                callback.onResponse(message)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }

        })
    }




    override fun updateStudent(user: User, level: String, callback: IRemoteDataSource.MessageCallback) {
        mRemoteDataSource.updateStudent(user,level,object :IRemoteDataSource.MessageCallback{
            override fun onResponse(message: Int?) {
                callback.onResponse(message)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }
        })

    }

    override fun updateStudentbyLevel(user: User, level: String, callback: IRemoteDataSource.MessageCallback) {
        mRemoteDataSource.updateStudentbyLevel(user,level,object :IRemoteDataSource.MessageCallback{
            override fun onResponse(message: Int?) {
                callback.onResponse(message)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }
        })
    }

    override fun updateSubAdmin(user: User, callback: IRemoteDataSource.MessageCallback) {
        mRemoteDataSource.updateSubAdmin(user,object :IRemoteDataSource.MessageCallback{
            override fun onResponse(message: Int?) {
                callback.onResponse(message)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }
        })
    }

    override fun updateAdmin(user: User, callback: IRemoteDataSource.MessageCallback) {
        mRemoteDataSource.updateAdmin(user,object :IRemoteDataSource.MessageCallback{
            override fun onResponse(message: Int?) {
                callback.onResponse(message)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }
        })
    }



    override fun filterLevel(level: String, callback: IRemoteDataSource.UsersCallback) {
        mRemoteDataSource.filterLevel(level,object :IRemoteDataSource.UsersCallback{
            override fun onResponse(user: List<User>) {
                callback.onResponse(user)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }
        })
    }

    override fun updateAttendance(listOfAttendence: List<Attendance>?, level: String, callback: IRemoteDataSource.MessageCallback) {
        mRemoteDataSource.updateAttendance(listOfAttendence,level,object :IRemoteDataSource.MessageCallback{
            override fun onResponse(message: Int?) {
                callback.onResponse(message)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }
        })
    }

    override fun bookingGifts(level: FirebaseFilterType.LevelFilterType, callback: IRemoteDataSource.ShowBookingGiftsCallback) {
        mRemoteDataSource.bookingGifts(level,object :IRemoteDataSource.ShowBookingGiftsCallback{
            override fun onResponse(user: List<User>) {
                callback.onResponse(user)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }
        })
    }
    override fun updatePassword(user: User,level: String, callback: IRemoteDataSource.LoginCallback) {}
    fun updatePassword(password: String, callback: IRemoteDataSource.MessageCallback) {
        val user=mIPreferencesHelper.getUser()!!
        user.password=password
        mRemoteDataSource.updatePassword(user,mIPreferencesHelper.getLevel(),object :IRemoteDataSource.LoginCallback{
            override fun onResponse(user: User) {
                mIPreferencesHelper.setUser(user)
                callback.onResponse(R.string.edited)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }
        })
    }
    override fun filterGift(level: String, callback: IRemoteDataSource.ShowGiftsCallback) {
        mRemoteDataSource.filterGift(level,object : IRemoteDataSource.ShowGiftsCallback{
            override fun onResponse(gift: List<Gift>) {
                callback.onResponse(gift)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }
        })

    }

}