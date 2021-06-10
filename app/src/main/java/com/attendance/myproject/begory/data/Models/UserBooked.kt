package com.attendance.myproject.begory.data.Models

import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UserBooked (
        @SerializedName("id")
    var id: String? = "",
        @SerializedName("name")
    var name: String? = "",

        @SerializedName("price")
        var price: Double? = 0.0,
        @SerializedName("realPrice")
        var realPrice: Double? = 0.0,
        @SerializedName("top")
        var top: Int? = 0,
) : Serializable