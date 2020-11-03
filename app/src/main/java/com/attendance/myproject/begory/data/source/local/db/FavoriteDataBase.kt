//package com.attendance.myproject.begory.data.source.local.db
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//import com.attendance.myproject.begory.data.Models.User
//
//@Database(entities = [], version = 1, exportSchema = false)
//abstract class FavoriteDataBase : RoomDatabase() {
//    abstract fun FavoriteDao(): FavoriteDao?
//
//    companion object {
//        private var instance: FavoriteDataBase? = null
//        @Synchronized
//        fun getInstance(context: Context): FavoriteDataBase? {
//            if (instance == null) {
//                instance = Room.databaseBuilder(context.applicationContext, FavoriteDataBase::class.java, "shop_database")
//                        .build()
//            }
//            return instance
//        }
//    }
//}