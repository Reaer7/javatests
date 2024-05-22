package com.gmail.reater.last.test.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<String, SymbolFlyweight> hashMap = new HashMap();

    public SymbolFlyweight getSymbol(String symbol, String symbolStyle) {
        if (!hashMap.containsKey(symbol)) {
            hashMap.put(symbol, new ConcreteFlyweight(symbol, symbolStyle));
        }

        return hashMap.get(symbol);
    }
}
