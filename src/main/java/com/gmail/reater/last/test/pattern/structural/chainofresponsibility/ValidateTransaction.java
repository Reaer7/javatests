package com.gmail.reater.last.test.pattern.structural.chainofresponsibility;

public abstract class ValidateTransaction {

    private ValidateTransaction next;

    public void setNext(ValidateTransaction next) {
        this.next = next;
    }

    protected void checkNext(MoneyTransaction moneyTransaction) {
        if (next != null) {
            next.check(moneyTransaction);
        }
    }

    public abstract void check(MoneyTransaction moneyTransaction);
}
