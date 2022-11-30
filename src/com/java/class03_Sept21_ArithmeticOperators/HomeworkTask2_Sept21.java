package com.java.class03_Sept21_ArithmeticOperators;

public class HomeworkTask2_Sept21 {
    public static void main(String[] args) {
        System.out.println("Expression Priority and Associativity: ");

        int num1 = 12 + 8 / 3 + 4 / 2 - 3;
        System.out.println("12 + 8 / 3 + 4 / 2 - 3 = " + num1); //13

        int num2 = 16 * 10 / (1 + 4) / 2 * 3;
        System.out.println("16 * 10 / (1 + 4) / 2 * 3 = " + num2); //48

        int num3 = 2 * 4 * (3 + 4) / (2 * 3);
        System.out.println("2 * 4 * (3 + 4) / (2 * 3) = " + num3); //9

        int num4 = 5 * 2 / 10 + 6 / 6 * 6;
        System.out.println("5 * 2 / 10 + 6 / 6 * 6 = " + num4); //7


    }
}
