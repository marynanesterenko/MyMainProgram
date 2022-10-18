package com.java.class06_Sept28;

import java.util.Scanner;

public class HomeworkTask3_Sept28 {
    public static void main(String[] args) {
        /*
        Task 3.  Write a program to take total bill amount and discount percentage from user
        and print value of final bill amount after discount
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the total amount of your bill? ");
        double totalBillAmount = sc.nextDouble();

        System.out.println("What is your discount percentage of the coupon that you have? ");
        double discountPercentage = sc.nextDouble()/100;

        double finalBill = totalBillAmount - (totalBillAmount * discountPercentage);
        System.out.println("After applying the discount to your bill," +
                "\nyour total came down to $" + String.format("%.2f", finalBill) + ".");
    }
}
