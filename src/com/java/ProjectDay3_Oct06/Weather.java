package com.java.ProjectDay3_Oct06;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        /**
         *
         * Write Java program to allow the user to input weather and temperature outside.
         * Then the program will show if person needs to take umbrella, coat, sunglasses, or combination of items.
         * Umbrella to take if weather is snowy or rainy and temperature is more than 50 inclusively
         * Sunglasses to take if it's sunny and temperature more is than 50 inclusively
         * If it's colder than 50 Fahrenheit, and the weather is either snowy or rainy, person will take both umbrella and coat
         * Person will take only coat if its sunny, but temperature less than 50
         *
         *
         * example output:
         * Enter weather outside(rainy, snowy, sunny):
         * sunny
         * Enter temperature outside:
         * 60
         *
         * Please take sunglasses, thanks
         *
         * example output:
         *
         * Enter weather outside(rainy, snowy, sunny):
         * snowy
         * Enter temperature outside:
         * 40
         *
         * Please take umbrella and coat, thanks!
         *
         */


        Scanner scanner;
        String weather = "";
        double temperature = 32;
        String thingsToTake = "";


        //TODO implement your code here...
        scanner = new Scanner(System.in);

        System.out.println("Please enter the weather outside: ");
        weather = scanner.next();

        System.out.println("Please enter the ");


        System.out.println("Please take " + thingsToTake + ", thanks!");
    }
}
