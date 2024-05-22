package com.gmail.reater.last.test.pattern.structural.flyweight;

public class PositionExternalContext {

    private int x;
    private int y;

    public PositionExternalContext(final int x, final int y) {
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
