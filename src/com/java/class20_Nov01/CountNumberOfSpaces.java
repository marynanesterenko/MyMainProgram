package com.java.class20_Nov01;

public class CountNumberOfSpaces {
    public static void main(String[] args) {
        String str = "Hello User, How are you?";
        System.out.println(getNumberOfSpaces(str));

    }

    public static int getNumberOfSpaces (String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
