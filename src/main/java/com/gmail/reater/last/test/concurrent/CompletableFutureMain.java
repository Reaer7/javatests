package com.gmail.reater.last.test.concurrent;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureMain {

    /* CompletableFuture — это класс, который представляет собой усовершенствованную реализацию Future
     с поддержкой асинхронного программирования, цепочек вызовов и комбинирования результатов.
     CompletableFuture особенно полезен для построения неблокирующих асинхронных цепочек вычислений,
     где несколько операций выполняются последовательно или параллельно.*/

    public static void main(String[] args) throws Exception {
        // Асинхронное получение пользователя
        CompletableFuture<String> userFuture = CompletableFuture
                .supplyAsync(() -> {
                    sleep(1000);
                    return "User123";
                });

        // Цепочка обработки с преобразованием
        CompletableFuture<String> resultFuture = userFuture
                .thenApply(user -> user + " -> обработан")
                .thenApplyAsync(data -> {
                    sleep(500);
                    return data.toUpperCase();
                })
                .exceptionally(ex -> "Ошибка: " + ex.getMessage());

        // Неблокирующее получение результата
        resultFuture.thenAccept(result ->
                System.out.println("Результат: " + result)
        );

        // Ждем завершения
        Thread.sleep(2000);
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }
}
