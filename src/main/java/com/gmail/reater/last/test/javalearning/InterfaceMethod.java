package com.gmail.reater.last.test.javalearning;

public class InterfaceMethod {

    public static void main(String[] args) {
        Paper.show();
    }
}

interface Paper {

    static void show() {
        System.out.println("static show()");
    }
}
