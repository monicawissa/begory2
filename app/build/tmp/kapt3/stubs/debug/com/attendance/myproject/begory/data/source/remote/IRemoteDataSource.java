package com.attendance.myproject.begory.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u000f\u0010J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J6\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u000eH&\u00a8\u0006\u0011"}, d2 = {"Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource;", "", "login", "", "mobile", "", "password", "callback", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$LoginCallback;", "register", "admin", "Lcom/attendance/myproject/begory/data/source/remote/FirebaseFilterType$LevelFilterType;", "subAdmin", "studentLevel", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$MessageCallback;", "LoginCallback", "MessageCallback", "app_debug"})
public abstract interface IRemoteDataSource {
    
    public abstract void login(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.LoginCallback callback);
    
    public abstract void register(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType admin, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType subAdmin, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType studentLevel, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$LoginCallback;", "", "onDataNotAvailable", "", "message", "", "(Ljava/lang/Integer;)V", "onResponse", "user", "Lcom/attendance/myproject/begory/data/Models/User;", "app_debug"})
    public static abstract interface LoginCallback {
        
        public abstract void onResponse(@org.jetbrains.annotations.NotNull()
        com.attendance.myproject.begory.data.Models.User user);
        
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
}