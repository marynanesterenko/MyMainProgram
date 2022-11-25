package com.java.class16_Oct24_NestedForLoop;

import java.util.Scanner;

public class FindMaxDigitOfGivenNumber {
    /*
    Write a program to print the greatest digit from the given number.
    Example:
    Input - 3697854
    Output - 7
     */
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            int max = 0;

            while (num != 0) {
                int lastDigit = num % 10;
                if (lastDigit > max) {
                    max = lastDigit;
                }
                num = num / 10;
            }
            System.out.println(max);
        }
    }

