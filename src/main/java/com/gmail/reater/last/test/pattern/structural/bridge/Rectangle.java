package com.gmail.reater.last.test.pattern.structural.bridge;

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
