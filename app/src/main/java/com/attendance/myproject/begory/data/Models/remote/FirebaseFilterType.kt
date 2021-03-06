/*
 * Copyright 2017, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.attendance.myproject.begory.data.Models.remote

import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.presentationLayer.splash.SplashViewModel

/**
 * Used with the filter spinner in the tasks list.
 */
class FirebaseFilterType {

    companion object {
    const val users = "Users"
    const val selectedGifts = "SelectedGifts"
    const val gifts = "Gifts"
        const val levels = "Levels"
    const val studentAttendance = "StudentAttendances"
        fun fbConvert( i:Int):LevelFilterType=
            when(i) {
                R.string.lev_Grad -> LevelFilterType.Grad
                R.string.lev_college -> LevelFilterType.College
                R.string.lev_Augustine -> LevelFilterType.Augustine
                R.string.lev_Servant -> LevelFilterType.Servant
                else -> LevelFilterType.no
            }
    }
    enum class LevelFilterType {
      College,Grad,Augustine,no,Servant,
    }
}
