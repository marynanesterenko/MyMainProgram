package com.java.class05;

public class HomeworkTask1Sept27 {
    public static void main(String[] args) {
        // Task: what would be the output of each statement of below program?

        String str1 = "Hello", str2 = "Java";
        int i = 10, j = 20;

        System.out.println(i + j);              // Statement_1: 30
        System.out.println("i + j");            // Statement_2: i + j
        System.out.println(str1 + j);           // Statement_3: Hello20
        System.out.println(str1 + i + j);       // Statement_4: Hello1020
        System.out.println(i + j + str1);       // Statement_5: 30Hello
        System.out.println(str1 + i * j);       // Statement_6: Hello200

        // System.out.println(str1 + i - j); -> this Statement_7 will throw an error - java: bad operand types for binary operator '-'

        System.out.println(str1 + i + j + str2); //Statement_8: Hello1020Java
    }
}
