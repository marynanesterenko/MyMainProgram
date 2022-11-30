package com.java.class08_Oct04_LogicalOperatorsPractice;

import java.util.Scanner;

public class HomeworkTask1_Oct04 {
    public static void main(String[] args) {
        /*
        Task#1 : Write a program to take number from user and print if it's divisible by 5 or not
        Example
        Input - 6
        Output - Not divisible
        Input - 35
        Output - Divisible
         */

        Scanner sc = new Scanner (System.in);

        System.out.println("Please enter the number and I will tell you whether it is divisible by 5 or not: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("The number you've entered is divisible by 5.");
        } else {
            System.out.println("The number you've entered is not divisible by 5.");
        }
    }
}
