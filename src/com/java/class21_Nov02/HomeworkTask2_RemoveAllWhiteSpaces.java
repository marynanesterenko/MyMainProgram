package com.java.class21_Nov02;
/*
2. Java Program to remove all the white spaces from a string
Example
Input - Today is Saturday
Output - TodayisSaturday
 */
import java.util.Scanner;

public class HomeworkTask2_RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = sc.nextLine();

        String newString = str.replaceAll("\\s+", "");
        System.out.println(newString);
    }
}