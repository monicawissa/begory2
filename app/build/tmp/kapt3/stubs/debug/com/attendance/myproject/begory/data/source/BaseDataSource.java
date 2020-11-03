package com.attendance.myproject.begory.data.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/attendance/myproject/begory/data/source/BaseDataSource;", "Lcom/attendance/myproject/begory/data/source/local/prefs/PreferencesHelper;", "Lcom/attendance/myproject/begory/data/source/remote/IRemoteDataSource;", "LoggedInMode", "app_debug"})
public abstract interface BaseDataSource extends com.attendance.myproject.begory.data.source.local.prefs.PreferencesHelper, com.attendance.myproject.begory.data.source.remote.IRemoteDataSource {
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/attendance/myproject/begory/data/source/BaseDataSource$LoggedInMode;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "LOGGED_IN_MODE_LOGGED_OUT", "LOGGED_IN_MODE_GOOGLE", "LOGGED_IN_MODE_FB", "LOGGED_IN_MODE_SERVER", "app_debug"})
    public static enum LoggedInMode {
        /*public static final*/ LOGGED_IN_MODE_LOGGED_OUT /* = new LOGGED_IN_MODE_LOGGED_OUT(0) */,
        /*public static final*/ LOGGED_IN_MODE_GOOGLE /* = new LOGGED_IN_MODE_GOOGLE(0) */,
        /*public static final*/ LOGGED_IN_MODE_FB /* = new LOGGED_IN_MODE_FB(0) */,
        /*public static final*/ LOGGED_IN_MODE_SERVER /* = new LOGGED_IN_MODE_SERVER(0) */;
        private final int type = 0;
        
        public final int getType() {
            return 0;
        }
        
        LoggedInMode(int type) {
        }
    }
}