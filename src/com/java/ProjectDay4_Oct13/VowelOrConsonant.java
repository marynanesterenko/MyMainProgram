package com.java.ProjectDay4_Oct13;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        /**
         *
         *  Write a Java program that takes a single character from the alphabet and
         *  Print Vowel or Consonant, depending on the user input.
         *  If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
         *  Hint:
         *  lowercase letters are between 97 and 122 char
         *
         *  Example output:
         * Input an alphabet:
         * p
         * Input letter is Consonant
         *
         */

        System.out.println("Input an alphabet: ");
        Scanner input = new Scanner(System.in);
        String enteredString = input.next();
        // checks whether an input has 1 letter
        if (enteredString.length() > 1) {
            System.out.println("Input length is longer than 1");
            System.exit(0);
        }
        // converts String to lower case char
        char toChar = enteredString.toLowerCase().charAt(0);


        String result = "";
        // checks if char is numeric or alphabetic
        if (Character.isAlphabetic(toChar)) {
            // TODO write your code here
            // System.out.println("Input an alphabet: ");

            switch (toChar) {
                case 'a':
                case 'o':
                case 'u':
                case 'i':
                case 'e':

                result = "Vowel";
                break;

                default:
                result = "Consonant";
           }

            System.out.println("Input letter is " + result);

        } else {
            System.err.println("Please enter single letters only!");
        }

        // ignore this...
        // Validation.testAlphabet(toChar, result);

    }
}
