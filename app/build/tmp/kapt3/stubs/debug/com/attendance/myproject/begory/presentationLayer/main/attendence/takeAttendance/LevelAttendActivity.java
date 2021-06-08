package com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u001eH\u0014J\u0012\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\nH\u0002J\b\u0010&\u001a\u00020\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\'"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/attendence/takeAttendance/LevelAttendActivity;", "Lcom/attendance/myproject/begory/presentationLayer/main/setting/BaseActivity1;", "()V", "binding", "Lcom/attendance/myproject/begory/databinding/ActivityLevelAttendanceBinding;", "layoutId", "", "getLayoutId", "()I", "levelAttendViewModel", "Lcom/attendance/myproject/begory/presentationLayer/main/attendence/takeAttendance/LevelAttendViewModel;", "getLevelAttendViewModel", "()Lcom/attendance/myproject/begory/presentationLayer/main/attendence/takeAttendance/LevelAttendViewModel;", "levelAttendViewModel$delegate", "Lkotlin/Lazy;", "myCalendar", "Ljava/util/Calendar;", "recyclerViewAdapter", "Lcom/attendance/myproject/begory/presentationLayer/main/attendence/takeAttendance/StudentAttendanceAdapter;", "getRecyclerViewAdapter", "()Lcom/attendance/myproject/begory/presentationLayer/main/attendence/takeAttendance/StudentAttendanceAdapter;", "setRecyclerViewAdapter", "(Lcom/attendance/myproject/begory/presentationLayer/main/attendence/takeAttendance/StudentAttendanceAdapter;)V", "settingType", "", "getSettingType", "()Ljava/lang/String;", "setSettingType", "(Ljava/lang/String;)V", "init", "", "initRecyclerView", "initializeView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "subscribeToNavigationChanges", "viewModel", "updateLabel", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LevelAttendActivity extends com.attendance.myproject.begory.presentationLayer.main.setting.BaseActivity1 {
    private com.attendance.myproject.begory.databinding.ActivityLevelAttendanceBinding binding;
    private final kotlin.Lazy levelAttendViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.StudentAttendanceAdapter recyclerViewAdapter;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String settingType;
    private java.util.Calendar myCalendar;
    private java.util.HashMap _$_findViewCache;
    
    private final com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.LevelAttendViewModel getLevelAttendViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.StudentAttendanceAdapter getRecyclerViewAdapter() {
        return null;
    }
    
    public final void setRecyclerViewAdapter(@org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.StudentAttendanceAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSettingType() {
        return null;
    }
    
    public final void setSettingType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void initializeView() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void init() {
    }
    
    private final void updateLabel() {
    }
    
    private final void subscribeToNavigationChanges(com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.LevelAttendViewModel viewModel) {
    }
    
    public LevelAttendActivity() {
        super();
    }
}