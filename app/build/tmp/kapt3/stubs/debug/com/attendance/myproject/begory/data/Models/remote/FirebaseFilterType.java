package com.attendance.myproject.begory.data.Models.remote;

import java.lang.System;

/**
 * Used with the filter spinner in the tasks list.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType;", "", "()V", "Companion", "LevelFilterType", "app_debug"})
public final class FirebaseFilterType {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String users = "Users";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String studentAttendance = "StudentAttendances";
    public static final com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.Companion Companion = null;
    
    public FirebaseFilterType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;", "", "(Ljava/lang/String;I)V", "No", "College11", "College12", "College13", "College14", "Grad", "app_debug"})
    public static enum LevelFilterType {
        /*public static final*/ No /* = new No() */,
        /*public static final*/ College11 /* = new College11() */,
        /*public static final*/ College12 /* = new College12() */,
        /*public static final*/ College13 /* = new College13() */,
        /*public static final*/ College14 /* = new College14() */,
        /*public static final*/ Grad /* = new Grad() */;
        
        LevelFilterType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$Companion;", "", "()V", "studentAttendance", "", "users", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}