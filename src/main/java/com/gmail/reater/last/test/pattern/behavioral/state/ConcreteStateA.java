package com.gmail.reater.last.test.pattern.behavioral.state;

public class ConcreteStateA implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Выполнено действие в состоянии A.");

        context.setState(new ConcreteStateB());
    }
}
