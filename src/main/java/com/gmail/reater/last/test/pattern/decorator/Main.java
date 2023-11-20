package com.gmail.reater.last.test.pattern.decorator;

public class Main {

    /*
        Декоратор - позволяет динамически добавлять объктам новую функциональность,
        оборачивая их в полезные "обертки".
    */
    public static void main(String[] args) {
        final Notification emailNotification = new EmailNotification();
        final SmsNotification smsNotification = new SmsNotification(emailNotification);
        final MessengerNotification messengerNotification = new MessengerNotification(smsNotification);
        sendNotification(messengerNotification);
    }

    private static void sendNotification(final Notification notification) {
        notification.send();
    }

    /*
        Класс-декоратор должен быть того же типа, что и декорируемый класс,
        реализовывать тот же интерфейс или наследовать тот же базовый класс.

        Декоратор реализует поведение исходного класса; при этом не изменяет его,
        а добавляет свое до или после вызова базового поведения.

        Это достигается за счет того, что декоратор содержит в себе объект базового класса
        и вызывает его метода там, где требуется дополнить поведение.
    */
}
