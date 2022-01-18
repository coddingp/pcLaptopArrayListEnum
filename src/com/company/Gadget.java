package com.company;

public abstract class Gadget {
    private String type;

    public Gadget(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Gadget{" +
                "type='" + type + '\'' +
                '}';
    }
}
