package com.java.ProjectDay7_Nov3rd;

import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        /**
         * Write a program to count number of vowels, consonants,
         * digits, special characters and whitespaces in the string
         *
         * Ex 1:
         *
         * Enter the string : This program is very easy
         * Vowels: 7
         * Consonants: 14
         * Digits: 0
         * White spaces: 4
         * Symbols : 0
         *
         * Ex 2:
         *
         * Enter the string : 123 this very ^^
         * Vowels: 2
         * Consonants: 6
         * Digits: 3
         * White spaces: 3
         * Symbols : 2
         */

        String line;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        line = sc.nextLine();
        printCounts(line);
    }

    public static void printCounts(String word) {
        // TODO IMPLEMENT METHOD
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
        int digits = 0;
        int everythingElse = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'a' || word.charAt(i) == 'A' ||
                word.charAt(i) == 'e' || word.charAt(i) == 'E' ||
                word.charAt(i) == 'i' || word.charAt(i) == 'I' ||
                word.charAt(i) == 'o' || word.charAt(i) == 'O' ||
                word.charAt(i) == 'u' || word.charAt(i) == 'U'  ) {

                vowels++;

            } else if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z' || word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                consonants++;
            } else if (word.charAt(i) == ' '){
                spaces++;
            } else if (word.charAt(i) >=0 && word.charAt(i) <= 9){
                digits++;
            } else {
                everythingElse++;
            }
        }

        System.out.println(
                "Vowels: " + vowels +
                "\nConsonants: " + consonants +
                "\nDigits: " + digits +
                "\nWhite spaces: " + spaces +
                "\nSymbols: " + everythingElse);
    }
}
