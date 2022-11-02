package com.java.CodingBat.Strings;

import java.util.Scanner;

public class RemoveCharFromGivenString {
    /*

    Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter any sentence: ");
        String input = sc.nextLine();
        System.out.println(returnStringWithMissingCharacter(input, 5));
    }

    public static String returnStringWithMissingCharacter(String str, int n){

        String beforeMissingChar = str.substring(0, n);
        String afterMissingChar = str.substring(n + 1);

        return beforeMissingChar + afterMissingChar;
    }
}
