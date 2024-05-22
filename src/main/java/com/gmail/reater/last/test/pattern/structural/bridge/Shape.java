package com.gmail.reater.last.test.pattern.structural.bridge;

public abstract class Shape {

    public final Color color;

    public Shape(final Color color) {
        this.color = color;
    }

    public abstract void draw();
}
