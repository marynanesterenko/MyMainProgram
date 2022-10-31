package com.java.class18_Oct26;

public class HomeworkTask1_PrintPrimeNumbersFrom1To100 {
    /*
    Task 1. Write a program to print all the prime numbers from 1 to 100
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime (int num) {
        int count = 0;

        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                count++; // here we have fond the factors
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}
