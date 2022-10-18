package com.java.ProjectDay3_Oct06;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        /**
         *
         * A company decided to give a bonus of 3% if his/her year of service is more than 3 years
         * inclusively and 5% to employee if his/her year of service is more than 5 years exclusively.
         * Ask user for their salary and year of service and print the net bonus amount.
         *
         * example output:
         * Enter you salary:
         * 100000
         * Enter years of service:
         * 3
         * Your bonus is 3000.0
         */
        Scanner sc = new Scanner(System.in);

        int salary = 0;
        int yearsOfService = 0;
        double bonus = 0;

        //TODO implement your code here...
        System.out.println("Please enter your salary: ");
        salary = sc.nextInt();

        System.out.println("Please enter your years of service: ");
        yearsOfService = sc.nextInt();

        if (yearsOfService >= 3 && yearsOfService <= 5){
            bonus = salary * 0.03;
            System.out.println("Your bolus is: " + bonus);

        } else if (yearsOfService > 5){
            bonus = salary * 0.05;
            System.out.println("Your bonus is: " + bonus);

        } else {
            System.out.println("You do not get any bonus!");
        }
    }
}
