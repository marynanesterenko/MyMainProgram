package com.java.class11_Oct11_SwitchStatement;

import java.util.Scanner;

public class CalculatorSwitchStatement {
    /*
    Write a program to design calculator using Switch Statement;
    Example:
    Input: 10, 20, Add
    Output: 30
     */

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
                System.out.println (number1 + number2);
                break;
            case "Sub":
                System.out.println (number1 - number2);
                break;
            case "Mul":
                System.out.println (number1 * number2);
                break;
            case "Div":
                System.out.println (number1 / number2);
                break;
            case "Mod":
                System.out.println(number1 % number2);
                break;

            default: {
                System.out.println("You've entered an invalid operation!");
            }
        }
    }
}
