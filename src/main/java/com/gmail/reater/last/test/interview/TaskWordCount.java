package com.gmail.reater.last.test.interview;

public class TaskWordCount {

    public static void main(String[] args) {
        final String str = "  Этот собес  не такой уж  и  страшный монстр !";

        int wordCount = getWordCount(str);

        System.out.println("Word count: " + wordCount);
    }

    /*
        Получить количество слов в строке
    */
    private static int getWordCount(final String str) {
        int wordCount = 0;

        // write your code //

        return wordCount;
    }
}


































































/* answer:
        for (int indexOfChar = 0; indexOfChar < str.length(); indexOfChar++) {
            if (indexOfChar != 0) {
                if (str.charAt(indexOfChar) == ' ' && str.charAt(indexOfChar - 1) != ' ') {
                    wordCount++;
                }
            }
            if (indexOfChar == str.length() - 1 && str.charAt(indexOfChar) != ' ') {
                wordCount++;
            }
        }
*/