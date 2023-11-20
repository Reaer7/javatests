package com.gmail.reater.last.test.pattern.abstractfactory;

public class AdultBirthdaySet implements BirthdaySet {

    @Override
    public Gift getGift() {
        return new AdultGift();
    }

    @Override
    public Card getCard() {
        return new AdultCard();
    }

    @Override
    public Cake getCake() {
        return new AdultCake();
    }
}
