package com.java.ProjectDay5_Sept20;

import java.util.Scanner;

    public class LeapYear {

        public static void main(String[] args) {
            int year;
            Scanner scanner  = new Scanner(System.in);;
            LeapYear leapYear = new LeapYear();
            /**
             * Write a java program to find out if the given year is leap or not
             *
             * sample output:
             * enter any calendar year : 2000
             * 2000 is a leap year
             */

            //TODO write your code here
            System.out.println("Enter a year to check whether it is a leap year or not:  ");
            year = scanner.nextInt();
            if (leapYear.leapOrNot(year)){
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }

        }

        public boolean leapOrNot(int year) {

            return ((year % 4 == 0 && year%100!=0) || year%400==0);

        }
    }

