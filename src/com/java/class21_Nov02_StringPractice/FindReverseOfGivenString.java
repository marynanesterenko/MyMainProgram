package com.java.class21_Nov02_StringPractice;
/*
Write a program to reverse of given String
 */

import java.util.Scanner;

public class FindReverseOfGivenString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String name = sc.nextLine(); // Maryna Nesterenko

        // we need to loop through the string, starting from the end
        for (int i = name.length()-1; i >= 0; i--){
            System.out.print(name.charAt(i));
        }


        // Another approach
        for ( int j = 0; j < name.length(); j++){
            System.out.println(name.charAt(name.length() - 1 - j));
        }
    }
}
