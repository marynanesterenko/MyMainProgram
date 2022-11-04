package com.java.ProjectDay7_Nov3rd;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        /**
         * Write a function that concatenates two words into single,
         * however if the concatenation creates a similar double char, then omit one of the character's
         * ex:
         * "abc" "cat" -> "abcat"
         *
         * ex2:
         * "abc", "xyz" -> "abcxyz"
         *
         * ex3:
         * "happy", "yolk" -> happyolk
         */

        //TODO WRITE YOUR CODE HERE
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first word: ");
        String input1 = sc.nextLine();
        System.out.println("Please enter the second word: ");
        String input2 = sc.nextLine();
        System.out.println(concat(input1, input2));
    }

    public static String concat(String word1, String word2) {
        // TODO IMPLEMENT METHOD

        String lastCharOfWord1 = word1.charAt(word1.length() - 1) + "";
        String firstCharOfWord2 = word2.charAt(0) + "";

        if (!lastCharOfWord1.equalsIgnoreCase(firstCharOfWord2)) {
                return word1 + word2;

        } else {
            return word1.substring(0, word1.length()-1) + word2;
        }
    }
}
