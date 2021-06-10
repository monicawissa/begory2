package com.attendance.myproject.begory.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u001bH\u0016J \u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020 H\u0016J \u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u001bH\u0016J\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010(\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010)\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010*\u001a\u00020\u000e2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010.\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u001bH\u0016J\u0018\u00101\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u00102\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\n\u00103\u001a\u000204*\u000205R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/attendance/myproject/begory/data/source/remote/RemoteDataSource;", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource;", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "baseRef", "Lcom/google/firebase/database/DatabaseReference;", "getBaseRef", "()Lcom/google/firebase/database/DatabaseReference;", "baseStorage", "Lcom/google/firebase/storage/StorageReference;", "getBaseStorage", "()Lcom/google/firebase/storage/StorageReference;", "addGift", "", "gift", "Lcom/attendance/myproject/begory/data/Models/Gift;", "levels", "", "callback", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$MessageCallback;", "bookingGifts", "level", "Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$ShowBookingGiftsCallback;", "checkUserExist", "mobile", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$LoginCallback;", "deleteGift", "filterGift", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$ShowGiftsCallback;", "filterLevel", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$UsersCallback;", "login", "password", "registerAdmin", "user1", "Lcom/attendance/myproject/begory/data/Models/User;", "registerStudent", "user", "registerSubAdmin", "updateAdmin", "updateAttendance", "listOfAttendence", "", "Lcom/attendance/myproject/begory/data/Models/Attendance;", "updateGift", "updatePassword", "userr", "updateStudent", "updateSubAdmin", "toInt", "", "", "app_debug"})
public final class RemoteDataSource implements com.attendance.myproject.begory.data.source.remote.IRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.database.DatabaseReference baseRef = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.storage.StorageReference baseStorage = null;
    private final com.google.firebase.database.FirebaseDatabase firebaseDatabase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.database.DatabaseReference getBaseRef() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.storage.StorageReference getBaseStorage() {
        return null;
    }
    
    @java.lang.Override()
    public void addGift(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.Gift gift, @org.jetbrains.annotations.NotNull()
    java.lang.String levels, @org.jetbrains.annotations.NotNull()
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
    com.attendance.myproject.begory.data.Models.User user1, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    @java.lang.Override()
    public void registerAdmin(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user1, @org.jetbrains.annotations.NotNull()
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
    com.attendance.myproject.begory.data.Models.User userr, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.LoginCallback callback) {
    }
    
    @java.lang.Override()
    public void filterLevel(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType level, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.UsersCallback callback) {
    }
    
    @java.lang.Override()
    public void bookingGifts(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType level, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.ShowBookingGiftsCallback callback) {
    }
    
    @java.lang.Override()
    public void filterGift(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType level, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.ShowGiftsCallback callback) {
    }
    
    public final int toInt(boolean $this$toInt) {
        return 0;
    }
    
    @java.lang.Override()
    public void updateAttendance(@org.jetbrains.annotations.Nullable()
    java.util.List<com.attendance.myproject.begory.data.Models.Attendance> listOfAttendence, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    @javax.inject.Inject()
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.FirebaseDatabase firebaseDatabase) {
        super();
    }
}