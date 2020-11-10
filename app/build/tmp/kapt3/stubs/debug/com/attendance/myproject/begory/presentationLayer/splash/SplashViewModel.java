package com.attendance.myproject.begory.presentationLayer.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\nH\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/splash/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "appRepository", "Lcom/attendance/myproject/begory/data/source/AppRepository;", "networkHelper", "Lcom/attendance/myproject/begory/di/module/NetworkHelper;", "(Lcom/attendance/myproject/begory/data/source/AppRepository;Lcom/attendance/myproject/begory/di/module/NetworkHelper;)V", "msnackbarText", "Landroidx/lifecycle/MutableLiveData;", "Lcom/attendance/myproject/begory/Utilities/ggle/Event;", "", "msnackbarText2", "", "msplashState", "Lcom/attendance/myproject/begory/presentationLayer/splash/SplashViewModel$SplashState;", "snackbarMessage", "Landroidx/lifecycle/LiveData;", "getSnackbarMessage", "()Landroidx/lifecycle/LiveData;", "snackbarMessage2", "getSnackbarMessage2", "splashState", "getSplashState", "showSnackbarMessage", "", "message", "showSnackbarMessage2", "SplashState", "app_debug"})
public final class SplashViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.attendance.myproject.begory.presentationLayer.splash.SplashViewModel.SplashState> msplashState = null;
    private final androidx.lifecycle.MutableLiveData<com.attendance.myproject.begory.Utilities.ggle.Event<java.lang.Integer>> msnackbarText = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> msnackbarText2 = null;
    private final com.attendance.myproject.begory.data.source.AppRepository appRepository = null;
    private final com.attendance.myproject.begory.di.module.NetworkHelper networkHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.attendance.myproject.begory.presentationLayer.splash.SplashViewModel.SplashState> getSplashState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.attendance.myproject.begory.Utilities.ggle.Event<java.lang.Integer>> getSnackbarMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getSnackbarMessage2() {
        return null;
    }
    
    private final void showSnackbarMessage(@androidx.annotation.StringRes()
    int message) {
    }
    
    private final void showSnackbarMessage2(java.lang.String message) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.AppRepository appRepository, @org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.di.module.NetworkHelper networkHelper) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/splash/SplashViewModel$SplashState;", "", "()V", "LoginActivity", "MainActivity", "Lcom/attendance/myproject/begory/presentationLayer/splash/SplashViewModel$SplashState$MainActivity;", "Lcom/attendance/myproject/begory/presentationLayer/splash/SplashViewModel$SplashState$LoginActivity;", "app_debug"})
    public static abstract class SplashState {
        
        private SplashState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/splash/SplashViewModel$SplashState$MainActivity;", "Lcom/attendance/myproject/begory/presentationLayer/splash/SplashViewModel$SplashState;", "()V", "app_debug"})
        public static final class MainActivity extends com.attendance.myproject.begory.presentationLayer.splash.SplashViewModel.SplashState {
            
            public MainActivity() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/splash/SplashViewModel$SplashState$LoginActivity;", "Lcom/attendance/myproject/begory/presentationLayer/splash/SplashViewModel$SplashState;", "()V", "app_debug"})
        public static final class LoginActivity extends com.attendance.myproject.begory.presentationLayer.splash.SplashViewModel.SplashState {
            
            public LoginActivity() {
                super();
            }
        }
    }
}