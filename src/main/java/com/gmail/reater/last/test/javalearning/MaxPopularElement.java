package com.gmail.reater.last.test.javalearning;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxPopularElement {

    public static void main(String[] args) {
        Stream.of(1, 3, 4, 3, 4, 3, 2, 3, 3, 3, 3, 3)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
    }
}
