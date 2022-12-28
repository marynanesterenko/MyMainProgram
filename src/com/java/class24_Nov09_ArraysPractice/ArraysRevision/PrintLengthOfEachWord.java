package com.java.class24_Nov09_ArraysPractice.ArraysRevision;
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
public class PrintLengthOfEachWord {
    public static void main(String[] args) {
        String str = "Today is Monday, it started well";
        String[] words = str.split(" ");

        for (String word : words){

            System.out.println(word + " - " + word.length());
        }
    }
}
