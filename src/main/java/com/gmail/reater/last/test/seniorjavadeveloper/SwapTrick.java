package com.gmail.reater.last.test.seniorjavadeveloper;

public class SwapTrick {

    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("a: " + a + ", b: " + b);

        System.out.println("Binary view a:" + Integer.toBinaryString(a));
        System.out.println("Binary view b:" + Integer.toBinaryString(b));
        a = a ^ b;

        System.out.println("XOR binary view a:" + Integer.toBinaryString(a));
        b = a ^ b;

        System.out.println("XOR binary view b:" + Integer.toBinaryString(b));
        a = a ^ b;

        System.out.println("a: " + a + ", b: " + b);
    }
}
