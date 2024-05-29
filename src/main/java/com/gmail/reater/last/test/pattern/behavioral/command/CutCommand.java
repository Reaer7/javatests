package com.gmail.reater.last.test.pattern.behavioral.command;

public class CutCommand implements Command{

    private Document document;

    public CutCommand(final Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.cut();
    }

    @Override
    public void undo() {
        /*логика отката комманды*/
    }
}
