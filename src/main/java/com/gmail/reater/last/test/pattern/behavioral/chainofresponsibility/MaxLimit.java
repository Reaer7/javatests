package com.gmail.reater.last.test.pattern.behavioral.chainofresponsibility;

public class MaxLimit extends ValidateTransaction {

    @Override
    public void check(final MoneyTransaction moneyTransaction) {
        if (moneyTransaction.getAmount() > 10000) {
            System.out.println("Превышен максимальный размер транзакции");
        }
    }
}
