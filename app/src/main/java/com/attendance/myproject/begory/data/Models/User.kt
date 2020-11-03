package com.attendance.myproject.begory.data.Models

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import com.attendance.myproject.begory.data.source.remote.FirebaseFilterType
import com.google.gson.annotations.SerializedName

data class User (
    @SerializedName("id")
    var id: String? = "",
    @SerializedName("name")
    var name: String? = "",
    @SerializedName("mobile")
    var mobile: String? = "",
    @SerializedName("password")
    var password: String? = "",
    //login
    @SerializedName("mobile_password")
    var mobile_password: String? = "",
    @SerializedName("notes")
    var notes: String? = "",
    @SerializedName("notes")
    var mobile2: String? = "",
    @SerializedName("address")
    var address: String? = "",
    @SerializedName("adminLevel")
    var adminLevel: FirebaseFilterType.LevelFilterType? = null,
    @SerializedName("subAdminLevel")
    var subAdminLevel: FirebaseFilterType.LevelFilterType? = null,
    @SerializedName("studentLevel")
    var studentLevel: FirebaseFilterType.LevelFilterType? = null,

    @SerializedName("balanceEqlomat")
    var balanceEqlomat: Double? = 0.0,
    @SerializedName("balanceBegory")
    var balanceBegory: Double? = 0.0,
    @SerializedName("listOfAttendence")

    var listOfAttendence: List<Attendance>? = null,
    @SerializedName("firstTime_ToLogin")
    var firstTime_ToLogin:Boolean=true)
//    override fun toString(): String {
//        return mobile!!
//    }
