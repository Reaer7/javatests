package com.gmail.reater.last.test.pattern.behavioral.strategy;

public class ArraySorter {

    private SortingStrategy strategy;

    public ArraySorter(final SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(final SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] array) {
        strategy.sort(array);
    }
}
