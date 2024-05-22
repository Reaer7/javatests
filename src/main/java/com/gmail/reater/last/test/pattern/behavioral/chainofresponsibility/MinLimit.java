package com.gmail.reater.last.test.pattern.behavioral.chainofresponsibility;

public class MinLimit extends ValidateTransaction {

    @Override
    public void check(final MoneyTransaction moneyTransaction) {
        if (moneyTransaction.getAmount() > 1000) {
            System.out.println("Необходимо ввести пин-код");
        }

        checkNext(moneyTransaction);
    }
}
