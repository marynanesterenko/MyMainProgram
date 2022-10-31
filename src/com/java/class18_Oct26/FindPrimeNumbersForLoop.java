package com.java.class18_Oct26;

import java.util.Scanner;

public class FindPrimeNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i > 0; i++){
            if (num % i == 0){
                count++; // here we have fond the factors
            }
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
