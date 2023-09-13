package com.gmail.reater.last.test.other;

public class Extends {
    public static void main(String[] args) {
        new Example2().printVersion();
    }
}

class Example1 {
    private String version = "1.1";

    public Example1() {
     System.out.println("1");
    }

    private void printVersion() {
        System.out.println(version);
    }
}

class Example2 extends Example1 {
    private String version = "2.2";

    public Example2() {
        System.out.println("2");
    }

    //@Override
    public void printVersion() {
        System.out.println(version);
    }
}