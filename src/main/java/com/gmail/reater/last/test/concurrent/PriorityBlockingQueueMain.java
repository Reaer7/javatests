package com.gmail.reater.last.test.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueMain {

    /* PriorityBlockingQueue — это потокобезопасная очередь, которая хранит элементы
     в отсортированном виде согласно их приоритету.*/
    private static final BlockingQueue<Integer> PRIORITY_BLOCKING_QUEUE = new PriorityBlockingQueue<>();

    public static void main(String[] args) {
        PRIORITY_BLOCKING_QUEUE.add(5);
        PRIORITY_BLOCKING_QUEUE.add(1);
        PRIORITY_BLOCKING_QUEUE.add(3);

        while (!PRIORITY_BLOCKING_QUEUE.isEmpty()) {
            System.out.println(PRIORITY_BLOCKING_QUEUE.poll()); // ➔ 1, 3, 5
        }
    }
}
