package com.gmail.reater.last.test.pattern.behavioral.chainofresponsibility;

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
