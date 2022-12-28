package com.java.JavaTrickyQuestions;
/*
Q: What would be the output?
A: 
do while loop always executes at least once
 */
public class Decrement {
    public static void main(String[] args) {
        int i = 1;

        do {
            i--;
        } while (i > 2);
        System.out.println(i);
    }
}
