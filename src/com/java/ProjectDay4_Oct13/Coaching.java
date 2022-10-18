package com.java.ProjectDay4_Oct13;

import java.util.Scanner;

public class Coaching {
    public static void main(String[] args) {

        /**
         *
         * Write a java program for Coaching with Love Daycare.
         * Follow acceptance criteria:
         * age should be older than 1.5 but younger than 6 (inclusively)
         * if age is less than 3 years -> class name is Star and fee is 2000
         * if age is less than 6 years -> class name is Sun and fee is 1500
         * if they agree with the price -> print child is accepted.
         * otherwise child should not have a class and print he/she is not accepted.
         *
         *
         *
         * 1)example output - positive:
         * Enter child's name
         * Elsa
         * Enter age:
         * 2
         * Daycare fee is 2000
         * Would you like to apply?
         * true
         * Congratulations! Elsa is accepted!
         * Elsa's class is Star
         *
         * 2)example output - negative:
         * Enter child's name
         * Anna
         * Enter age:
         * 3
         * Daycare fee is 1500
         * Would you like to apply?
         * false
         * Anna is not accepted.
         *
         * 3)example output - negative:
         * Enter child's name
         * Christoph
         * Enter age:
         * 1
         * Christoph is not accepted.
         *
         */


        Scanner scan = new Scanner(System.in);
        String name = "";
        double age = 0;
        int price = 0;
        String childClass = "";
        boolean agreement = false;


        // TODO WRITE YOUR CODE HERE

        System.out.println("Please enter your child's name: ");
        name = scan.next();

        System.out.println("Please enter your child's name: ");
        age = scan.nextDouble();

        if ( age < 1.5 && age > 6) {
            System.out.println("Your child is not accepted!");
        } else if (age < 3){
            childClass = "Star";
            price = 2000;
            System.out.println("Daycare fee is: " + price +
                    " .Would you like to apply? Select \"true\" or \"false\" ");
            agreement = scan.nextBoolean();
            if (agreement == true) {
                System.out.println("Congratulations!" + name + "is accepted!\nYour child's class is Star.");
            } else {
                System.out.println("Your child is not accepted!");
            }
        }

        //ignore this
        //Validation.testDaycare(age, agreement, childClass);

    }
}
