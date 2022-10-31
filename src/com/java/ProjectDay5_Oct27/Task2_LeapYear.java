package com.java.ProjectDay5_Oct27;

import java.util.Scanner;

public class Task2_LeapYear {
    public static void main(String[] args) {
        /**
         * We have a customer who was born on a leap date (04.28.1950). In 2010 she turned 60,
         * but officially she is 15 years old, since there were only 15 leap years between 1950 and 2010.
         *
         * Write a program that takes two years and counts the number of leap years between two years
         *
         * Example output:
         * Enter first year: 1950
         * Enter second year: 2010
         *
         * Number of leap years: 15
         *
         */
        Scanner sc = new Scanner(System.in);
        int startYear;
        int endDate;
        // TODO WRITE YOUR CODE HERE
        System.out.println("Enter first year: ");
        startYear = sc.nextInt();

        System.out.println("Enter second year: ");
        endDate = sc.nextInt();

        countLeapYearsBetweenYears(startYear, endDate);

    }

    public static int countLeapYearsBetweenYears(int startYear, int endYear) {
        // TODO IMPLEMENT METHOD
        int difference = startYear - endYear;
        int count = 0;
        while (difference % 4 == 0){
            difference ++;
            if ( difference % 400 == 0 && difference % 4 == 0 || difference % 100 != 0){
            count++;
            }

        }
            return count;
    }
}



