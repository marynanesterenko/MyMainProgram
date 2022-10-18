package com.java.ProjectDay3_Oct06;

import java.util.Scanner;

public class NumberIdentifier {
    public static void main(String[] args) {

        /**
         *
         * Write a Java program that reads an integer and check whether it is negative, zero, or positive.
         *
         * example output:
         * Enter a number
         * 0
         * Your number "0" is zero
         */

        Scanner sc;
        int number = 0;
        String value = "";

        //TODO implement your code here...

        sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");

        if (number > 0 ){
            value = " Your number is positive";
        } else if(number < 0) {
            value = "\n" + " Your number is negative";
        } else {
            value = "\n" + " Your number is zero";
        }
        System.out.println("\n" + "Your number message is: " + number  + value );
    }
}
