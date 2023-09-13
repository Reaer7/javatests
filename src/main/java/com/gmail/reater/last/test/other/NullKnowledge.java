package com.gmail.reater.last.test.other;

public class NullKnowledge {

    public static void main(String[] args) {
        //method(null);
    }

    public static void method(Object o) {
        System.out.println("o");
    }

    public static void method(Integer i) {
        System.out.println("i");
    }

    public static void method(String s) {
        System.out.println("s");
    }
}
