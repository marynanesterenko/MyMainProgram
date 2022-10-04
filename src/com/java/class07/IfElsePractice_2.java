package com.java.class07;
// Write a program to take age from the User na d print whether they are eligible for DL or not

import java.util.Scanner;

public class IfElsePractice_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name to check if you are eligible to get a Drivers License: ");
        int age = sc.nextInt();

        if (age >= 16) {
            System.out.println("You are eligible!");
        } else if (age == 15){
            System.out.println("You are not eligible for the Drivers Licence yet, but you can get a Learners Permit!");
        } else {
            System.out.println("You are not eligible to get neither Learners Permit, nor the Drivers Licence yet! :(");
        }
    }
}
