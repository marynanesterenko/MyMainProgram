package com.java.class07;
// Write a program to print the name, based on day of week

import java.util.Scanner;

public class LadderIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any day of the week (0-6): ");
        int dayOfWeek = sc.nextInt();

        if (dayOfWeek == 0) {
            System.out.println("Sunday");
        } else if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("The number you entered is invalid." +
                    "\nPlease only enter the numbers between 0 and 6.");
        }
    }
}
