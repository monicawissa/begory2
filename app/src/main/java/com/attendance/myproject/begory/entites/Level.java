package com.attendance.myproject.begory.entites;

public class Level {

    private String levelId;
    private String levelName;
    private String levelYear;
    private boolean isLevelActive;

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getLevelYear() {
        return levelYear;
    }

    public void setLevelYear(String levelYear) {
        this.levelYear = levelYear;
    }

    @Override
    public String toString() {
        return levelName;
    }

    public boolean isLevelActive() {
        return isLevelActive;
    }

    public void setLevelActive(boolean levelActive) {
        isLevelActive = levelActive;
    }
}
