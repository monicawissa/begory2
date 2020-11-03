///*
// * Copyright 2016, The Android Open Source Project
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package com.attendance.myproject.begory.data.source.local.db
//import com.attendance.myproject.begory.Utilities.ggle.AppExecutors
//
//
///**
// * Concrete implementation of a data source as a db.
// */
//class LocalDataSource private constructor(appExecutors: AppExecutors,
//                                          Dao: FavoriteDao) : ILocalDataSource {
//    private val mDao: FavoriteDao
//    private val mAppExecutors: AppExecutors
//
//    /**
//     * Note: [LoadAllFavoriteCallback.onDataNotAvailable] is fired if the database doesn't exist
//     * or the table is empty.
//     */
////    override fun getAllFavorite(callback: LoadAllFavoriteCallback) {
////        val runnable = Runnable {
////            val : List<Movie?>? = mDao.allFavorite
////            mAppExecutors.mainThread().execute(Runnable {
////                if (!!.isEmpty()) {
////                    // This will be called if the table is new or just empty.
////                    callback.onDataNotAvailable("table is empty")
////                    callback.onAllFavoriteLoaded()
////                } else {
////                    callback.onAllFavoriteLoaded()
////                }
////            })
////        }
////        mAppExecutors.diskIO().execute(runnable)
////    }
////
////    /**
////     * Note: [GetFavoriteCallback.onDataNotAvailable] is fired if the [Movie] isn't
////     * found.
////     */
////    override fun getFavorite(FavoriteId: Int, callback: GetFavoriteCallback) {
////        val runnable = Runnable {
////            val Favorite: Movie? = mDao.getFavoriteById(FavoriteId)
////            mAppExecutors.mainThread().execute(Runnable {
////                if (Favorite != null) {
////                    callback.onFavoriteLoaded(Favorite)
////                } else {
////                    callback.onDataNotAvailable()
////                }
////            })
////        }
////        mAppExecutors.diskIO().execute(runnable)
////    }
////
////    override fun addFavorite(Favorite: Movie) {
////        checkNotNull(Favorite)
////        val saveRunnable = Runnable { mDao.insertFavorite(Favorite) }
////        mAppExecutors.diskIO().execute(saveRunnable)
////    }
////
////    override fun updateFavorite(Favorite: Movie) {
////        val completeRunnable = Runnable { mDao.updateFavorite(Favorite) }
////        mAppExecutors.diskIO().execute(completeRunnable)
////    }
////
////    override fun deleteAllFavorite() {
////        val deleteRunnable = Runnable { mDao.deletetable() }
////        mAppExecutors.diskIO().execute(deleteRunnable)
////    }
////
////    override fun deleteFavorite(FavoriteId: Int) {
////        val deleteRunnable = Runnable { mDao.deleteFavoritebyId(FavoriteId) }
////        mAppExecutors.diskIO().execute(deleteRunnable)
////    }
//
//    companion object {
//        @Volatile
//        private var INSTANCE: LocalDataSource? = null
//        fun getInstance(appExecutors: AppExecutors,
//                        Dao: FavoriteDao): LocalDataSource? {
//            if (INSTANCE == null) {
//                synchronized(LocalDataSource::class.java) {
//                    if (INSTANCE == null) {
//                        INSTANCE = LocalDataSource(appExecutors, Dao)
//                    }
//                }
//            }
//            return INSTANCE
//        }
//
//        // @VisibleForTesting
//        fun clearInstance() {
//            INSTANCE = null
//        }
//    }
//
//    // Prevent direct instantiation.
//    init {
//        mAppExecutors = appExecutors
//        mDao = Dao
//    }
//}