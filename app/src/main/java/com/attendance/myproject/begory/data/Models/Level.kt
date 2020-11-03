package com.attendance.myproject.begory.data.Models

class Level {
    var levelId: String? = null
    var levelName: String? = null
    var levelYear: String? = null
    var isLevelActive = false
    override fun toString(): String {
        return levelName!!
    }
}