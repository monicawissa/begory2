package com.attendance.myproject.begory.presentationLayer.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/login/LoginActivity;", "Lcom/attendance/myproject/begory/presentationLayer/BaseActivity;", "Lcom/attendance/myproject/begory/presentationLayer/login/LoginNavigator;", "()V", "binding", "Lcom/attendance/myproject/begory/databinding/ActivityLoginBinding;", "layoutId", "", "getLayoutId", "()I", "loginViewModel", "Lcom/attendance/myproject/begory/presentationLayer/login/LoginViewModel;", "getLoginViewModel", "()Lcom/attendance/myproject/begory/presentationLayer/login/LoginViewModel;", "loginViewModel$delegate", "Lkotlin/Lazy;", "initializeView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openMainActivity", "second", "Lcom/attendance/myproject/begory/data/Models/User;", "subscribeToNavigationChanges", "viewModel", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginActivity extends com.attendance.myproject.begory.presentationLayer.BaseActivity implements com.attendance.myproject.begory.presentationLayer.login.LoginNavigator {
    private com.attendance.myproject.begory.databinding.ActivityLoginBinding binding;
    private final kotlin.Lazy loginViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.attendance.myproject.begory.presentationLayer.login.LoginViewModel getLoginViewModel() {
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
    public void openMainActivity(@org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.Models.User second) {
    }
    
    private final void subscribeToNavigationChanges(com.attendance.myproject.begory.presentationLayer.login.LoginViewModel viewModel) {
    }
    
    public LoginActivity() {
        super();
    }
}