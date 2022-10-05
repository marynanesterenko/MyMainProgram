package com.java.class02;

import java.util.Scanner;

public class SumOfTheSameNumbers {
    public static void main(String[] args) {
        /*
        Write a program that will do the following:
        Example:
        Input: 3
        Output: 3 + 33 + 333
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int n = sc.nextInt();
        System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);
    }
}
