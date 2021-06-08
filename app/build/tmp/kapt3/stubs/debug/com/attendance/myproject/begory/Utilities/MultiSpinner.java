package com.attendance.myproject.begory.Utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001!B\u0011\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006B\u001b\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB#\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J \u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J(\u0010\u001f\u001a\u00020\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\b\u0010 \u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/attendance/myproject/begory/Utilities/MultiSpinner;", "Landroidx/appcompat/widget/AppCompatSpinner;", "Landroid/content/DialogInterface$OnMultiChoiceClickListener;", "Landroid/content/DialogInterface$OnCancelListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "arg0", "arg1", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "arg2", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defaultText", "", "items", "", "listener", "Lcom/attendance/myproject/begory/Utilities/MultiSpinner$MultiSpinnerListener;", "selected", "", "onCancel", "", "dialog", "Landroid/content/DialogInterface;", "onClick", "which", "isChecked", "", "performClick", "setItems", "allText", "MultiSpinnerListener", "app_debug"})
public final class MultiSpinner extends androidx.appcompat.widget.AppCompatSpinner implements android.content.DialogInterface.OnMultiChoiceClickListener, android.content.DialogInterface.OnCancelListener {
    private java.util.List<java.lang.String> items;
    private boolean[] selected;
    private java.lang.String defaultText;
    private com.attendance.myproject.begory.Utilities.MultiSpinner.MultiSpinnerListener listener;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog, int which, boolean isChecked) {
    }
    
    @java.lang.Override()
    public void onCancel(@org.jetbrains.annotations.Nullable()
    android.content.DialogInterface dialog) {
    }
    
    @java.lang.Override()
    public boolean performClick() {
        return false;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> items, @org.jetbrains.annotations.Nullable()
    java.lang.String allText, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.Utilities.MultiSpinner.MultiSpinnerListener listener) {
    }
    
    public MultiSpinner(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    public MultiSpinner(@org.jetbrains.annotations.Nullable()
    android.content.Context arg0, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet arg1) {
        super(null);
    }
    
    public MultiSpinner(@org.jetbrains.annotations.Nullable()
    android.content.Context arg0, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet arg1, int arg2) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0018\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/attendance/myproject/begory/Utilities/MultiSpinner$MultiSpinnerListener;", "", "onItemsSelected", "", "selected", "", "app_debug"})
    public static abstract interface MultiSpinnerListener {
        
        public abstract void onItemsSelected(@org.jetbrains.annotations.Nullable()
        boolean[] selected);
    }
}