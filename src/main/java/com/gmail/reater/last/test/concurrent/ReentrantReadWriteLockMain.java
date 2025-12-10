package com.gmail.reater.last.test.concurrent;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockMain {

    /* ReentrantReadWriteLock — это улучшенная альтернатива synchronized,
     позволяющая одновременно выполнять несколько чтений, но блокировать доступ на запись.
     ReentrantReadWriteLock особенно полезен, когда чтений гораздо больше, чем записей
     — например, в кэшах, справочниках или аналитических сервисах*/
    private static final ReentrantReadWriteLock LOCK = new ReentrantReadWriteLock();
    private static int value = 0;

    public static void main(String[] args) {
        Runnable reader = ReentrantReadWriteLockMain::getReaderRunnable;
        Runnable writer = ReentrantReadWriteLockMain::getWriterRunnable;

        new Thread(reader).start();
        new Thread(reader).start();
        new Thread(reader).start();
        new Thread(writer).start();
        new Thread(reader).start();
        new Thread(reader).start();
        new Thread(reader).start();
        new Thread(reader).start();
        new Thread(reader).start();
        new Thread(reader).start();
        new Thread(writer).start();
        new Thread(reader).start();
        new Thread(reader).start();
        new Thread(reader).start();
        new Thread(reader).start();
    }

    private static void getReaderRunnable() {
        LOCK.readLock().lock();
        try {
            System.out.println("Чтение: " + value);
        } finally {
            LOCK.readLock().unlock();
        }
    }

    private static void getWriterRunnable() {
        LOCK.writeLock().lock();
        try {
            value++;
            System.out.println("Запись: " + value);
        } finally {
            LOCK.writeLock().unlock();
        }
    }
}
