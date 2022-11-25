package com.java.class18_Oct26_NestedForLoopPractice;

import java.util.Scanner;

public class DiamondUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num/2 + 1; i++){

            for (int s = 1; s <= num - i; s ++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++ ){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = num/2; i >= 1; i--) {

            for ( int s = 1; s < num - i; s ++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
