package com.gmail.reater.last.test.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2_000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return 10;
        });
        final CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return 2;
        });

//        Thread.sleep(1_999);
        final CompletableFuture<Integer> resultFuture = future1.thenCombine(future2, Integer::sum);
        System.out.println("Result: " + resultFuture.get());
    }
}
