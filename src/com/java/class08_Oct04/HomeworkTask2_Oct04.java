package com.java.class08_Oct04;

import java.util.Scanner;

public class HomeworkTask2_Oct04 {
    public static void main(String[] args) {
        /*
        Task#2: Write a program to calculate the final bill of the customer after giving an appropriate discount based on the amount as follows:
        If total amount equal or above 10000 then give 20% discount
        If total amount equal or above 5000 then give 15% discount
        If total amount equal of above 2000 then given 10% discount
        If total amount equal of above 1000 then given 5% discount
        If total amount less than 1000 then 0% discount
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the total amount of your bill in dollars? ");
        double totalBillAmount = sc.nextDouble();

        double discountTwenty = totalBillAmount * 0.2;
        double discountFifteen = totalBillAmount * 0.15;
        double discountTen = totalBillAmount * 0.1;
        double discountFive = totalBillAmount * 0.05;

        if (totalBillAmount >= 10000){
            System.out.println("Your final bill after the discount is: " + (totalBillAmount - discountTwenty) + "$");
        } else if (totalBillAmount >= 5000) {
            System.out.println("Your final bill after the discount is: " + (totalBillAmount - discountFifteen) + "$");
        } else if (totalBillAmount >= 2000) {
            System.out.println("Your final bill after the discount is: " + (totalBillAmount - discountTen) + "$");
        } else if (totalBillAmount >= 1000) {
            System.out.println("Your final bill after the discount is: " + (totalBillAmount - discountFive) + "$");
        } else {
            System.out.println("Unfortunately, we do not give a discount of the bill, " +
                    "that is less than $1000.");
        }
    }
}
