package com.gmail.reater.last.test.pattern.behavioral.state;

public class ConcreteStateB implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Выполнено действие в состоянии B.");
    }
}
