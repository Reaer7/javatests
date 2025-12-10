package com.gmail.reater.last.test.concurrent;

import java.util.concurrent.Exchanger;

public class ExchangerMain {

    /* Exchanger — это синхронизатор, который позволяет двум потокам обмениваться данными
     в точке встречи. Каждый поток вызывает метод exchange(),
     и когда оба потока доходят до этой точки, они обмениваются переданными объектами.*/
    private static final Exchanger<String> EXCHANGER = new Exchanger<>();

    public static void main(String[] args) {
        Runnable producer = () -> {
            try {
                String data = "Данные от Producer";
                System.out.println("Producer отправил: " + data);
                String response = EXCHANGER.exchange(data);
                System.out.println("Producer получил: " + response);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable consumer = () -> {
            try {
                String data = "Ответ от Consumer";
                System.out.println("Consumer отправил: " + data);
                String received = EXCHANGER.exchange(data);
                System.out.println("Consumer получил: " + received);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
