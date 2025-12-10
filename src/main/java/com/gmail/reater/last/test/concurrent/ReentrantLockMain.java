package com.gmail.reater.last.test.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMain {

    /* ReentrantLock — это продвинутый вариант synchronized, который даёт больше контроля над блокировками.
     Он позволяет явно захватывать и освобождать замок, а также проверять, свободен ли он.
     ReentrantLock особенно полезен, когда нужна гибкость управления блокировками
     — например, для тайм-аутов, справедливого доступа или реализации сложных синхронизаторов*/
    private static final ReentrantLock LOCK = new ReentrantLock();
    private static int count = 0;

    public static void main(String[] args) {
        Runnable task = () -> {
            if (LOCK.tryLock()) {
                try {
                    count++;
                    System.out.println(Thread.currentThread().getName() + " увеличил count: " + count);
                } finally {
                    LOCK.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " не смог захватить замок");
            }
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}
