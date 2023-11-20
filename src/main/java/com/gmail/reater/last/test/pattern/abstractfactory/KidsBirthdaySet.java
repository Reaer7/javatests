package com.gmail.reater.last.test.pattern.abstractfactory;

public class KidsBirthdaySet implements BirthdaySet {

    @Override
    public Gift getGift() {
        return new KidsGift();
    }

    @Override
    public Card getCard() {
        return new KidsCard();
    }

    @Override
    public Cake getCake() {
        return new KidsCake();
    }
}
