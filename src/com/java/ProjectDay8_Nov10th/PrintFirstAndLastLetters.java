package com.java.ProjectDay8_Nov10th;

import java.util.Scanner;

public class PrintFirstAndLastLetters {
    public class NumberOfEvenNumbers {
        public static void main(String[] args) {
            /**
             * Given an array of String, iterate through each word
             * Print first and last letters of each element in a separate line
             */

            Scanner scanner = new Scanner(System.in);
            String[] words = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};
            // the length is: 5
            // the indices are: 0, 1, 2, 3, 4

            printLetters(words);
        }

        public static void printLetters(String[] words) {
            //TODO IMPLEMENT THIS METHOD

            char firstLetter = ' ';
            char lastLetter = ' ';

            for (String word : words){
                firstLetter = word.charAt(0);
                lastLetter = word.charAt(word.length() - 1);
            }

            System.out.println(firstLetter);
            System.out.println(lastLetter);
        }
    }
}
