package com.attendance.myproject.begory.entites;

import com.attendance.myproject.begory.beans.LevelItem;

import java.util.ArrayList;

public class Admin {

    private String adminId;
    private String adminName;
    private String adminPassword;
    private boolean isMainAdmin;
    private boolean isAccountActive;
    private ArrayList<LevelItem> levels;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }



    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public boolean isAccountActive() {
        return isAccountActive;
    }

    public void setAccountActive(boolean accountActive) {
        isAccountActive = accountActive;
    }

    public boolean isMainAdmin() {
        return isMainAdmin;
    }

    public void setMainAdmin(boolean mainAdmin) {
        isMainAdmin = mainAdmin;
    }

    @Override
    public String toString() {
        return adminName;
    }

    public ArrayList<LevelItem> getLevels() {
        return levels;
    }

    public void setLevels(ArrayList<LevelItem> levels) {
        this.levels = levels;
    }
}
