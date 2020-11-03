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
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0016J6\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/attendance/myproject/begory/data/source/AppRepository;", "Lcom/attendance/myproject/begory/data/source/BaseDataSource;", "mRemoteDataSource", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource;", "mPreferencesHelper", "Lcom/attendance/myproject/begory/data/source/local/prefs/PreferencesHelper;", "(Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource;Lcom/attendance/myproject/begory/data/source/local/prefs/PreferencesHelper;)V", "getUser", "", "callback", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$LoginCallback;", "login", "mobile", "", "password", "register", "admin", "Lcom/attendance/myproject/begory/data/source/remote/FirebaseFilterType$LevelFilterType;", "subAdmin", "studentLevel", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource$MessageCallback;", "setUser", "user", "Lcom/attendance/myproject/begory/data/Models/User;", "setUserAsLoggedOut", "Companion", "app_debug"})
public final class AppRepository implements com.attendance.myproject.begory.data.source.BaseDataSource {
    private final com.attendance.myproject.begory.data.source.remote.IRemoteDataSource mRemoteDataSource = null;
    private final com.attendance.myproject.begory.data.source.local.prefs.PreferencesHelper mPreferencesHelper = null;
    private static com.attendance.myproject.begory.data.source.AppRepository INSTANCE;
    public static final com.attendance.myproject.begory.data.source.AppRepository.Companion Companion = null;
    
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
    public void register(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType admin, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType subAdmin, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType studentLevel, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource.MessageCallback callback) {
    }
    
    public AppRepository(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource mRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.local.prefs.PreferencesHelper mPreferencesHelper) {
        super();
    }
    
    /**
     * Returns the single instance of this class, creating it if necessary.
     *
     * @param tasksRemoteDataSource the backend data source
     * @param tasksLocalDataSource  the device storage data source
     * @return the [AppRepository] instance
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.attendance.myproject.begory.data.source.AppRepository getInstance(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.remote.IRemoteDataSource mRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.local.prefs.PreferencesHelper mPreferencesHelper) {
        return null;
    }
    
    /**
     * Used to force [getInstance] to create a new instance
     * next time it's called.
     */
    public static final void destroyInstance() {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/attendance/myproject/begory/data/source/AppRepository$Companion;", "", "()V", "INSTANCE", "Lcom/attendance/myproject/begory/data/source/AppRepository;", "destroyInstance", "", "getInstance", "mRemoteDataSource", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource;", "mPreferencesHelper", "Lcom/attendance/myproject/begory/data/source/local/prefs/PreferencesHelper;", "app_debug"})
    public static final class Companion {
        
        /**
         * Returns the single instance of this class, creating it if necessary.
         *
         * @param tasksRemoteDataSource the backend data source
         * @param tasksLocalDataSource  the device storage data source
         * @return the [AppRepository] instance
         */
        @org.jetbrains.annotations.NotNull()
        public final com.attendance.myproject.begory.data.source.AppRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.attendance.myproject.begory.data.source.remote.IRemoteDataSource mRemoteDataSource, @org.jetbrains.annotations.NotNull()
        com.attendance.myproject.begory.data.source.local.prefs.PreferencesHelper mPreferencesHelper) {
            return null;
        }
        
        /**
         * Used to force [getInstance] to create a new instance
         * next time it's called.
         */
        public final void destroyInstance() {
        }
        
        private Companion() {
            super();
        }
    }
}