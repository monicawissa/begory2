package com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010?\u001a\u00020@J\u0006\u0010A\u001a\u00020@J\b\u0010B\u001a\u00020@H\u0002J\u0010\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020\'H\u0002J\u0012\u0010E\u001a\u00020@2\b\b\u0001\u0010F\u001a\u00020\'H\u0002J\u0010\u0010G\u001a\u00020@2\u0006\u0010F\u001a\u00020!H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u0011R*\u0010.\u001a\u0012\u0012\u0004\u0012\u00020/0\u0016j\b\u0012\u0004\u0012\u00020/`\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR\u001e\u00102\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'090\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020!0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'090\u000f8F\u00a2\u0006\u0006\u001a\u0004\b<\u0010\u0011R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020!0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b>\u0010\u0011\u00a8\u0006H"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/attendence/takeAttendance/LevelAttendViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "appRepository", "Lcom/attendance/myproject/begory/data/source/AppRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/attendance/myproject/begory/data/source/AppRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_dataLoading", "Landroidx/lifecycle/MutableLiveData;", "", "_isCheckBtnAvailable", "_ishideKeyboard", "_mStudentAttendancesList", "dataLoading", "Landroidx/lifecycle/LiveData;", "getDataLoading", "()Landroidx/lifecycle/LiveData;", "isCheckBtnAvailable", "ishideKeyboard", "getIshideKeyboard", "mList", "Ljava/util/ArrayList;", "Lcom/attendance/myproject/begory/data/Models/Attendance;", "Lkotlin/collections/ArrayList;", "getMList", "()Ljava/util/ArrayList;", "setMList", "(Ljava/util/ArrayList;)V", "mListLast", "getMListLast", "setMListLast", "mSelectedDate", "", "getMSelectedDate", "()Ljava/lang/String;", "setMSelectedDate", "(Ljava/lang/String;)V", "mSelectedTermId", "", "getMSelectedTermId", "()I", "setMSelectedTermId", "(I)V", "mStudentAttendancesList", "getMStudentAttendancesList", "mStudentList", "Lcom/attendance/myproject/begory/data/Models/User;", "getMStudentList", "setMStudentList", "mTitleTV", "getMTitleTV", "()Ljava/lang/Integer;", "setMTitleTV", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "msnackbarText", "Lcom/attendance/myproject/begory/Utilities/ggle/Event;", "msnackbarText2", "snackbarMessage", "getSnackbarMessage", "snackbarMessage2", "getSnackbarMessage2", "btnadd", "", "getStudentList", "manageStudentWithAttendance", "setEmptyAttendance", "i", "showSnackbarMessage", "message", "showSnackbarMessage2", "app_debug"})
public final class LevelAttendViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.attendance.myproject.begory.data.Models.User> mStudentList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.attendance.myproject.begory.data.Models.Attendance> mListLast;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mSelectedDate = "";
    private int mSelectedTermId = 0;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _mStudentAttendancesList = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer mTitleTV;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isCheckBtnAvailable = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _dataLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _ishideKeyboard = null;
    private final androidx.lifecycle.MutableLiveData<com.attendance.myproject.begory.Utilities.ggle.Event<java.lang.Integer>> msnackbarText = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> msnackbarText2 = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.attendance.myproject.begory.data.Models.Attendance> mList;
    private final com.attendance.myproject.begory.data.source.AppRepository appRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.attendance.myproject.begory.data.Models.User> getMStudentList() {
        return null;
    }
    
    public final void setMStudentList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.attendance.myproject.begory.data.Models.User> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.attendance.myproject.begory.data.Models.Attendance> getMListLast() {
        return null;
    }
    
    public final void setMListLast(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.attendance.myproject.begory.data.Models.Attendance> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMSelectedDate() {
        return null;
    }
    
    public final void setMSelectedDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getMSelectedTermId() {
        return 0;
    }
    
    public final void setMSelectedTermId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getMStudentAttendancesList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMTitleTV() {
        return null;
    }
    
    public final void setMTitleTV(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
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
    
    private final void showSnackbarMessage(@androidx.annotation.StringRes()
    int message) {
    }
    
    private final void showSnackbarMessage2(java.lang.String message) {
    }
    
    public final void getStudentList() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.attendance.myproject.begory.data.Models.Attendance> getMList() {
        return null;
    }
    
    public final void setMList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.attendance.myproject.begory.data.Models.Attendance> p0) {
    }
    
    private final void manageStudentWithAttendance() {
    }
    
    private final void setEmptyAttendance(int i) {
    }
    
    public final void btnadd() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public LevelAttendViewModel(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.source.AppRepository appRepository, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}