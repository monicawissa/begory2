package com.attendance.myproject.begory.beans;

import java.util.ArrayList;

public class LevelItem {

    private String id;
    private String name;
    private boolean isSelected;
    private ArrayList<StudentItem> students;


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

    public ArrayList<StudentItem> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<StudentItem> students) {
        this.students = students;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    @Override
    public String toString() {
        return name;
    }
}
