package com.java.class07_Oct03_LadderIfElse;

import java.util.Scanner;

public class HomeworkTask2_Oct03 {
    /*
    2.  Write a program to print the number of days in a given month
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, which corresponds with the month, " +
                "and I will tell you how many days is in that month: ");
        int number = sc.nextInt();

        if (number > 0 && number < 13) {
            if (number == 1) System.out.println("The month is January and it has 31 day");
            if (number == 2) System.out.println("The month is February and it has 28 days");
            if (number == 3) System.out.println("The month is March and it has 31 day");
            if (number == 4) System.out.println("The month is April and it has 30 days");
            if (number == 5) System.out.println("The month is May and it has 31 day");
            if (number == 6) System.out.println("The month is June and it has 30 days");
            if (number == 7) System.out.println("The month is July and it has 31 day");
            if (number == 8) System.out.println("The month is August and it has 31 day");
            if (number == 9) System.out.println("The month is September and it has 30 days");
            if (number == 10) System.out.println("The month is October and it has 31 day");
            if (number == 11) System.out.println("The month is November and it has 30 days");
            if (number == 12) System.out.println("The month is December and it has 31 day");
        } else {
            System.out.println("The number you've entered does not correspond with the month.");
        }
    }
}