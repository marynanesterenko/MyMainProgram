package com.java.class09_Oct05_NesteredIfElse;

import java.util.Scanner;

public class FindGreatestNumberUsingThree {
    public static void main(String[] args) {
        /*
        num1 > num2 > num3
        num2 > num1 > num3
        num3 > num1 > num2
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter a second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter a second number: ");
        int num3 = sc.nextInt();

        if (num1 > num2)
            if ( num1 > num3){
                System.out.println(num1 + " is the greatest!");
            } else {
                System.out.println(num3 + " is the greatest!");
        } else {
                if ( num2 > num3) {
                System.out.println(num2 + " is the greatest!");
                } else {
                    System.out.println(num3 + " is the greatest!");
                }
        } if (num1 == num2) {

        }

    }
}
