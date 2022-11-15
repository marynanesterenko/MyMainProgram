package com.java.ProjectDay5_Oct20;

import java.util.Scanner;

    public class Discount {

        public static void main(String[] args) {
            /**
             * Write a java program to calculate discount for a product
             *
             *  sample output:
             * Marked price:
             * 100
             * Discount rate:
             * 25
             * Amount after discount: 75.0
             */

            double markedPrice, discount, amount;
            Scanner scanner = new Scanner(System.in);
            Discount discountObj = new Discount(); // initialization of object

            //TODO WRITE YOUR CODE HERE
            System.out.println("Enter the market price: ");
            markedPrice = scanner.nextDouble();

            System.out.println("Enter the discount rate: ");
            discount = scanner.nextDouble();

            amount = discountObj.calculateDiscount(markedPrice, discount);
            String message = "The amount after discount: " + amount;

            discountObj.printMessage(message); // calling object by name

        }

        public double calculateDiscount(double markedPrice, double discount) { // parameters from  outside
            //TODO IMPLEMENT METHOD
            markedPrice = markedPrice - (markedPrice * discount/100);
            return markedPrice; // can return a datatype
        }

        public void printMessage(String message) { // no return type
            //TODO IMPLEMENT METHOD
            System.out.println( message);
        }
    }
