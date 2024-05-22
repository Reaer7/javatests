package com.gmail.reater.last.test.pattern.behavioral.observer;

public interface Publisher {

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifySubscribers(String text);
}
