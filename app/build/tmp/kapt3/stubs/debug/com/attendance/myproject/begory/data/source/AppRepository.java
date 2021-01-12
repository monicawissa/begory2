package com.attendance.myproject.begory.data.source;

import java.lang.System;

/**
 * Concrete implementation to load tasks from the data sources into a cache.
 *
 *
 * For simplicity, this implements a dumb synchronisation between locally persisted data and data
 * obtained from the server, by using the remote data source only if the local database doesn't
 * exist or is empty.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0017H\u0016J \u0010\u001d\u001a\u00020\b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010\u000b\u001a\u00020\u0017H\u0016J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0017H\u0016J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/attendance/myproject/begory/data/source/AppRepository;", "Lcom/attendance/myproject/begory/data/source/BaseDataSource;", "mRemoteDataSource", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource;", "mIPreferencesHelper", "Lcom/attendance/myproject/begory/data/source/local/prefs/IPreferencesHelper;", "(Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource;Lcom/attendance/myproject/begory/data/source/local/prefs/IPreferencesHelper;)V", "checkUserExist", "", "mobile", "", "callback", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$LoginCallback;", "filterLevel", "level", "Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$UsersCallback;", "getUser", "login", "password", "registerAdmin", "user", "Lcom/attendance/myproject/begory/data/Models/User;", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$MessageCallback;", "registerStudent", "registerSubAdmin", "setUser", "setUserAsLoggedOut", "updateAdmin", "updateAttendance", "listOfAttendence", "", "Lcom/attendance/myproject/begory/data/Models/Attendance;", "updateStudent", "updateSubAdmin", "app_debug"})
public final class AppRepository implements com.attendance.myproject.begory.data.source.BaseDataSource {
    private final com.attendance.myproject.begory.data.source.remote.IRemoteDataSource mRemoteDataSource = null;
    private final com.attendance.myproject.begory.data.source.local.prefs.IPreferencesHelper mIPreferencesHelper = null;
    
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
    
    @java.lang.Override()
    public void login(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.LoginCallback callback) {
    }
    
    @java.lang.Override()
    public void registerStudent(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    @java.lang.Override()
    public void registerSubAdmin(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    @java.lang.Override()
    public void registerAdmin(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    @java.lang.Override()
    public void checkUserExist(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.LoginCallback callback) {
    }
    
    @java.lang.Override()
    public void updateStudent(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    @java.lang.Override()
    public void updateSubAdmin(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    @java.lang.Override()
    public void updateAdmin(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    @java.lang.Override()
    public void filterLevel(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType level, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.UsersCallback callback) {
    }
    
    @java.lang.Override()
    public void updateAttendance(@org.jetbrains.annotations.Nullable()
    java.util.List<com.attendance.myproject.begory.data.Models.Attendance> listOfAttendence, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    @javax.inject.Inject()
    public AppRepository(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource mRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.local.prefs.IPreferencesHelper mIPreferencesHelper) {
        super();
    }
}