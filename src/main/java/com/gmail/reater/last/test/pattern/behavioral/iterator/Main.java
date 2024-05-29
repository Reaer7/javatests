package com.gmail.reater.last.test.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    /*
        Итератор - это паттерн, позволяющий последовательно обходить
        сложную коллекцию, без раскрытия деталей реализации
    */
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("name1", 16));
        users.add(new User("name2", 26));
        users.add(new User("name3", 18));

        Iterator<User> iterator = new AdultUserIterator(users);
        while (iterator.hasNext()) {
            User user = iterator.next();
            System.out.println(user.getName());
        }
    }
}
