package com.gmail.reater.last.test.pattern.behavioral.command;

// Receiver
public class Document {

    public void open() {
        System.out.println("Документ открыт");
    }

    public void close() {
        System.out.println("Документ закрыт");
    }

    public void cut() {
        System.out.println("Текст вырезан");
    }

    public void copy() {
        System.out.println("Текст скопирован");
    }

    public void paste() {
        System.out.println("Текст вставлен");
    }
}
