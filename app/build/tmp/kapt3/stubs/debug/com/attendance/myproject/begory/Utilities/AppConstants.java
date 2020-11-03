package com.attendance.myproject.begory.Utilities;

import java.lang.System;

/**
 * Created by amitshekhar on 07/07/17.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/attendance/myproject/begory/Utilities/AppConstants;", "", "()V", "API_STATUS_CODE_LOCAL_ERROR", "", "DB_NAME", "", "NULL_INDEX", "", "PREF_NAME", "SEED_DATABASE_OPTIONS", "SEED_DATABASE_QUESTIONS", "STATUS_CODE_FAILED", "STATUS_CODE_SUCCESS", "TIMESTAMP_FORMAT", "app_debug"})
public final class AppConstants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_NAME = "Begory_pref";
    public static final int API_STATUS_CODE_LOCAL_ERROR = 0;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DB_NAME = "mindorks_mvvm.db";
    public static final long NULL_INDEX = -1L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEED_DATABASE_OPTIONS = "seed/options.json";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEED_DATABASE_QUESTIONS = "seed/questions.json";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATUS_CODE_FAILED = "failed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATUS_CODE_SUCCESS = "success";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TIMESTAMP_FORMAT = "yyyyMMdd_HHmmss";
    public static final com.attendance.myproject.begory.Utilities.AppConstants INSTANCE = null;
    
    private AppConstants() {
        super();
    }
}