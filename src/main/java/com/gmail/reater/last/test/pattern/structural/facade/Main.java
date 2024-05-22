package com.gmail.reater.last.test.pattern.structural.facade;

import java.util.UUID;

public class Main {

    /*
        Фасад - структурный паттерн, который предоставляет простой (но урезанный) интерфейс
                к сложной системе объектов, библиотеке или фреймворку.
    */
    public static void main(String[] args) {
        final UUID userId = UUID.randomUUID();
        final NotificationFacade notificationFacade = new NotificationFacade();

        // send sms
        notificationFacade.sendSms(userId);

        // send email
        notificationFacade.sendEmail(userId);
    }
}
