package com.attendance.myproject.begory.data.Models
import com.google.gson.annotations.SerializedName

data class Attendance (
    @SerializedName("id")
    var termId :Int = 0,
    @SerializedName("isAttend")
    var isAttend :Boolean = false,
    @SerializedName("isEodas")
    var isEodas :Boolean= false ,
    @SerializedName("isE3traf")
    var isE3traf :Boolean= false,
    @SerializedName("isTnawel")
    var isTnawel :Boolean= false,
    @SerializedName("isShamas")
    var isShamas:Boolean = false
)
