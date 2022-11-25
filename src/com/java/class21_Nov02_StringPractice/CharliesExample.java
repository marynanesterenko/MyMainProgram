package com.java.class21_Nov02_StringPractice;

import java.util.Scanner;

public class CharliesExample {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your full name: ");
            String name = sc.nextLine(); // Maryna Nesterenko

            int charCounter = 0;
            if (name.isEmpty()){
                System.out.println("This string is empty, it is 0 characters long.");
            } else {
                while (!name.isEmpty()) {
                    name = name.substring(1);
                    charCounter++;
                }
                System.out.println("This string is " + charCounter + " characters long.");
            }
    }
}
