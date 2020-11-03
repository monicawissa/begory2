package com.attendance.myproject.begory.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J6\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u0015H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/attendance/myproject/begory/data/source/remote/RemoteDataSource;", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource;", "()V", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "getFirebaseDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "firebaseDatabase$delegate", "Lkotlin/Lazy;", "login", "", "mobile", "", "password", "callback", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$LoginCallback;", "register", "admin", "Lcom/attendance/myproject/begory/data/source/remote/FirebaseFilterType$LevelFilterType;", "subAdmin", "studentLevel", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$MessageCallback;", "Companion", "app_debug"})
public final class RemoteDataSource implements com.attendance.myproject.begory.data.source.remote.IRemoteDataSource {
    private final kotlin.Lazy firebaseDatabase$delegate = null;
    private static com.attendance.myproject.begory.data.source.remote.RemoteDataSource INSTANCE;
    public static final com.attendance.myproject.begory.data.source.remote.RemoteDataSource.Companion Companion = null;
    
    private final com.google.firebase.database.FirebaseDatabase getFirebaseDatabase() {
        return null;
    }
    
    @java.lang.Override()
    public void login(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.LoginCallback callback) {
    }
    
    @java.lang.Override()
    public void register(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType admin, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType subAdmin, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType studentLevel, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    public RemoteDataSource() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.attendance.myproject.begory.data.source.remote.RemoteDataSource getInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/attendance/myproject/begory/data/source/remote/RemoteDataSource$Companion;", "", "()V", "INSTANCE", "Lcom/attendance/myproject/begory/data/source/remote/RemoteDataSource;", "clearInstance", "", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.attendance.myproject.begory.data.source.remote.RemoteDataSource getInstance() {
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