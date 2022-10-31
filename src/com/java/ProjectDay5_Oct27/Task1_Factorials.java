package com.java.ProjectDay5_Oct27;

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
        int var = 1;
        for (int i = 1; i >= number; i++){
            var = var * i;
        }
        System.out.println("Factorial result: " + var);
    }
}
