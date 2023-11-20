package com.gmail.reater.last.test.pattern.decorator;

public class SmsNotification implements Notification {

    private Notification notification;

    public SmsNotification() {}

    public SmsNotification(final Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        if (notification != null) {
            notification.send();
        }
        System.out.println("Send message by sms...");
    }
}
