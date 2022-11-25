package com.java.class20_Nov01_StringPractice;

import java.util.Scanner;

public class Homework_PrintFirstLetterOfFirstLastName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first and last name: ");
        String str = sc.nextLine();

        char firstInitial = str.charAt(0);

        int indexOfSpace = str.indexOf(" ");
        char secondInitial = str.charAt(indexOfSpace + 1);
        System.out.println(firstInitial + "." + secondInitial);

    }
}
