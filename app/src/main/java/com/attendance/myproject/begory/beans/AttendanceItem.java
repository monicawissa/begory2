package com.attendance.myproject.begory.beans;

public class AttendanceItem {

    private String date;
    private boolean isHesa;
    private boolean isAlhan;
    private int termId;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isHesa() {
        return isHesa;
    }

    public void setHesa(boolean hesa) {
        isHesa = hesa;
    }

    public boolean isAlhan() {
        return isAlhan;
    }

    public void setAlhan(boolean alhan) {
        isAlhan = alhan;
    }

    public int getTermId() {
        return termId;
    }

    public void setTermId(int termId) {
        this.termId = termId;
    }
}
