package com.gmail.reater.last.test.interview;

public class TaskScope {

    public static void main(String[] args) {
        final String message = "Hello";
        System.out.println(message);

        function(message);
        System.out.println(message);
    }

    private static void function(String message) {
        message += " World";
    }
}
