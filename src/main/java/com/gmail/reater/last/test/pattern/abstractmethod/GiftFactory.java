package com.gmail.reater.last.test.pattern.abstractmethod;

public class GiftFactory {

    public Gift createGift(int age) {
        if (age < 18) {
            return new KidsGift();
        } else {
            return new MatureGift();
        }
    }
}
