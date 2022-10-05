package com.java.class07;

import java.util.Scanner;

public class HomeworkTask1_Oct03 {
    /*
    1. Write a program to print a given number that is positive, negative, or zero
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number and I will evaluate it for you: ");
        double number = sc.nextDouble();

        if (number < 0) {
            System.out.println("The number you've entered is negative.");
        } else if (number == 0) {
            System.out.println("The number you've entered is 0.");
        } else if (number > 0) {
            System.out.println("The number you've entered is positive.");
        }
    }
}
