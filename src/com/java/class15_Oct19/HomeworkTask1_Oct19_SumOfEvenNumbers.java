package com.java.class15_Oct19;

public class HomeworkTask1_Oct19_SumOfEvenNumbers {
    public static void main(String[] args) {
// 1. Java program to print the sum of even numbers from 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            };
        }
        System.out.println(sum);
    }
}
