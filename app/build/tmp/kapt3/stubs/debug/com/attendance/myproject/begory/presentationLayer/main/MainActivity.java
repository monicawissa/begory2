package com.attendance.myproject.begory.presentationLayer.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/MainActivity;", "Lcom/attendance/myproject/begory/presentationLayer/BaseActivity;", "Lcom/attendance/myproject/begory/presentationLayer/main/MainNavigator;", "()V", "binding", "Lcom/attendance/myproject/begory/databinding/ActivityMainBinding;", "layoutId", "", "getLayoutId", "()I", "mainViewModel", "Lcom/attendance/myproject/begory/presentationLayer/main/MainViewModel;", "getMainViewModel", "()Lcom/attendance/myproject/begory/presentationLayer/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "navController", "Landroidx/navigation/NavController;", "initializeView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onNavigationItemSelected", "", "openLoginActivity", "subscribeToNavigationChanges", "viewModel", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends com.attendance.myproject.begory.presentationLayer.BaseActivity implements com.attendance.myproject.begory.presentationLayer.main.MainNavigator {
    private com.attendance.myproject.begory.databinding.ActivityMainBinding binding;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private androidx.navigation.NavController navController;
    private java.util.HashMap _$_findViewCache;
    
    private final com.attendance.myproject.begory.presentationLayer.main.MainViewModel getMainViewModel() {
        return null;
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
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public void openLoginActivity() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object onNavigationItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return null;
    }
    
    private final void subscribeToNavigationChanges(com.attendance.myproject.begory.presentationLayer.main.MainViewModel viewModel) {
    }
    
    public MainActivity() {
        super();
    }
}