package com.attendance.myproject.begory.presentationLayer.main;

import java.lang.System;

/**
 * Created by amitshekhar on 09/07/17.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/MainNavigator;", "", "openLoginActivity", "", "showMessage", "meassage", "", "app_debug"})
public abstract interface MainNavigator {
    
    public abstract void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String meassage);
    
    public abstract void openLoginActivity();
}