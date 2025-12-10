package com.gmail.reater.last.test.concurrent;

import java.util.concurrent.Phaser;

public class PhaserMain {

    /* Phaser — это продвинутый синхронизатор из пакета java.util.concurrent,
     который можно рассматривать как улучшенную версию CountDownLatch и CyclicBarrier.
     Phaser особенно полезен в сценариях с несколькими этапами работы
     (pipeline, симуляции, пошаговые модели),
     где потоки должны переходить к следующему шагу синхронно*/
    private static final Phaser PHASER = new Phaser(3); // 3 потока-участника

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " — фаза 1");
            PHASER.arriveAndAwaitAdvance(); // ждём остальных

            System.out.println(Thread.currentThread().getName() + " — фаза 2");
            PHASER.arriveAndAwaitAdvance(); // ждём остальных
        };

        new Thread(task, "Поток-1").start();
        new Thread(task, "Поток-2").start();
        new Thread(task, "Поток-3").start();
    }
}
