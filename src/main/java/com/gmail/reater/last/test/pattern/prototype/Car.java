package com.gmail.reater.last.test.pattern.prototype;

public class Car implements Cloneable{

    public String color;
    public String name;

    @Override
    public Car clone() {
        final Car car = new Car();
        car.color = color;
        car.name = name;
        return car;
    }
}
