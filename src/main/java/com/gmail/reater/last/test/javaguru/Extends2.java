package com.gmail.reater.last.test.javaguru;

public class Extends2 extends Base {

    public Extends2() {
        i = 5;
    }

    public static void main(String[] args) {
        Base ext = new Extends2();
        Object o = "";
        ext.mm(o);
        ext.mm("");
    }
}

class Base {

    public int i = 3;

    public void mm(Object o) {
        System.out.println("Object " + i);
    }

    public void mm(String s) {
        System.out.println("String " + i);
    }
}