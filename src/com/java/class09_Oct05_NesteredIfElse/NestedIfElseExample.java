package com.java.class09_Oct05_NesteredIfElse;
/* Get salary and age from the user:
    1. age < 18, then "You're not eligible"
    2. age >= 18 && salary < 5000, then "Sorry, you need to work harder to get credit card"
    3. age >= 18 && salary >= 5000, then "You are eligible"
    4. age >= 18 && salary >= 20000, then "You will get free credit card"
 */


import java.util.Scanner;

public class NestedIfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("What is you salary? ");
        int salary = sc.nextInt();

        if (age >= 18) {
            if (salary < 5000) {
                System.out.println("You are eligible");
            } else if (salary > 5000){
                System.out.println("Sorry, you need to work harder to get credit card");
            } else if (salary >= 20000) {
                System.out.println("You will get free credit card");
            }
        } else {
            System.out.println("You're not eligible");
        }

    }
}
