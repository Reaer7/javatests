package com.gmail.reater.last.test.pattern.adapter;

public class ShortMessageLetterAdapter implements  ShortMessage {

    private final Letter letter;

    public ShortMessageLetterAdapter(final Letter letter) {
        this.letter = letter;
    }

    @Override
    public String getShortMessage() {
        return letter.getMessage().substring(0, 5);
    }
}
