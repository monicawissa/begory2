package com.attendance.myproject.begory.data.Models

import com.attendance.myproject.begory.data.Models.Attendance
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class StudentWithAttendance (
    @SerializedName("date")
    val date: String? ="",
    @SerializedName("attendance")
    val attendance: Attendance?=null
) : Serializable