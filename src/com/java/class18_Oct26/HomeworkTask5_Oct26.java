package com.java.class18_Oct26;

import java.util.Scanner;

public class HomeworkTask5_Oct26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num/2 + 1; i++){
            for (int s = 1; s <= num - i; s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i % 2 != 0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        for (int i = num/2; i >= 1; i--){
            for (int s = 1; s <= num - i; s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (i % 2 != 0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
