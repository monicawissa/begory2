package com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020#H\u0014J\u001a\u0010&\u001a\u00020#2\b\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016J\u0012\u0010+\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u0010\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e\u00a8\u00060"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/setting/showGiftsbooked/ShowGiftBookedActivity;", "Lcom/attendance/myproject/begory/presentationLayer/main/setting/BaseActivity1;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "()V", "binding", "Lcom/attendance/myproject/begory/databinding/ActivityShowRankBinding;", "layoutId", "", "getLayoutId", "()I", "list", "", "mLevelsList", "Ljava/util/ArrayList;", "Lcom/attendance/myproject/begory/data/Models/Level;", "recyclerViewAdapter", "Lcom/attendance/myproject/begory/presentationLayer/main/setting/showGiftsbooked/ShowGiftBookedAdapter;", "getRecyclerViewAdapter", "()Lcom/attendance/myproject/begory/presentationLayer/main/setting/showGiftsbooked/ShowGiftBookedAdapter;", "setRecyclerViewAdapter", "(Lcom/attendance/myproject/begory/presentationLayer/main/setting/showGiftsbooked/ShowGiftBookedAdapter;)V", "settingType", "", "getSettingType", "()Ljava/lang/String;", "setSettingType", "(Ljava/lang/String;)V", "showGiftBookedViewModel", "Lcom/attendance/myproject/begory/presentationLayer/main/setting/showGiftsbooked/ShowGiftBookedViewModel;", "getShowGiftBookedViewModel", "()Lcom/attendance/myproject/begory/presentationLayer/main/setting/showGiftsbooked/ShowGiftBookedViewModel;", "showGiftBookedViewModel$delegate", "Lkotlin/Lazy;", "fillMenu", "initLevelsSpinner", "", "initRecyclerView", "initializeView", "onCheckedChanged", "compoundButton", "Landroid/widget/CompoundButton;", "b", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "subscribeToNavigationChanges", "viewModelShow", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ShowGiftBookedActivity extends com.attendance.myproject.begory.presentationLayer.main.setting.BaseActivity1 implements android.widget.CompoundButton.OnCheckedChangeListener {
    private com.attendance.myproject.begory.databinding.ActivityShowRankBinding binding;
    private final java.util.ArrayList<com.attendance.myproject.begory.data.Models.Level> mLevelsList = null;
    private java.util.List<java.lang.Integer> list;
    private final kotlin.Lazy showGiftBookedViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked.ShowGiftBookedAdapter recyclerViewAdapter;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String settingType;
    private java.util.HashMap _$_findViewCache;
    
    private final com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked.ShowGiftBookedViewModel getShowGiftBookedViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked.ShowGiftBookedAdapter getRecyclerViewAdapter() {
        return null;
    }
    
    public final void setRecyclerViewAdapter(@org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked.ShowGiftBookedAdapter p0) {
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
    
    private final java.util.List<java.lang.Integer> fillMenu() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void initLevelsSpinner() {
    }
    
    @java.lang.Override()
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable()
    android.widget.CompoundButton compoundButton, boolean b) {
    }
    
    private final void subscribeToNavigationChanges(com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked.ShowGiftBookedViewModel viewModelShow) {
    }
    
    public ShowGiftBookedActivity() {
        super();
    }
}