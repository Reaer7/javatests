package com.gmail.reater.last.test.pattern.bridge;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
        color.fillColor();
    }
}
