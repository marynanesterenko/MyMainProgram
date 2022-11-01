package com.java.class19_Oct31;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        // 1. Change Case Of String
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        // 2. Equality of String
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // false

        // 3. Equals ignoring case
        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true

        // 4. Contains
        String str4 = "Hello Chirag, Welcome to Ebay";
        System.out.println(str4.contains(str1)); // true
        System.out.println(str4.toLowerCase().contains(str3.toLowerCase())); // false

        // 5. Character at Particular Index
        System.out.println(str4.charAt(15));// e

        // 6. Index of Particular character
        System.out.println(str4.indexOf('c'));// 17
    }
}

