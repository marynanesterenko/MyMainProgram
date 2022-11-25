package com.java.class16_Oct24_NestedForLoop;
import java.util.Scanner;


public class HomeworkTask4_Oct24_FindFactors {
    /*
     4.  Write a program to find factors of the given number
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.println(i);
            }
        }
    }
}

