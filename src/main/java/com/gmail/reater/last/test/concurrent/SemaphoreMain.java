package com.gmail.reater.last.test.concurrent;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

    /* Semaphore — это синхронизатор, который ограничивает количество потоков,
     одновременно обращающихся к ресурсу. Он работает как счётчик разрешений (permits):
     поток должен получить разрешение, чтобы продолжить работу,
     и обязан его освободить после завершения.*/
    private static final Semaphore SEMAPHORE = new Semaphore(2); // максимум 2 потока одновременно

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                SEMAPHORE.acquire();
                System.out.println(Thread.currentThread().getName() + " получил доступ");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " освобождает доступ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                SEMAPHORE.release();
            }
        };

        for (int i = 1; i <= 5; i++) {
            new Thread(task, "Поток " + i).start();
        }
    }
}
