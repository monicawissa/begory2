package com.attendance.myproject.begory.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J6\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/attendance/myproject/begory/data/source/remote/RemoteDataSource;", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource;", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "login", "", "mobile", "", "password", "callback", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$LoginCallback;", "register", "admin", "Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;", "subAdmin", "studentLevel", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$MessageCallback;", "app_debug"})
public final class RemoteDataSource implements com.attendance.myproject.begory.data.source.remote.IRemoteDataSource {
    private final com.google.firebase.database.FirebaseDatabase firebaseDatabase = null;
    
    @java.lang.Override()
    public void login(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.LoginCallback callback) {
    }
    
    @java.lang.Override()
    public void register(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType admin, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType subAdmin, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType studentLevel, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    @javax.inject.Inject()
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.FirebaseDatabase firebaseDatabase) {
        super();
    }
}