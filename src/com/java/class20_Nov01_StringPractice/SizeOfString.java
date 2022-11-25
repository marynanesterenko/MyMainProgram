package com.java.class20_Nov01_StringPractice;
/*
Write a program to take the String from the User
Count the number of spaces from the String
Print: string is small if number of spaces is less than 5
       string is medium is number of spaces is greater than or equals to 5
       string is large if number of spaces is greater than 10
 */
import java.util.Scanner;

public class SizeOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String input = sc.nextLine();

        SizeOfString size = new SizeOfString();
        int numberOfSpaces = size.getNumberOfSpaces(input);

        if (numberOfSpaces > 10){
            System.out.println("This is a large String");
        } else if (numberOfSpaces >= 5){
            System.out.println("This is a medium string");
        } else {
            System.out.println("This is a small string");
        }
    }
        public int getNumberOfSpaces (String str){

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            return count;
        }
    }

