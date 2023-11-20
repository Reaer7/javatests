package com.gmail.reater.last.test.pattern.decorator;

public class EmailNotification implements Notification {

    private Notification notification;

    public EmailNotification() {}

    public EmailNotification(final Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        if (notification != null) {
            notification.send();
        }
        System.out.println("Send message by email...");
    }
}
