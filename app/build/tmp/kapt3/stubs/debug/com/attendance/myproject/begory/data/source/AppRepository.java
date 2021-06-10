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
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0014H\u0016J \u0010\u001d\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0014H\u0016J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010#\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010$\u001a\u00020\bH\u0016J\u0018\u0010%\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010&\u001a\u00020\b2\u000e\u0010\'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010*\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010+\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u0014H\u0016J\u0016\u0010+\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010,\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010-\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/attendance/myproject/begory/data/source/AppRepository;", "Lcom/attendance/myproject/begory/data/source/BaseDataSource;", "mRemoteDataSource", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource;", "mIPreferencesHelper", "Lcom/attendance/myproject/begory/data/source/local/prefs/IPreferencesHelper;", "(Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource;Lcom/attendance/myproject/begory/data/source/local/prefs/IPreferencesHelper;)V", "addGift", "", "gift", "Lcom/attendance/myproject/begory/data/Models/Gift;", "level", "", "callback", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$MessageCallback;", "bookingGifts", "Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$ShowBookingGiftsCallback;", "checkUserExist", "mobile", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$LoginCallback;", "deleteGift", "filterGift", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$ShowGiftsCallback;", "filterLevel", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$UsersCallback;", "getUser", "Lcom/attendance/myproject/begory/data/Models/User;", "getUserLastUpdate", "login", "password", "registerAdmin", "user", "registerStudent", "registerSubAdmin", "setUser", "setUserAsLoggedOut", "updateAdmin", "updateAttendance", "listOfAttendence", "", "Lcom/attendance/myproject/begory/data/Models/Attendance;", "updateGift", "updatePassword", "updateStudent", "updateSubAdmin", "app_debug"})
public final class AppRepository implements com.attendance.myproject.begory.data.source.BaseDataSource {
    private final com.attendance.myproject.begory.data.source.remote.IRemoteDataSource mRemoteDataSource = null;
    private final com.attendance.myproject.begory.data.source.local.prefs.IPreferencesHelper mIPreferencesHelper = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.attendance.myproject.begory.data.Models.User getUser() {
        return null;
    }
    
    @java.lang.Override()
    public void getUserLastUpdate(@org.jetbrains.annotations.NotNull()
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
    public void addGift(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.Gift gift, @org.jetbrains.annotations.NotNull()
    java.lang.String level, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    @java.lang.Override()
    public void updateGift(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.Gift gift, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType level, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    @java.lang.Override()
    public void deleteGift(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.Gift gift, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType level, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
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
    public void updatePassword(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.LoginCallback callback) {
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
    
    @java.lang.Override()
    public void bookingGifts(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType level, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.ShowBookingGiftsCallback callback) {
    }
    
    public final void updatePassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    @java.lang.Override()
    public void filterGift(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType level, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.ShowGiftsCallback callback) {
    }
    
    @javax.inject.Inject()
    public AppRepository(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource mRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.local.prefs.IPreferencesHelper mIPreferencesHelper) {
        super();
    }
}