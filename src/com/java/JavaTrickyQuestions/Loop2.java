package com.java.JavaTrickyQuestions;
/*
123 Infinite Times
 */
public class Loop2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 4; j++){
                i = i % j;
                System.out.println(j);
            }
        }
    }
}
