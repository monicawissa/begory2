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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;", "", "(Ljava/lang/String;I)V", "College", "Grad", "app_debug"})
    public static enum LevelFilterType {
        /*public static final*/ College /* = new College() */,
        /*public static final*/ Grad /* = new Grad() */;
        
        LevelFilterType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$Companion;", "", "()V", "studentAttendance", "", "users", "fbConvert", "Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;", "i", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType fbConvert(int i) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}