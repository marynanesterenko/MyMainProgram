package com.java.class12_Oct12_IntroToMethods;

import java.util.Scanner;

public class BasicMethodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printLineWithEqual(50);
        // System.out.println("=================================");
        System.out.println("Welcome to the CalculatorUsingMethods");
        // System.out.println("=================================");
        printLineWithEqual(50);

        printLineWithStar(20);
        //System.out.println("*********************************");
        System.out.println("Please enter the first number: ");
        //System.out.println("*********************************");
        printLineWithStar(20);
        int num1 = sc.nextInt();

        printLineWithStar(20);
        //System.out.println("*********************************");
        System.out.println("Please enter the second number: ");
        //System.out.println("*********************************");
        printLineWithStar(20);
        int num2 = sc.nextInt();

        printLineWithHyphen(50);
        //System.out.println("---------------------------------------");
        System.out.println("Here is your addition: " + (num1 + num2));
        //System.out.println("---------------------------------------");
        printLineWithHyphen(50);

    }

        static void printLineWithEqual(int length) {
            for (int i = 0; i < length; i++ )
            System.out.println("=");
        }

        static void printLineWithHyphen(int length) {
            System.out.println("---------------------------------------");
        }
        static void printLineWithStar(int length) {
            System.out.println("*********************************");
        }
}
