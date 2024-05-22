package com.gmail.reater.last.test.pattern.behavioral.memento;

public class GameLevelMemento {

    private final int levelNumber;
    private final int score;
    private final String checkpoint;

    public GameLevelMemento(final int levelNumber, final int score, final String checkpoint) {
        this.levelNumber = levelNumber;
        this.score = score;
        this.checkpoint = checkpoint;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public int getScore() {
        return score;
    }

    public String getCheckpoint() {
        return checkpoint;
    }
}
