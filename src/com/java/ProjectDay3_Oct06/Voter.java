package com.java.ProjectDay3_Oct06;

import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        /**
         *
         * Write Java program to allow the user to input his/her age.
         * Then the program will show if the person is eligible to vote.
         * A person who is eligible to vote must be older than or equal to 18 years old.
         *
         * example output:
         * Enter your age
         * 1
         * Eligible to vote: false
         */
        Scanner sc;
        int age = 0;
        boolean isEligible = false;

        //TODO implement your code here...
        sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        age = sc.nextInt();

        if (age < 18){
            System.out.println("Eligible to vote: " + isEligible);
        } else if (age >= 18){
            isEligible = true;
            System.out.println("Eligible to vote: " + isEligible);
        } else {
            System.out.println("Please enter valid age!");
        }
    }
}
