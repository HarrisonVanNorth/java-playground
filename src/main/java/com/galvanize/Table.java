package com.galvanize;

public class Table {
    @Override
    public String toString() {
        return "Table{" + "shape= " + shape + '}';
    }

    public String getShape() {
        return shape;
    }

    public String setShape(String shape) {
        this.shape = shape;
        return shape;
    }

    private String shape;

}
