package com.java.class18_Oct26;

import java.util.Scanner;
/*
Whenever we have the Task with increment and decrement - we have to divide the shape
 */
public class DiamondShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int s = 1; s <= num - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {

            for ( int s = 1; s <= num - i; s ++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
