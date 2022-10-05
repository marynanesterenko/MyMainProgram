package com.java.class08;

import java.util.Scanner;

public class HomeworkTask3_Oct04 {
    public static void main(String[] args) {
        /*
        Task#3 - Write a program to print messages based on the rating of the company:
        For Example:
        rating is 5 then print Very Good
        rating is 4 then print Good
        rating is 3 then print Average
        rating is 2 then print Poor
        rating is 1 then print Very Poor
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Please indicate the rating of your company on a scale from 1 to 5: ");
        int rating = sc.nextInt();

        if (rating == 5) {
            System.out.println("Your rating is under category \"Very Good\"");
        } else if (rating == 4) {
            System.out.println("Your rating is under category \"Good\"");
        } else if (rating == 3) {
            System.out.println("Your rating is under category \"Average\"");
        } else if (rating == 2) {
            System.out.println("Your rating is under category \"Poor\"");
        } else if (rating == 1) {
            System.out.println("Your rating is under category \"Very Poor\"");
        } else {
            System.out.println("Such rating does not exist. " +
                    "Please enter a valid number to represent the rating!");
        }
    }
}
