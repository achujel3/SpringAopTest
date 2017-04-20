package org.springtest.model;

import org.springtest.aspects.Loggable;

public class Circle {

    private String name;

    public String getName() {
        return name;
    }

    @Loggable
    public void setName(String name) {
        this.name = name;
    }

    @Loggable
    public String setNameWithReturn(String name) {
        this.name = name;
        return name;
    }
}
