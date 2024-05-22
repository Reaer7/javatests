package com.gmail.reater.last.test.pattern.behavioral.mediator;

public class BankSystemsCustomMediator implements BankMediator {

    @Override
    public void createAccount(BankUser user) {
        System.out.println(user.getName()
                                   + " Новая сложная логика запросов в разные системы для создания аккаунта");
    }

    @Override
    public void applyForLoan(BankUser user) {
        System.out.println(user.getName()
                                   + " Новая сложная логика запросов в разные системы для заявки на кредит");
    }
}
