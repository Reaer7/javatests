package com.gmail.reater.last.test.pattern.builder;

public class Main {

    /*
        Билдер - это паттерн проектирования, который позволяет поэтапно создавать сложные объекты.
    */
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.Builder()
                .topping1("Cheese")
                .topping2("Tomato")
                .topping4("Ananas")
                .build();

        Pizza pizza2 = new Pizza.Builder()
                .topping1("Cheder")
                .topping3("Garlic sauce")
                .build();

        System.out.println(pizza1.topping1);
        System.out.println(pizza1.topping2);
        System.out.println(pizza1.topping3);
        System.out.println(pizza1.topping4);

        System.out.println("-----------------");

        System.out.println(pizza2.topping1);
        System.out.println(pizza2.topping2);
        System.out.println(pizza2.topping3);
        System.out.println(pizza2.topping4);
    }
}
