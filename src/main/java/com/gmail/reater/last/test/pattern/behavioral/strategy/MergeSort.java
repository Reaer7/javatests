package com.gmail.reater.last.test.pattern.behavioral.strategy;

public class MergeSort implements SortingStrategy {

    @Override
    public void sort(final int[] array) {
        System.out.println("Реализация сортировки слиянием");
    }
}
