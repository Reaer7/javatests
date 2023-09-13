package com.gmail.reater.last.test.seniorjavadeveloper;

import java.util.BitSet;

public class BitSetTest {

    public static void main(String[] args) {
        final BitSet bitSet1 = new BitSet(16);

        // установка битов
        bitSet1.set(1);
        bitSet1.set(10);

        System.out.println("BitSet 1 - " + bitSet1);

        final BitSet bitSet2 = new BitSet(16);

        // установка битов
        bitSet2.set(3);
        bitSet2.set(5);
        bitSet2.set(9);

        System.out.println("BitSet 2 - " + bitSet2);

        // объединение множеств
        bitSet1.or(bitSet2);
        System.out.println("b1 AND b2 - " + bitSet1);

        // пересечение множеств
        bitSet1.and(bitSet2);
        System.out.println("res OR b2 - " + bitSet1);

        // удаление элемента
        bitSet1.clear(5);
        System.out.println("res drop 5 - " + bitSet1);

        final BitSet bitSet3 = new BitSet(16);
        bitSet3.set(1);
        bitSet3.set(3);
        bitSet3.set(5);
        System.out.println("BitSet 3 - " + bitSet3);

        // объединение уникальных
        bitSet1.xor(bitSet3);
        System.out.println("res XOR b3 - " + bitSet1);

        final BitSet bitSet4 = new BitSet(16);
        bitSet4.set(9);
        bitSet4.set(8);
        System.out.println("BitSet 4 - " + bitSet4);

        // удаление списка
        bitSet1.andNot(bitSet4);
        System.out.println("res AND NOT b4 - " + bitSet1);
    }
}
