package com.gmail.reater.last.test.pattern.behavioral.command;

import java.util.Stack;

// Invoker
public class User {

    private static Stack<Command> commandHistory = new Stack<>();
    private Command paste;
    private Command cut;

    public User(Command paste, Command cut) {
        this.paste = paste;
        this.cut = cut;
    }

    public void pasteText() {
        commandHistory.push(paste);
        paste.execute();
    }

    public void cutText() {
        commandHistory.push(cut);
        cut.execute();
    }
}
