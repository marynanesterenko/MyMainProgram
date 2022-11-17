package com.java.ProjectDay8_Nov10th;

import java.util.Arrays;
import java.util.Scanner;

public class VerifyArrays {
    public static void main(String[] args) {
        /**
         * Write a program that checks if the given two arrays are equal
         *
         * Values and indexes must match.
         * must be case-sensitive
         *
         * EX:
         * String[] arr1 = new String[]{"A", "B", "C"};
         * String[] arr2 = new String[]{"A", "B", "C"}
         *
         * true
         *
         * EX2:
         * String[] arr2 = new String[]{"A", "B", "C"};
         * String[] arr3 = new String[]{"B", "B", "A"};
         *
         * false
         */

        //TODO WRITE YOUR CODE HERE
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first array of 3 strings: ");
        String [] firstArray = {sc.nextLine(), sc.nextLine(), sc.nextLine()};
        System.out.println("Enter your first array of 3 strings: ");
        String [] secondArray = {sc.nextLine(), sc.nextLine(), sc.nextLine()};

    }

    public static boolean areEqual(String[] arr1, String[] arr2) {
        //TODO IMPLEMENT THIS METHOD
        if (Arrays.equals(arr1, arr2)) {

            return true;
        } else {
            return false;
        }
    }
}
