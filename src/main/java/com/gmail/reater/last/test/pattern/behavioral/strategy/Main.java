package com.gmail.reater.last.test.pattern.behavioral.strategy;

public class Main {

    /*
        Стратегия - определяет семейство алгоритмов,
        инкапсулируя их все и возволяя подставлять один вместо другого.
        Можно менять алгоритм независимо от клиента, который им пользуется
    */
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 1, 5, 9, 5, 3, 8};

        ArraySorter sorter = new ArraySorter(new BubbleSort());
        sorter.sort(array);

        sorter.setStrategy(new MergeSort());
        sorter.sort(array);
    }
}
