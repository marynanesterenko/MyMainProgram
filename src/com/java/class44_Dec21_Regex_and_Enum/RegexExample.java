package com.java.class44_Dec21_regexANDenum;

public class RegexExample {
    public static void main(String[] args) {
        String str = "HelloWorld";

        // the reason we use "+" sign is because we want to be able to check for any number of characters
        System.out.println(str.matches("^[a-z]+$"));
    }
}
