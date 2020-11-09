package com.attendance.myproject.begory.di.module;

import java.lang.System;

/**
 * Created by amitshekhar on 07/07/17.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/attendance/myproject/begory/di/module/AppModule;", "", "()V", "provideAppPreferencesHelper", "Lcom/attendance/myproject/begory/data/source/local/prefs/IPreferencesHelper;", "appPreferencesHelper", "Lcom/attendance/myproject/begory/data/source/local/prefs/AppPreferencesHelper;", "providePreferenceName", "", "provideRemoteDataSource", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource;", "mRemoteDataSource", "Lcom/attendance/myproject/begory/data/source/remote/RemoteDataSource;", "provideRepository", "Lcom/attendance/myproject/begory/data/source/BaseDataSource;", "mPreferencesHelper", "provideSavePref", "Lcom/attendance/myproject/begory/data/source/local/prefs/SavePrefs;", "Lcom/attendance/myproject/begory/data/Models/User;", "activity", "Landroid/content/Context;", "cls", "Ljava/lang/Class;", "providefirebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "app_debug"})
@dagger.Module()
public final class AppModule {
    public static final com.attendance.myproject.begory.di.module.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.attendance.myproject.begory.data.source.remote.IRemoteDataSource provideRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.RemoteDataSource mRemoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.firebase.database.FirebaseDatabase providefirebaseDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.attendance.myproject.begory.di.PreferenceInfo()
    @dagger.Provides()
    public final java.lang.String providePreferenceName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.attendance.myproject.begory.data.source.local.prefs.SavePrefs<com.attendance.myproject.begory.data.Models.User> provideSavePref(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context activity, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?> cls) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.attendance.myproject.begory.data.source.local.prefs.IPreferencesHelper provideAppPreferencesHelper(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper appPreferencesHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.attendance.myproject.begory.data.source.BaseDataSource provideRepository(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.RemoteDataSource mRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper mPreferencesHelper) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}