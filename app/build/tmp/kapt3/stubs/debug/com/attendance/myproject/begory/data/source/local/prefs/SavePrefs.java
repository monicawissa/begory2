package com.attendance.myproject.begory.data.source.local.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/attendance/myproject/begory/data/source/local/prefs/SavePrefs;", "T", "", "activity", "Landroid/content/Context;", "cls", "Ljava/lang/Class;", "(Landroid/content/Context;Ljava/lang/Class;)V", "USER_PREFS_FILE_NAME", "", "prefs", "Landroid/content/SharedPreferences;", "clear", "", "load", "Pref_key", "(Ljava/lang/String;)Ljava/lang/Object;", "save", "obj", "(Ljava/lang/String;Ljava/lang/Object;)V", "app_debug"})
public final class SavePrefs<T extends java.lang.Object> {
    private final java.lang.String USER_PREFS_FILE_NAME = "Begory_pref";
    private final android.content.SharedPreferences prefs = null;
    private final java.lang.Class<?> cls = null;
    
    public final void save(@org.jetbrains.annotations.NotNull()
    java.lang.String Pref_key, T obj) {
    }
    
    public final T load(@org.jetbrains.annotations.NotNull()
    java.lang.String Pref_key) {
        return null;
    }
    
    public final void clear() {
    }
    
    public SavePrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context activity, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?> cls) {
        super();
    }
}