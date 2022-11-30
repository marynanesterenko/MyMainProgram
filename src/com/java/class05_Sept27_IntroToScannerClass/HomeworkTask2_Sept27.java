package com.java.class05_Sept27_IntroToScannerClass;

import java.util.Scanner;

public class HomeworkTask2_Sept27 {
    public static void main(String[] args) {
        // Task: Write a program to take two String from the user using the Scanner class and Swap the values of two variables


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = sc.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = sc.nextLine();

        System.out.println("You entered: " + firstName + " " + lastName);
        String a = firstName;
        String b = lastName;
        String c = a;
        a = b;
        b = a;

        System.out.println("Your swapped name is: " + b + " " + c);

    }
}