package com.java.class12_Oct12_IntroToMethods;

import java.util.Scanner;

public class CalculatorSwitchCaseMethods {

    static void addition(int number1, int number2){
        System.out.println(number1 + number2);
    }

    static void subtraction(int number1, int number2){
        System.out.println(number1 - number2);
    }

    static void multiplication(int number1, int number2){
        System.out.println(number1 * number2);
    }

    static void division(int number1, int number2){
        System.out.println(number1 / number2);
    }

    static void modulo(int number1, int number2){
        System.out.println(number1 % number2);
    }

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int number1 = sc.nextInt();

        System.out.println("Please enter the second number: ");
        int number2 = sc.nextInt();

        System.out.println("Please enter the operation you would like to perform: Add, Sub, Mul, Div, Mod");
        String operation = sc.next();

            switch (operation.toLowerCase()) {
            case "Add":
            addition(number1, number2);
                break;

            case "Sub":
            subtraction(number1, number2);
                break;

            case "Mul":
            multiplication(number1, number2);
                break;

            case "Div":
            division(number1, number2);
                break;

            case "Mod":
            modulo(number1, number2);
                break;

            default: {
            System.out.println("You've entered an invalid operation!");

            }
        }
    }
}
