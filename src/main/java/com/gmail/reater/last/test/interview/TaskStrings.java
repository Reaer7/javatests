package com.gmail.reater.last.test.interview;

import java.util.Objects;

public class TaskStrings {

    public static void main(String[] args) {
        final String str1 = "task";
        final String str2 = "task";
        final String str3 = new String("task");

        System.out.println(str1 == str3);
        System.out.println(str1 == str2);
        System.out.println(Objects.equals(str2, str3));
        System.out.println(Objects.equals(str2, str1));
    }
}
