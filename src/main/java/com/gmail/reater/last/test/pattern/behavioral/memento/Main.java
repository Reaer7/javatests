package com.gmail.reater.last.test.pattern.behavioral.memento;

public class Main {

    /*
        Снимок - это паттерн проектирования,
        который позволяет сохранять состояние объекта
        и восстанавливать его в будущем,
        не раскрывая деталей реализации самого объекта
    */
    public static void main(String[] args) {
        GameLevel gameLevel = new GameLevel();
        GameHistory gameHistory = new GameHistory();

        // играем первый уровень
        gameLevel.setLevelNumber(1);
        gameLevel.setScore(100);
        gameLevel.setCheckpoint("Level 1, Checkpoint 1");
        gameLevel.play();

        // сохраняет состояние игры после первого уровня
        GameLevelMemento savedGameLevel1Memento = gameLevel.save();
        gameHistory.add(savedGameLevel1Memento);

        // играем второй уровень
        gameLevel.setLevelNumber(2);
        gameLevel.setScore(200);
        gameLevel.setCheckpoint("Level 2, Checkpoint 1");
        gameLevel.play();

        // сохраняет состояние игры после второго уровня
        GameLevelMemento savedGameLevel2Memento = gameLevel.save();
        gameHistory.add(savedGameLevel2Memento);

        // загружаем состояние игры после первого уровня
        gameLevel.restore(gameHistory.get(0));
        System.out.println("Level: " + gameLevel.getLevelNumber());
    }
}
