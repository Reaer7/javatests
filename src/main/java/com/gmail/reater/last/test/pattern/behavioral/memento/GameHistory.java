package com.gmail.reater.last.test.pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class GameHistory {

    private final List<GameLevelMemento> mementos = new ArrayList<>();

    public void add(GameLevelMemento memento) {
        mementos.add(memento);
    }

    public GameLevelMemento get(int index) {
        return mementos.get(index);
    }
}
