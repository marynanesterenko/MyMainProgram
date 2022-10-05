package com.java.class07;

import java.util.Scanner;

public class HomeworkTask3_Oct03 {
    /*
    3. Write a program to take marks from the user and print the grade as follows: between 90 and 100 then print A+, between 80 and 89 then print A,
    between 70 and 79 then print B+, between 60 and 69 then print B, between 50 and 59 then print C+, between 40 and 49 then print C, is below 40 then print Fail
     */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your mark: ");
            int mark = sc.nextInt();
            if (mark < 40) {
                System.out.println("Unfortunately, you have failed!");
            } else if (mark >= 40 && mark <= 49) {
                System.out.println("Your grade is C");
            } else if (mark >= 50 && mark <= 59) {
                System.out.println("Your grade is C+");
            } else if (mark >= 60 && mark <= 69) {
                System.out.println("Your grade is B");
            } else if (mark >= 70 && mark <= 79) {
                System.out.println("Your grade is B+");
            } else if (mark >= 80 && mark <= 89) {
                System.out.println("Your grade is A");
            } else if (mark >= 90 && mark <= 100) {
                System.out.println("Your grade is A+");
            } else {
                System.out.println("You have entered an invalid number, therefore, your grade cannot be calculated!");
            }
        }
    }
