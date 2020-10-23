package com.attendance.myproject.begory.beans;

public class ResultItem {

    private int totalGrade;
    private TermItem fTerm;
    private TermItem sTerm;
    private TermItem tTerm;
    private int totalStudentResult;


    public int getTotalGrade() {
        return totalGrade;
    }

    public void setTotalGrade(int totalGrade) {
        this.totalGrade = totalGrade;
    }

    public TermItem getfTerm() {
        return fTerm;
    }

    public void setfTerm(TermItem fTerm) {
        this.fTerm = fTerm;
    }

    public TermItem getsTerm() {
        return sTerm;
    }

    public void setsTerm(TermItem sTerm) {
        this.sTerm = sTerm;
    }

    public TermItem gettTerm() {
        return tTerm;
    }

    public void settTerm(TermItem tTerm) {
        this.tTerm = tTerm;
    }

    public int getTotalStudentResult() {
        return totalStudentResult;
    }

    public void setTotalStudentResult(int totalStudentResult) {
        this.totalStudentResult = totalStudentResult;
    }
}
