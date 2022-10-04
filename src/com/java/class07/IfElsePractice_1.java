package com.java.class07;
// Write a program to get two numbers from the User and print the maximum number

import java.util.Scanner;

public class IfElsePractice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter any two numbers and I will find out, which one is bigger." +
                           "\nEnter the first number: ");

        double num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        if (num1 > num2) {

            System.out.println("The bigger number is: " + num1);

        } else if (num2 > num1){

            System.out.println("The bigger number is: " + num2);

        } else System.out.println("Numbers you've entered are equal! ");

    }

}
