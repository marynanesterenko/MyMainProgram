package com.java.class25_Nov14;
/*
Task: write a program to find the length of each word.
Output:
Today - 5
is - 2
Monday, - 7
it - 2
started - 7
well - 4
 */
public class Practice_1 {
    public static void main(String[] args) {
        String str = "Today is Monday, it started well";
        String[] words = str.split(" ");

        for (String word : words){

            System.out.println(word + " - " + word.length());
        }
    }
}
