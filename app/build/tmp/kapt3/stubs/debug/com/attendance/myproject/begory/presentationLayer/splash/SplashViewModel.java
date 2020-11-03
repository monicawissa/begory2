package com.attendance.myproject.begory.presentationLayer.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/splash/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "appRepository", "Lcom/attendance/myproject/begory/data/source/AppRepository;", "(Lcom/attendance/myproject/begory/data/source/AppRepository;)V", "mSplashState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/attendance/myproject/begory/presentationLayer/splash/SplashViewModel$SplashState;", "msnackbarText", "Lcom/attendance/myproject/begory/Utilities/ggle/Event;", "", "snackBarMessage", "Landroidx/lifecycle/LiveData;", "getSnackBarMessage", "()Landroidx/lifecycle/LiveData;", "splashState", "getSplashState", "decideState", "", "showSnackbarMessage", "message", "SplashState", "app_debug"})
public final class SplashViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.attendance.myproject.begory.presentationLayer.splash.SplashViewModel.SplashState> mSplashState = null;
    private final androidx.lifecycle.MutableLiveData<com.attendance.myproject.begory.Utilities.ggle.Event<java.lang.Integer>> msnackbarText = null;
    private final com.attendance.myproject.begory.data.source.AppRepository appRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.attendance.myproject.begory.presentationLayer.splash.SplashViewModel.SplashState> getSplashState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.attendance.myproject.begory.Utilities.ggle.Event<java.lang.Integer>> getSnackBarMessage() {
        return null;
    }
    
    private final void showSnackbarMessage(@androidx.annotation.StringRes()
    int message) {
    }
    
    private final void decideState() {
    }
    
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.AppRepository appRepository) {
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