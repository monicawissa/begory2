package com.attendance.myproject.begory.entites;

public class Student {

    private String studentId;
    private String studentName;
    private String studentAddress;
    private String studentEmail;
    private String studentMobile;
    private String studentMobile2;
    private String studentNotes;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    public String getStudentNotes() {
        return studentNotes;
    }

    public void setStudentNotes(String studentNotes) {
        this.studentNotes = studentNotes;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Override
    public String toString() {
        return studentName;
    }

    public String getStudentMobile2() {
        return studentMobile2;
    }

    public void setStudentMobile2(String studentMobile2) {
        this.studentMobile2 = studentMobile2;
    }
}
