package com.java.class04_Sept26;

public class HomeworkTask2_Sept26 {
    public static void main(String[] args) {
        // Task: write a program to take one number and print whether it is divisible by 5 or not

        int num1 = 2;

        if (num1%5 == 0){
            System.out.println("The number " + num1 + " is divisible by 5");
        } else if (num1%5 != 0) {
            System.out.println("The number " + num1 + " is not divisible by 5");
        }
    }
}
