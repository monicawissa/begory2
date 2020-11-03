package com.attendance.myproject.begory.data.source.local.prefs

import android.content.Context
import android.content.SharedPreferences
import com.attendance.myproject.begory.Utilities.AppConstants
import com.google.gson.Gson

class SavePrefs<T>(activity: Context, private val cls: Class<*>) {

    private val USER_PREFS_FILE_NAME: String=AppConstants.PREF_NAME
    private val prefs: SharedPreferences
    fun save(Pref_key:String,obj: T) {
        val editor = prefs.edit()
        val data = Gson().toJson(obj)
        editor.putString(Pref_key, data)
        editor.apply()
    }

    fun load(Pref_key:String): T {
        val data = prefs.getString(Pref_key,"")
        return Gson().fromJson(data, cls) as T
    }

    fun clear() {
        prefs.edit().clear().apply()
    }

    init {
        prefs = activity.getSharedPreferences(USER_PREFS_FILE_NAME,
                Context.MODE_PRIVATE)
    }
}