package com.gmail.reater.last.test.pattern.behavioral.state;

public class Main {

    /*
        Состояние - это паттерн проектирования,
        который позволяет объекту варьировать свое поведение
        при изменении внутреннего состояния.
        При этом создается впечатление, что поменялся класс объекта
    */
    public static void main(String[] args) {
        State stateA = new ConcreteStateA();
        Context context = new Context(stateA);
        context.doAction();
        context.doAction();
    }
}
