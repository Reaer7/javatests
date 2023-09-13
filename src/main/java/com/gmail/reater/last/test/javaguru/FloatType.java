package com.gmail.reater.last.test.javaguru;

public class FloatType {

    public static void main(String[] args) {
        float real = 0.0f / 0.0f;
        if (real == real) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        Float realO = 0.0f / 0.0f;
        if (realO == realO) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}