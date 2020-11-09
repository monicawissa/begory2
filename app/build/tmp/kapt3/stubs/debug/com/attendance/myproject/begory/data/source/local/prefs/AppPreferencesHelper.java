package com.attendance.myproject.begory.data.source.local.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/attendance/myproject/begory/data/source/local/prefs/AppPreferencesHelper;", "Lcom/attendance/myproject/begory/data/source/local/prefs/IPreferencesHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "PREF_KEY_USER", "", "mKeySavePrefs", "Lcom/attendance/myproject/begory/data/source/local/prefs/SavePrefs;", "Lcom/attendance/myproject/begory/data/Models/User;", "getUser", "", "callback", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$LoginCallback;", "setUser", "user", "setUserAsLoggedOut", "app_debug"})
public final class AppPreferencesHelper implements com.attendance.myproject.begory.data.source.local.prefs.IPreferencesHelper {
    private final java.lang.String PREF_KEY_USER = "PREF_KEY_USER";
    private final com.attendance.myproject.begory.data.source.local.prefs.SavePrefs<com.attendance.myproject.begory.data.Models.User> mKeySavePrefs = null;
    
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
    
    @javax.inject.Inject()
    public AppPreferencesHelper(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
}