package com.attendance.myproject.begory.beans;

public class StudentWithAttendance {

    private String id;
    private String name;
    private AttendanceItem attendance;

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

    public AttendanceItem getAttendance() {
        return attendance;
    }

    public void setAttendance(AttendanceItem attendance) {
        this.attendance = attendance;
    }
}
