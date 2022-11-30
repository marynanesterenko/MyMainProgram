package com.java.class09_Oct05_NesteredIfElse;

import java.util.Scanner;

public class HomeworkTask2_Oct05 {
    /*
    Task #2: Write a program that reads power consumed in units and print the amount to be paid by the customer.
             Consumption   Rate of Units Charges are as follows
             ------------------------------------------------------
             If unit is 0-200       Rs.0.50 per unit
             If unit is 201-400     Rs.100 plus Rs.0.65 per unit
             If unit is 401-600     Rs.230 plus Rs.0.80 per unit
             -------------------------------------------------------
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the unit number, using the numbers between 0 and 600: ");
        double unit = sc.nextDouble();

        if (unit > 0 && unit <= 200) {
            unit = unit * 0.5;
            System.out.println("Your total bill is: " + String.format("%.2f", unit));
        } else if (unit >= 201 && unit <= 400) {
            unit = unit * 0.65;
            System.out.println("Your total bill is: " + String.format("%.2f", unit));
        } else if (unit >= 401 && unit <= 600) {
            System.out.println("Your total bill is: " + String.format("%.2f", unit));
        } else {
            System.out.println("Seems like you've entered an invalid unit number!");
        }
    }
}
