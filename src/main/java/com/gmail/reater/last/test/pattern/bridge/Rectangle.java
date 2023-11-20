package com.gmail.reater.last.test.pattern.bridge;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
        color.fillColor();
    }
}
