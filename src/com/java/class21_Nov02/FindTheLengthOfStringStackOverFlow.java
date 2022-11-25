package com.java.class21_Nov02;
/*

INTERVIEW QUESTION:
Write a program to find the length of the String without using the .length() method

 */

import java.util.Scanner;

public class FindTheLengthOfStringStackOverFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String name = sc.nextLine(); // Maryna Nesterenko

            name = name + '\0';
            int count = 0;

            for (int i = 0; name.charAt(i) != '\0'; i++) {
                count++;
            }
        System.out.println(count);
        }
    }

