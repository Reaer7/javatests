package com.gmail.reater.last.test.javaguru;

class Extends4 {
    static int x = 1;

    public Extends4() {
        x += 2;
    }
}

class Child extends Extends4 {

    public Child() {
        x += 1;
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(x);
    }
}
