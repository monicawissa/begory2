package com.attendance.myproject.begory.data.source.local.prefs

import android.content.Context
import android.content.SharedPreferences
import com.attendance.myproject.begory.di.PreferenceInfo
import com.attendance.myproject.begory.di.module.AppModule
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

class SavePrefs<T> @Inject constructor(@ApplicationContext activity: Context, @PreferenceInfo preferenceInfo: String, private val cls: Class<*>) {

    private val prefs: SharedPreferences = activity.getSharedPreferences(preferenceInfo,
            Context.MODE_PRIVATE)

    fun save(Pref_key:String,obj: T) {
        val editor = prefs.edit()
        val gson =GsonBuilder().serializeNulls().create();
        val data = gson.toJson(obj )
        editor.putString(Pref_key, data)
        editor.apply()
    }

    fun load(Pref_key:String): T {
        val data = prefs.getString(Pref_key,"")
        return Gson().fromJson(data, cls) as T
    }
    fun savestring(Pref_key:String,obj: String) {
        val editor = prefs.edit()
        editor.putString(Pref_key, obj)
        editor.apply()
    }

    fun loadstring(Pref_key:String): String {
        return prefs.getString(Pref_key,"")
    }
    fun clear() {
        prefs.edit().clear().apply()
    }
}