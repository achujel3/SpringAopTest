package org.springtest.model;

public class Circle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String setNameWithReturn(String name) {
        this.name = name;
        return name;
    }
}
