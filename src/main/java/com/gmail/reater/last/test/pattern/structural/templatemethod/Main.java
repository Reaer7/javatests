package com.gmail.reater.last.test.pattern.structural.templatemethod;

public class Main {

    /*
        Шаблонный метод - определяет скелет алгоритма,
        перекладывая ответственность за некоторые его шаги на подклассы.
        Паттерн позволяет подклассам переопределять шаги алгоритма,
        не меняя его общей структуры
    */
    public static void main(String[] args) {
        Game footballGame = new FootballGame();
        footballGame.play();

        System.out.println("------");

        Game chessGameGame = new ChessGame();
        chessGameGame.play();
    }
}
