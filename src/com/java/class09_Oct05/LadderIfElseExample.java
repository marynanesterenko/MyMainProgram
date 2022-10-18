package com.java.class09_Oct05;
// nested if else is generally not used in the programming
import java.util.Scanner;

public class LadderIfElseExample {
    public static void main(String[] args) {
        /*
        Write the program to the age and weight from the User and print message based on the following condition:
        1. User has age >= 18 y.o and weight >= 50, then "You are eligible for blood donation."
        2. User has age < 18 and weight > 50, then "You are too young to donate the blood."
        3. User has age > 18 and weight < 50, then "You are underweight. Please eat more and try again."
        4. User has age < 18 and weight < 50, then "You are not eligible."
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Please enter your weight: ");
        int weight = sc.nextInt();

        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You are eligible for blood donation");
            } else {
                System.out.println("You are underweight. Please eat more and try again.");
            }
        } else {
            if (weight >= 50) {
                System.out.println("You are too young to donate the blood.");
            } else {
                System.out.println("You are not eligible.");
            }
        }
    }
}
