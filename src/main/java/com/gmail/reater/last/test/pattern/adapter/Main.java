package com.gmail.reater.last.test.pattern.adapter;

public class Main {

    /*
        Адептер - это структурный паттерн проектирования,
        который позволяет объектам с несовместимыми интерфейсами работать вместе...
    */
    public static void main(String[] args) {
        Letter letter = new Letter("You win 1_000_000$ !!!");
        ShortMessageLetterAdapter adapter = new ShortMessageLetterAdapter(letter);
        System.out.println(createTitle(adapter));
    }

    private static String createTitle(final ShortMessage shortMessage) {
        return "New message: " + shortMessage.getShortMessage();
    }
}
