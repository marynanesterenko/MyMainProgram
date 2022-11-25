package com.java.class16_Oct24_NestedForLoop;
import java.util.Scanner;

public class HomeworkTask1_Oct24_SumOfEachDigit {
    /*
    Write a program to print sum of each digit from the given number
    */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int input = sc.nextInt();

        int sum = 0;
        while (input != 0){

            int reminder= input % 10;
            sum = sum + reminder;

            input = input / 10;
        }

        System.out.println("The sum of the digits in the number you have entered is: " + sum);
    }
}
