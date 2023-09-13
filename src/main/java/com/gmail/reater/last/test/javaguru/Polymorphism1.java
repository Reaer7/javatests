package com.gmail.reater.last.test.javaguru;

public class Polymorphism1 {

    static void f(int a) {
        System.out.println("int");
    }

    static void f(Integer a) {
        System.out.println("Integer");
    }

    static void f(Object a) {
        System.out.println("object");
    }

    static public void main(String[] args) {
        Object i = new Integer(10);
        f(i);
    }
}
