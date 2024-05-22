package com.gmail.reater.last.test.pattern.structural.flyweight;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    /*
        Легковес/Приспособленец - структурный паттерн, который предлагает использовать разделение
                                  для эффективной поддержки множества мелких объектов.
    */
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        factory.getSymbol("j", "Arial")
                .drawSymbol(new PositionExternalContext(0, 0));
        factory.getSymbol("a", "Arial")
                .drawSymbol(new PositionExternalContext(0, 1));
        factory.getSymbol("v", "Arial")
                .drawSymbol(new PositionExternalContext(0, 2));
        factory.getSymbol("a", "Arial")
                .drawSymbol(new PositionExternalContext(0, 3));

        // ----------------------------------------------------------
        System.out.println("// --------------------------------------------------------------");
        // ----------------------------------------------------------

        String str = "java";
        List<String> items = Arrays.asList(str.split("(?!^)"));

        AtomicInteger counter = new AtomicInteger();
        items.forEach(charString -> factory.getSymbol(charString, "Arial")
                .drawSymbol(new PositionExternalContext(0, counter.getAndAdd(1))));
    }
}
