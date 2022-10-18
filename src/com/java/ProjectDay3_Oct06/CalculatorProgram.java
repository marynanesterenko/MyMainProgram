package com.java.ProjectDay3_Oct06;

import java.util.Scanner;

public class CalculatorProgram {
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String DIVIDE = "/";
    private static final String MULTIPLY = "*";

    public static void main(String[] args) {

        /**
         *
         * Write a calculator program
         * if there is an invalid operator return result as -1
         *
         * Example output:
         *  Enter your first number:
         *  1
         *   Enter your operator:
         *  /
         *  Enter your second number:
         *  0
         *  Your result is Infinity
         */

        Scanner sc = new Scanner(System.in);

        double number1 = 0;
        double number2 = 0;
        String operator = "";
        double result = 0;

        //TODO implement your code here...

        System.out.println("Please enter your first number: ");
        number1 = sc.nextDouble();

        System.out.println("Please enter the operator: ");
        operator = sc.next();

        System.out.println("Please enter you second number: ");
        number2 = sc.nextDouble();

        if (operator.length() > 1 && !operator.equals(PLUS) && !operator.equals(MULTIPLY) && !operator.equals(MINUS) && !operator.equals(DIVIDE)) {

        } else if (operator.equals(PLUS)) {
            System.out.println("Your result is: " + result);
        } else if (operator.equals(MINUS)) {
            System.out.println("Your result is: " + result);
        } else if (operator.equals(DIVIDE)) {
            System.out.println("Your result is: " + result);
        } else if (operator.equals(MULTIPLY)) {
            System.out.println("Your result is: " + result);
        } else {
            System.out.println("Program doesn't support this symbol!");
        }
    }

}
