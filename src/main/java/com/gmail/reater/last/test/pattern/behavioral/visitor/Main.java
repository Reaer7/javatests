package com.gmail.reater.last.test.pattern.behavioral.visitor;

public class Main {

    /*
        Посетитель - паттерн, который позволяет добавлять в программу новые операции,
        не изменяя классы объектов, над которыми эти операции могут выполняться
    */
    public static void main(String[] args) {
        SoundVisitor soundVisitor = new SoundVisitor();
        ActionVisitor actionVisitor = new ActionVisitor();

        Cat cat = new Cat();
        cat.accept(soundVisitor);
        cat.accept(actionVisitor);

        Dog dog = new Dog();
        dog.accept(soundVisitor);
        dog.accept(actionVisitor);
    }
}
