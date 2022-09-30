package com.java.class05;

import java.util.Scanner;

public class HomeworkTask2Sept27 {
    public static void main(String[] args) {
        // Task: Write a program to take two String from the user using the Scanner class and Swap the values of two variables


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("You entered " + firstName + " " + lastName + ". Is this correct? Please say \"Yes\" or \"No\": ");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("Yes")) {
            System.out.println("Thank you! And this is how your name will display if we swap the your first and last name places: ");
            // here I want to write a method, so that the program will swap the first and last name places and
            // prints out the outcome to console.
        } else {
            // here, how do I make it go back to the beginning and sort of run through the loop of asking the first and ast name again?..
        }
    }
}