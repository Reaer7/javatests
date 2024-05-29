package com.gmail.reater.last.test.pattern.behavioral.command;

public class PasteCommand implements Command{

    private Document document;

    public PasteCommand(final Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.paste();
    }

    @Override
    public void undo() {
        /*логика отката комманды*/
    }
}
