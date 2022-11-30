package com.java.class15_Oct19_DoWhileLoop;

public class HomeworkTask3_Oct19_PrintTheSum {
    // 3. Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10
    // Pattern: the division only happens when the number is divisible by 3 (3, 6, and 9)
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) { // here we are technically stopping and checking whether we need to perform a subtraction
                sum = sum - i;
            } else {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
