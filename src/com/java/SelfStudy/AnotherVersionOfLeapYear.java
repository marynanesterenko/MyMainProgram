package com.java.SelfStudy;

import java.util.Scanner;

public class AnotherVersionOfLeapYear {
    public static void main(String[] args) {
        // if the number of the year is not divisible by 4, then it is NOT a leap year
        // if the number of the year is  divisible by 4 and not divisible by 100, it is still NOT a leap year
        // if the year is divisible by 4, and divisible by 100, and it is divisible by 400 - it is a leap year
        System.out.println("Please, print out the year: ");
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        //This is an outer
        if (year%4==0) {
            //this is the first inner
            if (year%100==0){
                //this is the second inner
                if (year%400==0) {
                    System.out.println("24It is a leap year");
                }else { // outer else for the second inner
                    System.out.println("26It is not a leap year");
                }
            }else { // first inner else
                System.out.println("29It is a leap year");}
        }else { // outer else for the first inner
            System.out.println("31It is not a leap year");

        }
    }
}

