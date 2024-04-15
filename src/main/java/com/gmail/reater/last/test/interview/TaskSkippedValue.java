package com.gmail.reater.last.test.interview;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskSkippedValue {

    public static void main(String[] args) {
        int n = 15;
        final Set<Integer> integers = IntStream.range(1, n)
                .filter(value -> value != 11)
                .boxed()
                .collect(Collectors.toSet());

        Integer skippedValue = findSkippedValue(integers);
        if (skippedValue == null) {
            System.out.println("Value did not skipped");
        } else {
            System.out.println("Skipped value: " + skippedValue);
        }
    }

    /*
        В массиве находятся числа последовательности от 1 до n в произвольном порядке.
        Одно из чисел может быть пропущено.
        По массиву можно пройти только один раз!
        Найти пропущенное число.
    */
    private static Integer findSkippedValue(final Set<Integer> integers) {
        Integer skippedValue = null;

        // Your code //

        return skippedValue;
    }
}
