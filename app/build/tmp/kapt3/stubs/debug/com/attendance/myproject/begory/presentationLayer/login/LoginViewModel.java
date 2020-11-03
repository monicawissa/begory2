package com.attendance.myproject.begory.presentationLayer.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020\u0007H\u0002J\u0006\u0010 \u001a\u00020!J\u0012\u0010\"\u001a\u00020!2\b\b\u0001\u0010#\u001a\u00020\u0016H\u0002J\u0010\u0010$\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000fH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\n8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\f\u00a8\u0006%"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "appRepository", "Lcom/attendance/myproject/begory/data/source/AppRepository;", "(Lcom/attendance/myproject/begory/data/source/AppRepository;)V", "_dataLoading", "Landroidx/lifecycle/MutableLiveData;", "", "_isDataAvailable", "dataLoading", "Landroidx/lifecycle/LiveData;", "getDataLoading", "()Landroidx/lifecycle/LiveData;", "isDataAvailable", "mobile", "", "getMobile", "()Ljava/lang/String;", "setMobile", "(Ljava/lang/String;)V", "msnackbarText", "Lcom/attendance/myproject/begory/Utilities/ggle/Event;", "", "msnackbarText2", "password", "getPassword", "setPassword", "snackbarMessage", "getSnackbarMessage", "snackbarMessage2", "getSnackbarMessage2", "ismobileAndPasswordValid", "login", "", "showSnackbarMessage", "message", "showSnackbarMessage2", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mobile = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String password = "";
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isDataAvailable = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _dataLoading = null;
    private final androidx.lifecycle.MutableLiveData<com.attendance.myproject.begory.Utilities.ggle.Event<java.lang.Integer>> msnackbarText = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> msnackbarText2 = null;
    private final com.attendance.myproject.begory.data.source.AppRepository appRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMobile() {
        return null;
    }
    
    public final void setMobile(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isDataAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getDataLoading() {
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
    
    private final boolean ismobileAndPasswordValid() {
        return false;
    }
    
    public final void login() {
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.AppRepository appRepository) {
        super();
    }
}