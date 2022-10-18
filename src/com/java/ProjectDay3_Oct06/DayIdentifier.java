package com.java.ProjectDay3_Oct06;

import java.util.Scanner;

public class DayIdentifier {
    public static void main(String[] args) {
        /**
         *
         * Write a Java program that keeps a number from the user between 1 and 7 and displays the name of the weekday.
         *
         * example output:
         * Enter a number to get day of the week
         * 1
         * You selected Monday!
         *
         * another output:
         * Enter a number to get day of the week
         * 8
         * You selected Wrong day!
         *
         */

        Scanner sc = new Scanner(System.in);
        int input = 0;
        String day = "";

        //TODO implement your code here...
        System.out.println("Please enter the number between 1 - 7: ");
        input = sc.nextInt();

        if (input >= 1 && input <= 7) {

            if ( input == 1 ) {
                day = "Monday";
            } else if (input == 2){
                day = "Tuesday";
            } else if (input == 3){
                day = "Wednesday";
            } else if (input == 4){
                day = "Thursday";
            } else if (input == 5){
                day = "Friday";
            } else if (input == 6){
                day = "Saturday";
            } else if (input == 7){
                day = "Sunday";
            }
            System.out.println("You have selected: " + day);

        } else {
            System.out.println("Please only enter the number from 1 to 7!");
        }
    }
}
