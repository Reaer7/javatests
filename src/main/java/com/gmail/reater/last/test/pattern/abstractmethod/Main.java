package com.gmail.reater.last.test.pattern.abstractmethod;

public class Main {

    /*
        Фабричный метод - решает проблему создания объектов разного типа одним методом,
        возвращаемый тип зависит от логики описанной в методе.
    */
    public static void main(String[] args) {
        final Gift kidsGift = new GiftFactory().createGift(10);
        System.out.println(kidsGift.getName());

        final Gift matureGift = new GiftFactory().createGift(25);
        System.out.println(matureGift.getName());
    }
}
