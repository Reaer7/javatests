package com.gmail.reater.last.test.pattern.behavioral.chainofresponsibility;

public class MoneyTransaction {

    private double amount;

    public MoneyTransaction(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
