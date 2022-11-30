package com.java.class12_Oct12_IntroToMethods;

import java.util.Scanner;

public class HomeworkTask2_Oct12 {
    public static void main(String[] args) {
        /*
        Task_2. Write a program to check given number is odd or even using function
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("\nPlease enter your number and I will determine whether it is odd or even!");
        int num = sc.nextInt();

        determineOddOrEven(num);
    }

    static void determineOddOrEven(int number1) {

        if (number1 != 0) {
            if (number1 % 2 == 0) {
                System.out.println("The number you have entered is even.");
            } else {
                System.out.println("The number you have entered is odd.");
            }
        } else {
            System.out.println("The number you have entered is 0!");
        }
    }
}
