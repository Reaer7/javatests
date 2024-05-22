package com.gmail.reater.last.test.pattern.structural.decorator;

public class MessengerNotification implements Notification {

    private Notification notification;

    public MessengerNotification() {}

    public MessengerNotification(final Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        if (notification != null) {
            notification.send();
        }
        System.out.println("Send message by messenger...");
    }
}
