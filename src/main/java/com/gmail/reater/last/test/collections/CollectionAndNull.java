package com.gmail.reater.last.test.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionAndNull {

    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        System.out.println("list - " + list);
        System.out.println();

        final Set<String> set = new HashSet<>();
        set.add(null);
        set.add(null);
        System.out.println("set - " + set);
        System.out.println();

        final Queue<String> queue = new LinkedList<>();
        queue.add(null);
        queue.add(null);
        System.out.println("queue - " + queue);
        System.out.println();

        final Map<String, String> map = new HashMap<>();
        map.put("1", null);
        map.put("2", null);
        map.put(null, "3");
        System.out.println("map - " + map);
        map.put(null, "4");
        System.out.println("map - " + map);
        map.put(null, null);
        System.out.println("map - " + map);
    }
}
