package com.gmail.reater.last.test.pattern.behavioral.visitor;

public class Cat implements Animal {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCat(this);
    }
}
