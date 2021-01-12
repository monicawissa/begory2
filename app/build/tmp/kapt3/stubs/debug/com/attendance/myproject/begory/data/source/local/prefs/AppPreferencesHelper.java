package com.attendance.myproject.begory.data.source.local.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/attendance/myproject/begory/data/source/local/prefs/AppPreferencesHelper;", "Lcom/attendance/myproject/begory/data/source/local/prefs/IPreferencesHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mPrefs", "Lcom/attendance/myproject/begory/data/source/local/prefs/SavePrefs;", "Lcom/attendance/myproject/begory/data/Models/User;", "getUser", "setUser", "", "user", "setUserAsLoggedOut", "Companion", "app_debug"})
@javax.inject.Singleton()
public final class AppPreferencesHelper implements com.attendance.myproject.begory.data.source.local.prefs.IPreferencesHelper {
    private final com.attendance.myproject.begory.data.source.local.prefs.SavePrefs<com.attendance.myproject.begory.data.Models.User> mPrefs = null;
    private static final java.lang.String PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";
    public static final com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.attendance.myproject.begory.data.Models.User getUser() {
        return null;
    }
    
    @java.lang.Override()
    public void setUser(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user) {
    }
    
    @java.lang.Override()
    public void setUserAsLoggedOut() {
    }
    
    @javax.inject.Inject()
    public AppPreferencesHelper(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/attendance/myproject/begory/data/source/local/prefs/AppPreferencesHelper$Companion;", "", "()V", "PREF_KEY_ACCESS_TOKEN", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}