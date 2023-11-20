package com.gmail.reater.last.test.pattern.composite;

import java.util.List;

public class Main {

    /*
        Компоновщик - позволяет сгруппировать множество объектов в древовидную структуру,
        а затем работать с ней так, как будто это единичный объект.
    */
    public static void main(String[] args) {
        final BoxContainer boxContainer1 = new BoxContainer(List.of(new PurchaseLeaf(100)));
        final BoxContainer boxContainer2 = new BoxContainer(List.of(new PurchaseLeaf(200)));
        final BoxContainer boxContainer3 = new BoxContainer(List.of(new PurchaseLeaf(250), boxContainer2));
        final BoxContainer boxContainer4 = new BoxContainer(List.of(boxContainer1, boxContainer2, boxContainer3));
        System.out.println(boxContainer4.countPrice());
    }
}
