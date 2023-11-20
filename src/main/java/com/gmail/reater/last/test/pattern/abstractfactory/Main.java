package com.gmail.reater.last.test.pattern.abstractfactory;

public class Main {

    /*
        Абстрактная фабрика - позволяет создавать !семейства! связанных объектов,
        не привязываясь к конкретным классам создаваемых объектов.
    */
    public static void main(String[] args) {
        final BirthdaySet birthdaySet1 = new AdultBirthdaySet();
        System.out.println(doParty(birthdaySet1));

        final BirthdaySet birthdaySet2 = new KidsBirthdaySet();
        System.out.println(doParty(birthdaySet2));
    }

    private static String doParty(final BirthdaySet birthdaySet) {
        return birthdaySet.getCard().getName() + " and "
                + birthdaySet.getGift().getName() + " and "
                + birthdaySet.getCake().getName();
    }
}
