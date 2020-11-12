package com.attendance.myproject.begory.data.Models

data class Level (
    val levelId: Int? = null,
    val levelName: String? = null
){
    override fun toString(): String {
        return levelName!!
    }
}