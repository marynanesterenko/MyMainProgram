package com.java.class14_Oct18_IntroToLoops;

public class HomeworkTask2_Oct18_NumbersDivisibleByThree {
    // 2. Write a program to print numbers from 1 to 20 which are divisible by 3
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            if (i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
