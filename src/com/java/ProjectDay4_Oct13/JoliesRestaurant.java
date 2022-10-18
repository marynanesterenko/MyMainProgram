package com.java.ProjectDay4_Oct13;

import java.util.Scanner;

public class JoliesRestaurant {
    public static void main(String[] args) {
        /**
         *
         * Write a check to a customer based on their input
         * - how many people?
         * - what is the total amount?
         *      * automatically add 10% tax fee
         * - provide check together or split?
         *      * split - divide amount per person
         *      * together - one total amount for all
         * - how was the restaurant's service?
         *      * bad - 10%
         *      * ok - 15%
         *      * good - 20%
         *      * perfect - 25%
         *
         *
         * example output:
         * out: Welcome to Jolie's Restaurant!!!
         * out: Enter number of guests:
         *  in: 5
         * out: Enter a restaurant bill amount:
         *  in: 200
         * out: Is your check split?
         *  in: true
         * out: How was the restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%)
         *  in: perfect
         * out: Number of guests: 5
         * out: Total amount: $275.0
         * out: Total per guest: $55.0
         */

        Scanner scanner = new Scanner(System.in);
        int numberOfGuests = 0;
        double billAmount = 0;
        double taxFee = 0;
        boolean isSplit = false;
        String serviceQuality = "";
        double totalAmount = 0;
        double totalAmountPerGuest = 0;

        //TODO write your code here
        System.out.println("Welcome to Jolie's Restaurant!");

        System.out.println("Enter number of guests:");
        numberOfGuests = scanner.nextInt();

        System.out.println("Enter a restaurant bill amount: ");
        billAmount = scanner.nextDouble();
        taxFee = billAmount * 0.1;
        totalAmount = billAmount + taxFee;

        System.out.println("Is your check split?");
        isSplit = scanner.nextBoolean();

        System.out.println("How was the restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%): ");
        serviceQuality = scanner.next();

        switch (serviceQuality) {

            case "perfect" :
                totalAmount = totalAmount + (totalAmount * 0.25);
            break;

            case "good":
                totalAmount = totalAmount + (totalAmount * 0.2);
            break;

            case "ok":
                totalAmount = totalAmount + (totalAmount * 0.15);
            break;

            case "bad":
                totalAmount = totalAmount + (totalAmount * 0.1);
            break;
        }

        totalAmountPerGuest = totalAmount / numberOfGuests;

        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Total amount: $" + totalAmount);
        System.out.println("Total per guest: $" + String.format("%.2f", totalAmountPerGuest));

        // ignore this
        // Validation.testBill(numberOfGuests, billAmount, isSplit, serviceQuality, totalAmount, totalAmountPerGuest);
    }
}
