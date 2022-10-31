package com.java.ProjectDay5_Oct27;

import java.util.Scanner;

public class Task3_NumberPower {
    public static void main(String[] args) {
        /**
         * User will provide two numbers, write a program that finds the result of one number raised to the power of another
         *
         * Example output:
         * Enter the base number: 2
         * Enter the power number: 3
         * Result: 8
         *
         */

        Scanner sc = new Scanner(System.in);
        int base;
        int power;

        // TODO WRITE CODE HERE
        System.out.println("Please enter the base number: ");
        base = sc.nextInt();

        System.out.println("Please enter the power number: ");
        power = sc.nextInt();

        System.out.println(countPowerOfNums(base, power));
    }

    public static int countPowerOfNums(int base, int power) {
        // TODO IMPLEMENT METHOD

        int result = 1;
        for (int i = 1; i <= power; i++ ) {
            result = result * base;
        }
        return result;
    }
}

