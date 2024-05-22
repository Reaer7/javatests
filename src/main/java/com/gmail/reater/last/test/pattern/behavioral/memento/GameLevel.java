package com.gmail.reater.last.test.pattern.behavioral.memento;

public class GameLevel {

    private int levelNumber;
    private int score;
    private String checkpoint;

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(final int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(final int score) {
        this.score = score;
    }

    public String getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(final String checkpoint) {
        this.checkpoint = checkpoint;
    }

    public GameLevelMemento save() {
        return new GameLevelMemento(levelNumber, score, checkpoint);
    }

    public void restore(GameLevelMemento memento) {
        levelNumber = memento.getLevelNumber();
        score = memento.getScore();
        checkpoint = memento.getCheckpoint();
    }

    public void play() {
        // игровая логика
    }
}
