package com.java.class06;

import java.util.Scanner;

public class Scanner_AverageNumbers {
    public static void main(String[] args) {
        // Write a program to get three numbers from User and find average of these numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Please enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Please enter the third number: ");
        double num3 = sc.nextDouble();

        double average = (num1 + num2 + num3)/ 3;
        System.out.println("The average of your numbers is: " + average);
    }
}
