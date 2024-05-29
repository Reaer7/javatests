package com.gmail.reater.last.test.pattern.behavioral.command;

public class Main {

    /*
        Команда - это паттерн, который превращает запросы в объекты,
        позволяя передавать их как аргументы при вызове методов,
        ставить запросы в очередь, логировать их,
        а также поддерживать отмену операций
    */
    public static void main(String[] args) {
        Document document = new Document();
        Command paste = new PasteCommand(document);
        Command cut = new CutCommand(document);
        User user = new User(paste, cut);

        user.pasteText();
        user.cutText();
    }
}
