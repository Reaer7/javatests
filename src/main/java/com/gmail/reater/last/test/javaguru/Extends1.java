package com.gmail.reater.last.test.javaguru;

public class Extends1 extends A3 {

    public static void main(String[] args) {
        new Extends1().start();
    }

    private void start() {
        check(new A3(), new Extends1());
        check((Extends1) new A3(), new Extends1());
    }

    private void check(A3 a3, A3 a31) {
        Extends1 go = (Extends1) a3;
        A3 a32 = (A3) a31;
    }
}

class A {
}