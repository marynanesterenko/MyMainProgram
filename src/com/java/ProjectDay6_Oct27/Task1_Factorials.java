package com.java.ProjectDay6_Oct27;

import java.util.Scanner;

public class Task1_Factorials {
    public static void main(String[] args) {
        /**
         * In math, the factorial of a positive integer n, denoted by n! is the product of all integers less than or equal to n.
         * Calculate factorial and output result to the console.
         * ex: 5! = 5 * 4 * 3 * 2 * 1
         * Enter a number:
         * 5
         * Factorial result: 120
         */

        // TODO write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();
        calculateFactorial(num);
    }

    public static void calculateFactorial(long number) {
        // TODO IMPLEMENT METHOD
        long var = 1;
        for (long i = number; i > 0; i--){
            var = var * i;
        }
        System.out.println("Factorial result: " + var);
    }
}
