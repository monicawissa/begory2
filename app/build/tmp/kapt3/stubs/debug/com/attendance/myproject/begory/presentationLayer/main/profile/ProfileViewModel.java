package com.attendance.myproject.begory.presentationLayer.main.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u00020\nH\u0002J\u0006\u0010?\u001a\u00020=J\u0010\u0010@\u001a\u00020=2\u0006\u0010A\u001a\u000207H\u0002J\u0012\u0010B\u001a\u00020=2\b\b\u0001\u0010C\u001a\u00020%H\u0002J\u0010\u0010D\u001a\u00020=2\u0006\u0010C\u001a\u00020\u000fH\u0002J\u0006\u0010E\u001a\u00020=R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0011R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0011R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000f0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0011R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u00178F\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u0019R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00178F\u00a2\u0006\u0006\u001a\u0004\b3\u0010\u0019R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0011R\u001a\u00106\u001a\u000207X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;\u00a8\u0006F"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "appRepository", "Lcom/attendance/myproject/begory/data/source/AppRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/attendance/myproject/begory/data/source/AppRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_dataLoading", "Landroidx/lifecycle/MutableLiveData;", "", "_isBtnAvailable", "_ishideKeyboard", "_isopenLogin", "address", "", "getAddress", "()Landroidx/lifecycle/MutableLiveData;", "balancePrice", "getBalancePrice", "balanceRealPrice", "getBalanceRealPrice", "dataLoading", "Landroidx/lifecycle/LiveData;", "getDataLoading", "()Landroidx/lifecycle/LiveData;", "isBtnAvailable", "ishideKeyboard", "getIshideKeyboard", "isopenLogin", "getIsopenLogin", "mobile", "getMobile", "mobile2", "getMobile2", "msnackbarText", "Lcom/attendance/myproject/begory/Utilities/ggle/Event;", "", "msnackbarText2", "name", "getName", "password", "getPassword", "selectedData", "getSelectedData", "()Ljava/lang/String;", "setSelectedData", "(Ljava/lang/String;)V", "snackbarMessage", "getSnackbarMessage", "snackbarMessage2", "getSnackbarMessage2", "studentLevel", "getStudentLevel", "usertmp", "Lcom/attendance/myproject/begory/data/Models/User;", "getUsertmp", "()Lcom/attendance/myproject/begory/data/Models/User;", "setUsertmp", "(Lcom/attendance/myproject/begory/data/Models/User;)V", "getUser", "", "isDataValid", "logout", "setuser", "user", "showSnackbarMessage", "message", "showSnackbarMessage2", "update", "app_debug"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private com.attendance.myproject.begory.data.Models.User usertmp;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> name = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mobile = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mobile2 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> password = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> address = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> balanceRealPrice = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> balancePrice = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> studentLevel = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedData = "";
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isBtnAvailable = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isopenLogin = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _dataLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _ishideKeyboard = null;
    private final androidx.lifecycle.MutableLiveData<com.attendance.myproject.begory.Utilities.ggle.Event<java.lang.Integer>> msnackbarText = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> msnackbarText2 = null;
    private final com.attendance.myproject.begory.data.source.AppRepository appRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.attendance.myproject.begory.data.Models.User getUsertmp() {
        return null;
    }
    
    public final void setUsertmp(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMobile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMobile2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getBalanceRealPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getBalancePrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getStudentLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedData() {
        return null;
    }
    
    public final void setSelectedData(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isBtnAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getIsopenLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getDataLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getIshideKeyboard() {
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
    
    private final void getUser() {
    }
    
    private final void setuser(com.attendance.myproject.begory.data.Models.User user) {
    }
    
    private final void showSnackbarMessage(@androidx.annotation.StringRes()
    int message) {
    }
    
    private final void showSnackbarMessage2(java.lang.String message) {
    }
    
    private final boolean isDataValid() {
        return false;
    }
    
    public final void update() {
    }
    
    public final void logout() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.AppRepository appRepository, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}