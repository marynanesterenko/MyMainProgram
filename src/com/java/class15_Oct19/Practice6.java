package com.java.class15_Oct19;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {System.out.println("Please enter a first number: ");
            int num1 = sc.nextInt();

            System.out.println("Please enter a second number: ");
            int num2 = sc.nextInt();

            System.out.println("Please choose your operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Use Operation from 1 to 4");
            }

            System.out.println("Do you want to try one more time? Yes / No: ");
            choice = sc.nextInt();

        } while (choice == 1);

    }
}
