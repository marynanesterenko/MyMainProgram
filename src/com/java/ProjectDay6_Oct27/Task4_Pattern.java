package com.java.ProjectDay6_Oct27;

import java.util.Scanner;

public class Task4_Pattern {
    public static void main(String[] args) {
        /**
         * Write a program that builds a text from a pattern with the following definition
         * 1) Word
         * 2) Separator
         * 3) Times
         *
         * if values are as follows -> word = java, separator = &, times = 2
         * then it should print "java&java"
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.next();
        System.out.print("Enter the separator: ");
        String separator = sc.next();
        System.out.print("Enter the number of times: ");
        int times = sc.nextInt();
        System.out.println(buildText(word, separator, times));
    }

    public static String buildText(String word, String separator, int times) {
        //TODO Implement this method

        String result = word;
        for (int i = 1; i < times; i++) {
            result = result + separator + word;
        }
        return result;
    }
}

