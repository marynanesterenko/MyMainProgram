package com.java.class20_Nov01_StringPractice;

/*
Write the program to find the frequency of given character inside the string

 */
public class FrequencyOfGivenCharacter {
    public static void main(String[] args) {
        String str = "Hello Maryna! Welcome to DevX!";
        char target = 'e';

        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++){
            if (target == str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
