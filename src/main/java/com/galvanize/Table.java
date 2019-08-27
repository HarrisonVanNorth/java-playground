package com.galvanize;

public class Table {
    @Override
    public String toString() {
        return "Table{" + "shape= " + shape + '}';
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    private String shape;
}
