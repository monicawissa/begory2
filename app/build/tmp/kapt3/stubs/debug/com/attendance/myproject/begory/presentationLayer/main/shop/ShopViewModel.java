package com.attendance.myproject.begory.presentationLayer.main.shop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010?\u001a\u00020@J\u0006\u0010A\u001a\u00020@J\b\u0010;\u001a\u00020@H\u0002J\u0012\u0010B\u001a\u00020@2\b\b\u0001\u0010C\u001a\u00020\u000fH\u0002J\u0010\u0010D\u001a\u00020@2\u0006\u0010C\u001a\u00020\u0011H\u0002J\u0006\u0010E\u001a\u00020@R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R*\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u00138F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0015R*\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR\u001c\u0010$\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00138F\u00a2\u0006\u0006\u001a\u0004\b0\u0010\u0015R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138F\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u0015R\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>\u00a8\u0006F"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/shop/ShopViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "appRepository", "Lcom/attendance/myproject/begory/data/source/AppRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/attendance/myproject/begory/data/source/AppRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_dataLoading", "Landroidx/lifecycle/MutableLiveData;", "", "_isCheckBtnAvailable", "_mGiftListListener", "_msnackbarText", "Lcom/attendance/myproject/begory/Utilities/ggle/Event;", "", "_msnackbarText2", "", "dataLoading", "Landroidx/lifecycle/LiveData;", "getDataLoading", "()Landroidx/lifecycle/LiveData;", "isCheckBtnAvailable", "mGiftList", "Ljava/util/ArrayList;", "Lcom/attendance/myproject/begory/data/Models/Gift;", "Lkotlin/collections/ArrayList;", "getMGiftList", "()Ljava/util/ArrayList;", "setMGiftList", "(Ljava/util/ArrayList;)V", "mGiftListListener", "getMGiftListListener", "mSelectedGifts", "getMSelectedGifts", "setMSelectedGifts", "mTitleTV", "getMTitleTV", "()Ljava/lang/String;", "setMTitleTV", "(Ljava/lang/String;)V", "mUserPrice", "", "getMUserPrice", "()D", "setMUserPrice", "(D)V", "snackbarMessage", "getSnackbarMessage", "snackbarMessage2", "getSnackbarMessage2", "studentLevel", "Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;", "getStudentLevel", "()Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;", "setStudentLevel", "(Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;)V", "user", "Lcom/attendance/myproject/begory/data/Models/User;", "getUser", "()Lcom/attendance/myproject/begory/data/Models/User;", "setUser", "(Lcom/attendance/myproject/begory/data/Models/User;)V", "btnadd", "", "getGiftsList", "showSnackbarMessage", "message", "showSnackbarMessage2", "update", "app_debug"})
public final class ShopViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.attendance.myproject.begory.data.Models.Gift> mGiftList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.attendance.myproject.begory.data.Models.Gift> mSelectedGifts;
    private double mUserPrice = 0.0;
    @org.jetbrains.annotations.Nullable()
    private com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType studentLevel;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _mGiftListListener = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mTitleTV;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isCheckBtnAvailable = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _dataLoading = null;
    private final androidx.lifecycle.MutableLiveData<com.attendance.myproject.begory.Utilities.ggle.Event<java.lang.Integer>> _msnackbarText = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _msnackbarText2 = null;
    @org.jetbrains.annotations.Nullable()
    private com.attendance.myproject.begory.data.Models.User user;
    private final com.attendance.myproject.begory.data.source.AppRepository appRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.attendance.myproject.begory.data.Models.Gift> getMGiftList() {
        return null;
    }
    
    public final void setMGiftList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.attendance.myproject.begory.data.Models.Gift> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.attendance.myproject.begory.data.Models.Gift> getMSelectedGifts() {
        return null;
    }
    
    public final void setMSelectedGifts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.attendance.myproject.begory.data.Models.Gift> p0) {
    }
    
    public final double getMUserPrice() {
        return 0.0;
    }
    
    public final void setMUserPrice(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType getStudentLevel() {
        return null;
    }
    
    public final void setStudentLevel(@org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getMGiftListListener() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMTitleTV() {
        return null;
    }
    
    public final void setMTitleTV(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isCheckBtnAvailable() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.attendance.myproject.begory.data.Models.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.Models.User p0) {
    }
    
    private final void getUser() {
    }
    
    public final void getGiftsList() {
    }
    
    public final void update() {
    }
    
    public final void btnadd() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public ShopViewModel(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.AppRepository appRepository, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}