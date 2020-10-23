package com.attendance.myproject.begory.beans;

import java.util.ArrayList;

public class StudentItem {

    private String id;
    private String name;
    private String address;
    private String mobile;
    private String fMobile;
    private boolean isShamas;
    private ArrayList<AttendanceItem> attendanceItems;
    private ResultItem studentRes;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getfMobile() {
        return fMobile;
    }

    public void setfMobile(String fMobile) {
        this.fMobile = fMobile;
    }

    public boolean isShamas() {
        return isShamas;
    }

    public void setShamas(boolean shamas) {
        isShamas = shamas;
    }

    public ArrayList<AttendanceItem> getAttendanceItems() {
        return attendanceItems;
    }

    public void setAttendanceItems(ArrayList<AttendanceItem> attendanceItems) {
        this.attendanceItems = attendanceItems;
    }

    public ResultItem getStudentRes() {
        return studentRes;
    }

    public void setStudentRes(ResultItem studentRes) {
        this.studentRes = studentRes;
    }

    @Override
    public String toString() {
        return name;
    }
}
