package com.java.class12_Oct12_IntroToMethods;

import java.util.Scanner;

public class CalculatorUsingMethods {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println(addTwoNumbers(num1, num2));
        System.out.println(subTwoNumbers(num1, num2));
        System.out.println(mulTwoNumbers(num1, num2));
    }

    static int addTwoNumbers (int num1, int num2) {
        int add = num1 + num2;
        return add;
    }

    static int subTwoNumbers (int num1, int num2) {
        System.out.println();
        int sub = num1 - num2;
        return sub;
    }

    static int mulTwoNumbers (int num1, int num2) {
        System.out.println();
        int mul = num1 * num2;
        return mul;
    }
}
