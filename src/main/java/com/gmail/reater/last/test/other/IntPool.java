package com.gmail.reater.last.test.other;

public class IntPool {

    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;
        Short s2 = 10;
        Short s1 = 10;
        Double d1 = 10d;
        Double d2 = 10d;
        Float f2 = 10f;
        Float f1 = 10f;
        Byte b1 = 10;
        Byte b2 = 10;
        Long l1 = 10l;
        Long l2 = 10l;

        System.out.println("INT - " + (i2 == i1));
        System.out.println("SHORT - " + (s2 == s1));
        System.out.println("DOUBLE - " + (d2 == d1));
        System.out.println("FLOAT - " + (f2 == f1));
        System.out.println("BYTE - " + (b2 == b1));
        System.out.println("LONG - " + (l2 == l1));
    }
}
