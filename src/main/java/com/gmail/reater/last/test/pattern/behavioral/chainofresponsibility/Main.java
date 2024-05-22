package com.gmail.reater.last.test.pattern.behavioral.chainofresponsibility;

public class Main {

    /*
        Цепочка обязанностей - это паттерн проектирования, который позволяет
        передавать запросы последовательно по цепочке обработчиков.
        Каждый последующий обработчик решает, может ли он обработать запрос сам
        и стоит ли передавать запрос дальше по цепи
    */
    /*
        Удобно применять когда:
        - есть более одного объекта, способного обработать запрос, и необходимый обработчик заранее не известен
        - отправляем одному из обработчиков, не указывая его явно
        - обработчики задаются динамически
    */
    public static void main(String[] args) {
        ValidateTransaction firstValidation = new MinLimit();
        ValidateTransaction secondValidation = new MaxLimit();
        firstValidation.setNext(secondValidation);

        firstValidation.check(new MoneyTransaction(1000));
        System.out.println("-----");
        firstValidation.check(new MoneyTransaction(2000));
        System.out.println("-----");
        firstValidation.check(new MoneyTransaction(20000));
    }
}
