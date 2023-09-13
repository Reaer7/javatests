package com.gmail.reater.last.test.javaguru;

public class Initialization {

    public static Initialization instance = new Initialization();
    private static final int DELTA = 5;
    private static int BASE = 7;
    private int x;

    public Initialization() {
        x = BASE + DELTA;
    }

    public static int getBASE() {
        return BASE;
    }

    public static void main(String[] args) {
        System.out.println(Initialization.instance.x);
    }
}

class Init2 {
    private static Integer a = 7; // work only for primitive
    private static final Init2 inst = new Init2();
    private static int b = 3;
    private static final int c = 5;
    private int x;

    public Init2() {
        x = a + b + c;
    }

    public static void main(String args[]) {
        System.out.println(Init2.inst.x);
    }
}