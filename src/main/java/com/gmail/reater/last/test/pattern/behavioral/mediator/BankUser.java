package com.gmail.reater.last.test.pattern.behavioral.mediator;

public class BankUser {

    private String name;
    private BankMediator mediator;

    public BankUser(final String name, final BankMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void createAccount() {
        mediator.createAccount(this);
    }

    public void applyForLoan() {
        mediator.applyForLoan(this);
    }
}
