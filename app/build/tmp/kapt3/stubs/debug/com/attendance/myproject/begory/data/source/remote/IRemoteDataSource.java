package com.attendance.myproject.begory.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0005()*+,J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0011H&J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0018H&J \u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0011H&J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\nH&J \u0010!\u001a\u00020\u00032\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH&J \u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u0011H&J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\'\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006-"}, d2 = {"Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource;", "", "addGift", "", "gift", "Lcom/attendance/myproject/begory/data/Models/Gift;", "level", "", "Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;", "callback", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$MessageCallback;", "bookingGifts", "showBookingGiftsCallback", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$ShowBookingGiftsCallback;", "checkUserExist", "mobile", "", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$LoginCallback;", "deleteGift", "filterGift", "studentLevel", "giftsCallback", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$ShowGiftsCallback;", "filterLevel", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$UsersCallback;", "login", "password", "registerAdmin", "user", "Lcom/attendance/myproject/begory/data/Models/User;", "registerStudent", "registerSubAdmin", "updateAdmin", "updateAttendance", "listOfAttendence", "Lcom/attendance/myproject/begory/data/Models/Attendance;", "updateGift", "updatePassword", "updateStudent", "updateSubAdmin", "LoginCallback", "MessageCallback", "ShowBookingGiftsCallback", "ShowGiftsCallback", "UsersCallback", "app_debug"})
public abstract interface IRemoteDataSource {
    
    public abstract void addGift(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.Gift gift, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType> level, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback);
    
    public abstract void updateGift(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.Gift gift, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType level, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback);
    
    public abstract void deleteGift(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.Gift gift, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType level, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback);
    
    public abstract void login(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.LoginCallback callback);
    
    public abstract void registerStudent(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback);
    
    public abstract void registerSubAdmin(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback);
    
    public abstract void registerAdmin(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback);
    
    public abstract void checkUserExist(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.LoginCallback callback);
    
    public abstract void updateStudent(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback);
    
    public abstract void updateSubAdmin(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback);
    
    public abstract void updateAdmin(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback);
    
    public abstract void updatePassword(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User user, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.LoginCallback callback);
    
    public abstract void filterLevel(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType level, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.UsersCallback callback);
    
    public abstract void updateAttendance(@org.jetbrains.annotations.Nullable()
    java.util.List<com.attendance.myproject.begory.data.Models.Attendance> listOfAttendence, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback);
    
    public abstract void filterGift(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType studentLevel, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.ShowGiftsCallback giftsCallback);
    
    public abstract void bookingGifts(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType level, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.ShowBookingGiftsCallback showBookingGiftsCallback);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$LoginCallback;", "", "onDataNotAvailable", "", "message", "", "(Ljava/lang/Integer;)V", "onResponse", "user", "Lcom/attendance/myproject/begory/data/Models/User;", "app_debug"})
    public static abstract interface LoginCallback {
        
        public abstract void onResponse(@org.jetbrains.annotations.NotNull()
        com.attendance.myproject.begory.data.Models.User user);
        
        public abstract void onDataNotAvailable(@org.jetbrains.annotations.Nullable()
        java.lang.Integer message);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$UsersCallback;", "", "onDataNotAvailable", "", "message", "", "(Ljava/lang/Integer;)V", "onResponse", "user", "", "Lcom/attendance/myproject/begory/data/Models/User;", "app_debug"})
    public static abstract interface UsersCallback {
        
        public abstract void onResponse(@org.jetbrains.annotations.NotNull()
        java.util.List<com.attendance.myproject.begory.data.Models.User> user);
        
        public abstract void onDataNotAvailable(@org.jetbrains.annotations.Nullable()
        java.lang.Integer message);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$MessageCallback;", "", "onDataNotAvailable", "", "message", "", "(Ljava/lang/Integer;)V", "onResponse", "app_debug"})
    public static abstract interface MessageCallback {
        
        public abstract void onResponse(@org.jetbrains.annotations.Nullable()
        java.lang.Integer message);
        
        public abstract void onDataNotAvailable(@org.jetbrains.annotations.Nullable()
        java.lang.Integer message);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$ShowGiftsCallback;", "", "onDataNotAvailable", "", "message", "", "(Ljava/lang/Integer;)V", "onResponse", "gift", "", "Lcom/attendance/myproject/begory/data/Models/Gift;", "app_debug"})
    public static abstract interface ShowGiftsCallback {
        
        public abstract void onResponse(@org.jetbrains.annotations.NotNull()
        java.util.List<com.attendance.myproject.begory.data.Models.Gift> gift);
        
        public abstract void onDataNotAvailable(@org.jetbrains.annotations.Nullable()
        java.lang.Integer message);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$ShowBookingGiftsCallback;", "", "onDataNotAvailable", "", "message", "", "(Ljava/lang/Integer;)V", "onResponse", "users", "", "Lcom/attendance/myproject/begory/data/Models/User;", "app_debug"})
    public static abstract interface ShowBookingGiftsCallback {
        
        public abstract void onResponse(@org.jetbrains.annotations.NotNull()
        java.util.List<com.attendance.myproject.begory.data.Models.User> users);
        
        public abstract void onDataNotAvailable(@org.jetbrains.annotations.Nullable()
        java.lang.Integer message);
    }
}