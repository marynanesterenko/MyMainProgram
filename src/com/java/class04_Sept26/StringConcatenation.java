package com.java.class04_Sept26;

public class StringConcatenation {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "everyone!";
        int num1 = 10;
        int num2 = 20;
        double d = 10.1;

        System.out.println(str1 + str2);        // Concatenation
        System.out.println(str1 + num1);        // Concatenation
        System.out.println(str1 + num1 + num2); // Concatenation
        System.out.println(num1 + num2 + str1); // Add, concatenate
        System.out.println(str1 + (num1 + num2));
        System.out.println(str1 + num1 * num2);
        System.out.println(str1 + num1 + num2 + str2); // Hello, 1020everyone!
        // System.out.println(str1 + num1 - num2);
        System.out.println(num1 + "num2" + str1);

    }
}
