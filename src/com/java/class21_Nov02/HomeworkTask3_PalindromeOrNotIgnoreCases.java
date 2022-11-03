package com.java.class21_Nov02;

import java.util.Scanner;
/*
3. Java Program to determine whether a given string is palindrome or not by ignoring the case of characters and white spaces
Example
Input - Was it a car or a cat I saw
Output - Palindrome
 */
public class HomeworkTask3_PalindromeOrNotIgnoreCases {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        if (str.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}

