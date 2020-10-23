package com.attendance.myproject.begory.beans;

public class StudentWithResult {

    private String id;
    private String name;
    private ResultItem resultItem;

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


    public ResultItem getResultItem() {
        return resultItem;
    }

    public void setResultItem(ResultItem resultItem) {
        this.resultItem = resultItem;
    }
}
