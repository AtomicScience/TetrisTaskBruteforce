package com.company;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        if(x < 0 || y < 0) throw new IllegalArgumentException("Coordinates cannot be negative!");

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
