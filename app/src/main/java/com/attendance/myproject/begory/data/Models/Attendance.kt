package com.attendance.myproject.begory.data.Models
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Attendance(
        @SerializedName("date")
        var date: String = "",
        @SerializedName("studentName")
        var name: String ="",
        @SerializedName("studentId")
        var id: String = "",
        @SerializedName("termId")
        var termId: String = "",
        @SerializedName("isAttend")
        var isAttend: Boolean = false,
        @SerializedName("isEodas")
        var iskodas: Boolean = false,
        @SerializedName("isE3traf")
        var isA3traf: Boolean = false,
        @SerializedName("isTnawel")
        var isTnawel: Boolean = false,
        @SerializedName("isShamas")
        var isShamas: Boolean = false
): Serializable
