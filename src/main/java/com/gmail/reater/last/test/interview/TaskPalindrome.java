package com.gmail.reater.last.test.interview;

public class TaskPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("10001"));
        System.out.println(isPalindrome("12345"));
        System.out.println(isPalindrome("123321"));
    }

    /*
        A palindrome is a word, number, phrase, or other sequence of symbols that reads the same backwards as forwards.
    */
    private static boolean isPalindrome(final String number) {
        boolean isPalindrome = false;

        // write your code //

        return isPalindrome;
    }
}













































































// answer: number.contentEquals(new StringBuilder(number).reverse())