package com.java.CodingBat.Strings;
/*
Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there.
Note that str.toUpperCase() returns the uppercase version of a string.
 */

import java.util.Scanner;

public class LastThreeCharsUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string and I will upper case the last three letters for you: ");
        String str = sc.nextLine();

    }

    public static String convertLastThree(String str) {
        String converted = " ";

        if (str.length() < 3) {
            return str.toUpperCase();
        } else {
            String front = str.substring(0, str.charAt(str.length() - 3));

            return front;
        }
    }
}