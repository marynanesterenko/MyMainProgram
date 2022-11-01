package com.java.CodingBat;

public class BackAround {
    /*
    Given a string, take the last char and return a new string with the last char added at the front and back,
    so "cat" yields "tcatt". The original string will be length 1 or more.
     */
    public static void main(String[] args) {
        System.out.println(addLastLetter("cat"));
    }

    public static String addLastLetter(String str) {

        // first, we need to find the last letter of the string
        // declare a new String variable and assign a value to it
        // the value of the last character we can find using the substring method of the Class String
        // by subtracting 1 from the length of the given String

        String lastChar = str.substring(str.length() - 1);

        return lastChar + str + lastChar;
    }
}
