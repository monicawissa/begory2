package com.attendance.myproject.begory.data.Models

import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class FbUserLevel (
        @SerializedName("id")
        var id: String? = "",
        @SerializedName("name")
        var name: String? = "",
        @SerializedName("price")
        var price: Double? = 0.0,
        @SerializedName("realPrice")
        var realPrice: Double? = 0.0,
        @SerializedName("listOfAttendence")

    var listOfAttendence: Map<String,Attendance>? =null,
        @SerializedName("selectedGifts")
        var selectedGifts: ArrayList<Gift>? = ArrayList<Gift>()) : Serializable