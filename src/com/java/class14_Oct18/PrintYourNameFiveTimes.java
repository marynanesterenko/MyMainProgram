package com.java.class14_Oct18;

import java.util.Scanner;

public class PrintYourNameFiveTimes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.next();

        printMyName();
    }

    static void printMyName () {
        String name = "Maryna";
    }
}
