package com.java.class09_Oct05;

import java.util.Scanner;

    public class CoachingWithLoveDaycare {

        public static void main(String[] args) {

            /**
             *
             * Write a java program for Coaching with Love Daycare.
             * Follow acceptance criteria:
             * age should be older than 1.5 but younger than 6
             * if age is less than 3 years -> class name is Star and fee is 2000
             * if age is less than 6 years -> class name is Sun and fee is 1500
             * if they agree with the price -> print child is accepted.
             * otherwise, child should not have a class and print he/she is not accepted.
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

            Scanner sc = new Scanner(System.in);
//        String name = "";
//        double age = 0;
//        int price = 0;
//        String childClass = "";
//        boolean agreement = false;

            // TODO WRITE YOUR CODE HERE
            int price = 0;
            String childClass = "";

            System.out.println("Please enter child's name: ");
            String childName = sc.nextLine();

            System.out.println("Please enter your child's age: ");
            double age = sc.nextDouble();

            if (age > 1.5 && age <= 3) {
                System.out.println("Daycare fee is 2000. \nWould you like to apply?");
                boolean agreement = sc.nextBoolean();
                if (agreement == false) {
                    System.out.println(childName + " is not accepted!");
                } else {
                    System.out.println("Congratulations! " + childName + " is accepted!"
                            + "\n" + childName + "'s class is Star.");
                }
            } else if (age > 3 && age < 6) {
                System.out.println("Daycare fee is 1500. \nWould you like to apply?");
                boolean agreement = sc.nextBoolean();
                if (agreement == false) {
                    System.out.println(childName + " is not accepted!");
                } else {
                    System.out.println("Congratulations! " + childName + " is accepted!"
                            + "\n" + childName + "'s class is Sun.");
                }
            } else if (age <=0 ) {
                System.out.println("The age you've entered is invalid.");
            } else if (age > 0 && age < 3 || age >= 6 ){
                System.out.println(childName + "is not accepted. We only accept children up to 6 y.o. ");
            }
        }
    }
