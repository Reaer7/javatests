package com.gmail.reater.last.test.javaguru;

class A3 implements Cloneable {
    public int i = 10;
}

class B3 extends A3 implements Cloneable {
    public int i = 20;

    @Override
    public B3 clone() throws CloneNotSupportedException {
        B3 cloneA = (B3) super.clone();
        cloneA.i = 15;
        return cloneA;
    }
}

public class Extends3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        B3 b3 = new B3();
        A3 a3 = b3.clone();
        System.out.println(a3.i);
    }
}