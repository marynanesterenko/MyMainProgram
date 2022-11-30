package com.java.class10_Oct10_IfElsePractice;

import java.util.Scanner;

public class HomeworkTask1_Oct10th {
    /*
    Task 1. Write a program to get 3-digit number from the user (Valid Numbers - 100 to 999 only)
    and print reverse of the given number in the output.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any 3-digit number: ");

        int number = sc.nextInt();

        int digit1, digit2, digit3;

        digit1 = number % 10;
        digit2 = number % 100 / 10;
        digit3 = number % 1000 / 100;

        System.out.println(digit1 + " " + digit2 + " " + digit3);
    }
}
