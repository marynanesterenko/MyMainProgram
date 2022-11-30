package com.java.class09_Oct05_NesteredIfElse;

import java.util.Scanner;

public class HomeworkTask1_Oct05 {
    /*
    Task #1: Write a program to get a year from the user and check whether it's a leap year or not
             Example
             Input  : Year = 2000
             Output : Leap year
     */

    public static void main(String[] args) {
        System.out.println("Please enter a year to be checked whether it is a leap year or not: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Your year is leap!");
            } else {
                System.out.println("Your year is not leap!");
            }
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Your year is a leap year!");
        } else {
            System.out.println("Your year is not leap!");
        }
    }
}
