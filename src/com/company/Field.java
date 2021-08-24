package com.company;

public class Field {
    private int width;
    private int length;

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public Field(int width, int length) throws IllegalArgumentException {
        if(width <= 0 || length <= 0) throw new IllegalArgumentException("Dimensions cannot be non-positive!");

        this.width  = width;
        this.length = length;
    }
}
