package com.java.class06;

import java.util.Scanner;

public class HomeworkTask1_Sept28 {
    private static Scanner sc;
    public static void main(String[] args) {
        // Task 1. Write a program to get a number from user and print square of given number
        Scanner sc = new Scanner(System.in);
        double number, square;

        System.out.println("Please enter any number and I will calculate the square of it for you: ");
        number = sc.nextDouble();
        square = calculateTheSquare(number);
        System.out.println("The square of the " + number + " is: " + square);
    }

    public static double calculateTheSquare ( double num)
    {
        return num * num;
    }
}
