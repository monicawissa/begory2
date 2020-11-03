package com.attendance.myproject.begory.data.source.local.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/attendance/myproject/begory/data/source/local/prefs/AppPreferencesHelper;", "Lcom/attendance/myproject/begory/data/source/local/prefs/PreferencesHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getUser", "", "callback", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$LoginCallback;", "setUser", "user", "Lcom/attendance/myproject/begory/data/Models/User;", "setUserAsLoggedOut", "Companion", "app_debug"})
public final class AppPreferencesHelper implements com.attendance.myproject.begory.data.source.local.prefs.PreferencesHelper {
    private final android.content.Context context = null;
    private static com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper INSTANCE;
    private static final java.lang.String PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";
    private static final java.lang.String PREF_KEY_USER = "PREF_KEY_USER";
    public static final com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper.Companion Companion = null;
    
    @java.lang.Override()
    public void getUser(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.LoginCallback callback) {
    }
    
    @java.lang.Override()
    public void setUser(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user) {
    }
    
    @java.lang.Override()
    public void setUserAsLoggedOut() {
    }
    
    public AppPreferencesHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper getInstance(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/attendance/myproject/begory/data/source/local/prefs/AppPreferencesHelper$Companion;", "", "()V", "INSTANCE", "Lcom/attendance/myproject/begory/data/source/local/prefs/AppPreferencesHelper;", "PREF_KEY_ACCESS_TOKEN", "", "PREF_KEY_USER", "clearInstance", "", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @androidx.annotation.VisibleForTesting()
        public final void clearInstance() {
        }
        
        private Companion() {
            super();
        }
    }
}