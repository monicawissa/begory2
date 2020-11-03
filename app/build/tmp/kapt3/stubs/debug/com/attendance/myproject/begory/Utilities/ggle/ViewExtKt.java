package com.attendance.myproject.begory.Utilities.ggle;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\b\u001a\u001a\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b\u00a8\u0006\r"}, d2 = {"setupSnackbar", "", "Landroid/view/View;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "snackbarEvent", "Landroidx/lifecycle/LiveData;", "Lcom/attendance/myproject/begory/Utilities/ggle/Event;", "", "timeLength", "showSnackbar", "snackbarText", "", "app_debug"})
public final class ViewExtKt {
    
    /**
     * Transforms static java function Snackbar.make() to an extension function on View.
     */
    public static final void showSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showSnackbar, @org.jetbrains.annotations.NotNull()
    java.lang.String snackbarText, int timeLength) {
    }
    
    /**
     * Triggers a snackbar message when the value contained by snackbarTaskMessageLiveEvent is modified.
     */
    public static final void setupSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setupSnackbar, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.attendance.myproject.begory.Utilities.ggle.Event<java.lang.Integer>> snackbarEvent, int timeLength) {
    }
}