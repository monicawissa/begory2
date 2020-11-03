package com.attendance.myproject.begory.data.Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b>\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00bd\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010E\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u00c6\u0003J\t\u0010G\u001a\u00020\u0016H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u00c6\u0001\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u00c6\u0001\u00a2\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020\u00162\b\u0010S\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010T\u001a\u00020UH\u00d6\u0001J\t\u0010V\u001a\u00020\u0003H\u00d6\u0001R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR&\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u0010\u001bR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001bR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u0010\u001bR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0019\"\u0004\b:\u0010\u001bR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010\u001bR \u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001d\"\u0004\b>\u0010\u001fR \u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001d\"\u0004\b@\u0010\u001f\u00a8\u0006W"}, d2 = {"Lcom/attendance/myproject/begory/data/Models/User;", "", "id", "", "name", "mobile", "password", "mobile_password", "notes", "mobile2", "address", "adminLevel", "Lcom/attendance/myproject/begory/data/source/remote/FirebaseFilterType$LevelFilterType;", "subAdminLevel", "studentLevel", "balanceEqlomat", "", "balanceBegory", "listOfAttendence", "", "Lcom/attendance/myproject/begory/data/Models/Attendance;", "firstTime_ToLogin", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/attendance/myproject/begory/data/source/remote/FirebaseFilterType$LevelFilterType;Lcom/attendance/myproject/begory/data/source/remote/FirebaseFilterType$LevelFilterType;Lcom/attendance/myproject/begory/data/source/remote/FirebaseFilterType$LevelFilterType;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Z)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getAdminLevel", "()Lcom/attendance/myproject/begory/data/source/remote/FirebaseFilterType$LevelFilterType;", "setAdminLevel", "(Lcom/attendance/myproject/begory/data/source/remote/FirebaseFilterType$LevelFilterType;)V", "getBalanceBegory", "()Ljava/lang/Double;", "setBalanceBegory", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getBalanceEqlomat", "setBalanceEqlomat", "getFirstTime_ToLogin", "()Z", "setFirstTime_ToLogin", "(Z)V", "getId", "setId", "getListOfAttendence", "()Ljava/util/List;", "setListOfAttendence", "(Ljava/util/List;)V", "getMobile", "setMobile", "getMobile2", "setMobile2", "getMobile_password", "setMobile_password", "getName", "setName", "getNotes", "setNotes", "getPassword", "setPassword", "getStudentLevel", "setStudentLevel", "getSubAdminLevel", "setSubAdminLevel", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/attendance/myproject/begory/data/source/remote/FirebaseFilterType$LevelFilterType;Lcom/attendance/myproject/begory/data/source/remote/FirebaseFilterType$LevelFilterType;Lcom/attendance/myproject/begory/data/source/remote/FirebaseFilterType$LevelFilterType;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Z)Lcom/attendance/myproject/begory/data/Models/User;", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class User {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "mobile")
    private java.lang.String mobile;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "password")
    private java.lang.String password;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "mobile_password")
    private java.lang.String mobile_password;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "notes")
    private java.lang.String notes;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "notes")
    private java.lang.String mobile2;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "address")
    private java.lang.String address;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "adminLevel")
    private com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType adminLevel;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "subAdminLevel")
    private com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType subAdminLevel;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "studentLevel")
    private com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType studentLevel;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "balanceEqlomat")
    private java.lang.Double balanceEqlomat;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "balanceBegory")
    private java.lang.Double balanceBegory;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "listOfAttendence")
    private java.util.List<com.attendance.myproject.begory.data.Models.Attendance> listOfAttendence;
    @com.google.gson.annotations.SerializedName(value = "firstTime_ToLogin")
    private boolean firstTime_ToLogin;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMobile() {
        return null;
    }
    
    public final void setMobile(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMobile_password() {
        return null;
    }
    
    public final void setMobile_password(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNotes() {
        return null;
    }
    
    public final void setNotes(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMobile2() {
        return null;
    }
    
    public final void setMobile2(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType getAdminLevel() {
        return null;
    }
    
    public final void setAdminLevel(@org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType getSubAdminLevel() {
        return null;
    }
    
    public final void setSubAdminLevel(@org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType getStudentLevel() {
        return null;
    }
    
    public final void setStudentLevel(@org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getBalanceEqlomat() {
        return null;
    }
    
    public final void setBalanceEqlomat(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getBalanceBegory() {
        return null;
    }
    
    public final void setBalanceBegory(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.attendance.myproject.begory.data.Models.Attendance> getListOfAttendence() {
        return null;
    }
    
    public final void setListOfAttendence(@org.jetbrains.annotations.Nullable()
    java.util.List<com.attendance.myproject.begory.data.Models.Attendance> p0) {
    }
    
    public final boolean getFirstTime_ToLogin() {
        return false;
    }
    
    public final void setFirstTime_ToLogin(boolean p0) {
    }
    
    public User(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String mobile, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String mobile_password, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.Nullable()
    java.lang.String mobile2, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType adminLevel, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType subAdminLevel, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType studentLevel, @org.jetbrains.annotations.Nullable()
    java.lang.Double balanceEqlomat, @org.jetbrains.annotations.Nullable()
    java.lang.Double balanceBegory, @org.jetbrains.annotations.Nullable()
    java.util.List<com.attendance.myproject.begory.data.Models.Attendance> listOfAttendence, boolean firstTime_ToLogin) {
        super();
    }
    
    public User() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.attendance.myproject.begory.data.Models.Attendance> component14() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.attendance.myproject.begory.data.Models.User copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String mobile, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String mobile_password, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.Nullable()
    java.lang.String mobile2, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType adminLevel, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType subAdminLevel, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.source.remote.FirebaseFilterType.LevelFilterType studentLevel, @org.jetbrains.annotations.Nullable()
    java.lang.Double balanceEqlomat, @org.jetbrains.annotations.Nullable()
    java.lang.Double balanceBegory, @org.jetbrains.annotations.Nullable()
    java.util.List<com.attendance.myproject.begory.data.Models.Attendance> listOfAttendence, boolean firstTime_ToLogin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}