package com.gmail.reater.last.test.pattern.singleton;

public class Main {

    /*
        Синглтон - это шаблон (паттерн) проектирования, который делает две вещи:
        1. дает гарантию, что у класса будет всего один экземпляр класса.
        2. предоставляет глобальную точку доступа к экземпляру данного класса.
    */
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);
    }
}
