package com.gmail.reater.last.test.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WorkWithStream {

    public static void main(String[] args) {

        int[] listOutputSorted = IntStream.of(-3, 10, -4, 1, 3)
                .sorted()
                .toArray();
        System.out.println(listOutputSorted);


        String text = """
        Lorem Ipsum is simply dummy text of the printing and typesetting industry.
        Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.
        It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.
        It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,
        and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
        """;

        final List<String> strings = Arrays.stream(text.split("\\PL+")).toList();
        final Optional<Integer> optionalInteger = strings.stream()
                .limit(50)
                .map(s -> s.length())
                .map(integer -> integer % 10)
                .distinct()
                .filter(value -> value > 3)
                .findFirst();
        System.out.println(optionalInteger);


        final List<Integer> ints = // ThreadLocalRandom.current()
                                    new Random()
                        .ints(100, 100, 1000)
                        .boxed()
                        .collect(Collectors.toList());
        final Optional<Integer> first = ints.stream()
                .limit(50)
                .map(operand -> operand % 10)
                .distinct().filter(value -> value > 3)
                .findFirst();

        System.out.println(first);
    }
}
