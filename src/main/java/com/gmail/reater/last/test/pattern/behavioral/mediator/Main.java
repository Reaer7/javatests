package com.gmail.reater.last.test.pattern.behavioral.mediator;

public class Main {

    /*
        Посредник - это паттерн проектирования,
        который позволяет уменьшить связанность множества классов между собой,
        благодаря перемещению этих связей в один класс-посредник
    */
    public static void main(String[] args) {
        BankMediator basicMediator = new BankSystemsBasicMediator();

        BankUser user1 = new BankUser("Ivan", basicMediator);
        user1.createAccount();
        user1.applyForLoan();

        BankMediator customMediator = new BankSystemsCustomMediator();

        BankUser user2 = new BankUser("Kate", customMediator);
        user2.createAccount();
        user2.applyForLoan();
    }
}
