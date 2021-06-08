package com.attendance.myproject.begory.data.Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00ed\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u001b\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0010\u0010S\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0017\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u00c6\u0003J\t\u0010U\u001a\u00020\tH\u00c6\u0003J\u001d\u0010V\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u001bH\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00f6\u0001\u0010_\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\t2\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u001bH\u00c6\u0001\u00a2\u0006\u0002\u0010`J\u0013\u0010a\u001a\u00020\t2\b\u0010b\u001a\u0004\u0018\u00010cH\u00d6\u0003J\t\u0010d\u001a\u00020eH\u00d6\u0001J\t\u0010f\u001a\u00020\u0003H\u00d6\u0001R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001e\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001e\"\u0004\b(\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010,\u001a\u0004\b\b\u0010)\"\u0004\b*\u0010+R,\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010 R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010 R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001e\"\u0004\b<\u0010 R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R2\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u001e\"\u0004\bM\u0010 \u00a8\u0006g"}, d2 = {"Lcom/attendance/myproject/begory/data/Models/User;", "Ljava/io/Serializable;", "id", "", "name", "mobile", "mobile2", "password", "isShamas", "", "mobile_password", "notes", "address", "adminLevel", "subAdminLevel", "studentLevel", "Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;", "price", "", "realPrice", "listOfAttendence", "", "Lcom/attendance/myproject/begory/data/Models/Attendance;", "firstTime_ToLogin", "selectedGifts", "Ljava/util/ArrayList;", "Lcom/attendance/myproject/begory/data/Models/Gift;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;ZLjava/util/ArrayList;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getAdminLevel", "setAdminLevel", "getFirstTime_ToLogin", "()Z", "setFirstTime_ToLogin", "(Z)V", "getId", "setId", "()Ljava/lang/Boolean;", "setShamas", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getListOfAttendence", "()Ljava/util/Map;", "setListOfAttendence", "(Ljava/util/Map;)V", "getMobile", "setMobile", "getMobile2", "setMobile2", "getMobile_password", "setMobile_password", "getName", "setName", "getNotes", "setNotes", "getPassword", "setPassword", "getPrice", "()Ljava/lang/Double;", "setPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getRealPrice", "setRealPrice", "getSelectedGifts", "()Ljava/util/ArrayList;", "setSelectedGifts", "(Ljava/util/ArrayList;)V", "getStudentLevel", "()Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;", "setStudentLevel", "(Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;)V", "getSubAdminLevel", "setSubAdminLevel", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/attendance/myproject/begory/data/Models/remote/FirebaseFilterType$LevelFilterType;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;ZLjava/util/ArrayList;)Lcom/attendance/myproject/begory/data/Models/User;", "equals", "other", "", "hashCode", "", "toString", "app_debug"})
public final class User implements java.io.Serializable {
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
    @com.google.gson.annotations.SerializedName(value = "mobile2")
    private java.lang.String mobile2;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "password")
    private java.lang.String password;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "isShamas")
    private java.lang.Boolean isShamas;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "mobile_password")
    private java.lang.String mobile_password;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "notes")
    private java.lang.String notes;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "address")
    private java.lang.String address;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "adminLevel")
    private java.lang.String adminLevel;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "subAdminLevel")
    private java.lang.String subAdminLevel;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "studentLevel")
    private com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType studentLevel;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "price")
    private java.lang.Double price;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "realPrice")
    private java.lang.Double realPrice;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "listOfAttendence")
    private java.util.Map<java.lang.String, com.attendance.myproject.begory.data.Models.Attendance> listOfAttendence;
    @com.google.gson.annotations.SerializedName(value = "firstTime_ToLogin")
    private boolean firstTime_ToLogin;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "selectedGifts")
    private java.util.ArrayList<com.attendance.myproject.begory.data.Models.Gift> selectedGifts;
    
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
    public final java.lang.String getMobile2() {
        return null;
    }
    
    public final void setMobile2(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Boolean isShamas() {
        return null;
    }
    
    public final void setShamas(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
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
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdminLevel() {
        return null;
    }
    
    public final void setAdminLevel(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubAdminLevel() {
        return null;
    }
    
    public final void setSubAdminLevel(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType getStudentLevel() {
        return null;
    }
    
    public final void setStudentLevel(@org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPrice() {
        return null;
    }
    
    public final void setPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getRealPrice() {
        return null;
    }
    
    public final void setRealPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, com.attendance.myproject.begory.data.Models.Attendance> getListOfAttendence() {
        return null;
    }
    
    public final void setListOfAttendence(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, com.attendance.myproject.begory.data.Models.Attendance> p0) {
    }
    
    public final boolean getFirstTime_ToLogin() {
        return false;
    }
    
    public final void setFirstTime_ToLogin(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.attendance.myproject.begory.data.Models.Gift> getSelectedGifts() {
        return null;
    }
    
    public final void setSelectedGifts(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.attendance.myproject.begory.data.Models.Gift> p0) {
    }
    
    public User(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String mobile, @org.jetbrains.annotations.Nullable()
    java.lang.String mobile2, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isShamas, @org.jetbrains.annotations.Nullable()
    java.lang.String mobile_password, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String adminLevel, @org.jetbrains.annotations.Nullable()
    java.lang.String subAdminLevel, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType studentLevel, @org.jetbrains.annotations.Nullable()
    java.lang.Double price, @org.jetbrains.annotations.Nullable()
    java.lang.Double realPrice, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, com.attendance.myproject.begory.data.Models.Attendance> listOfAttendence, boolean firstTime_ToLogin, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.attendance.myproject.begory.data.Models.Gift> selectedGifts) {
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
    public final java.lang.Boolean component6() {
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
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, com.attendance.myproject.begory.data.Models.Attendance> component15() {
        return null;
    }
    
    public final boolean component16() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.attendance.myproject.begory.data.Models.Gift> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.attendance.myproject.begory.data.Models.User copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String mobile, @org.jetbrains.annotations.Nullable()
    java.lang.String mobile2, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isShamas, @org.jetbrains.annotations.Nullable()
    java.lang.String mobile_password, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String adminLevel, @org.jetbrains.annotations.Nullable()
    java.lang.String subAdminLevel, @org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType.LevelFilterType studentLevel, @org.jetbrains.annotations.Nullable()
    java.lang.Double price, @org.jetbrains.annotations.Nullable()
    java.lang.Double realPrice, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, com.attendance.myproject.begory.data.Models.Attendance> listOfAttendence, boolean firstTime_ToLogin, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.attendance.myproject.begory.data.Models.Gift> selectedGifts) {
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