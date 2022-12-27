package com.java.JavaTrickyQuestions;
/*
!! We need to remember that we cannot store the bigger value inside the smaller value
   a = (int)(a + d)
 */
public class Casting {
    public static void main(String[] args) {
        int a = 10;
        double d = a;
        d = d + a;
        // a = a + d; -> this program wouldn't run if we uncomment the line 8
        System.out.println(d);
        System.out.println(d);

    }
}
