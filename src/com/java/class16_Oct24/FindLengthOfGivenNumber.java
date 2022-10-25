package com.java.class16_Oct24;

import java.util.Scanner;

public class FindLengthOfGivenNumber {
    public static void main(String[] args) {
        /*
        Write a program to print the length of given number:
        Example:
        Input - 3543346
        Output - 7
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any whole number and I will tell you it's length: ");
        int input = sc.nextInt();
        int count = 0;

        while (input!= 0) {
            input = input / 10;
            count++;
        }
        System.out.println("The length of the number is: " + count);
    }
}
