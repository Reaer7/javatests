package com.gmail.reater.last.test.pattern.prototype;

public class Main {

    /*
        Прототип - это паттерн проектирования, при котором происходит создание копии объекта
        за счет реализации метода копирования в самом классе объекта.
    */
    public static void main(String[] args) {
        final Car car = new Car();
        car.color = "Red";
        car.name = "Dodge";

        Car newCar = car.clone();
        System.out.println(newCar.color);
        System.out.println(newCar.name);
        System.out.println(newCar == car);
    }
}
