package com.gmail.reater.last.test.pattern.structural.templatemethod;

public class FootballGame extends Game {

    @Override
    protected void initialize() {
        System.out.println("Футбольная игра: инициализация");
    }

    @Override
    protected void startGame() {
        System.out.println("Футбольная игра: начало игры");
    }

    @Override
    protected void endGame() {
        System.out.println("Футбольная игра: конец игры");
    }
}
