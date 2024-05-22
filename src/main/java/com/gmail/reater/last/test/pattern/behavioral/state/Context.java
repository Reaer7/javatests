package com.gmail.reater.last.test.pattern.behavioral.state;

public class Context {

    private State state;

    public Context(final State state) {
        this.state = state;
    }

    public void setState(final State state) {
        this.state = state;
    }

    public void doAction() {
        state.doAction(this);
    }
}
