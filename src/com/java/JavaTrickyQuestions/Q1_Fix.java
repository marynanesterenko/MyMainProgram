package com.java.JavaTrickyQuestions;

public class Q1_Fix {
    public void sum(double a, double b) { // changed the data type of the parameter here from int to double
        System.out.println(a + b);
    }
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Q1_Fix q1 = new Q1_Fix(); // added a new keyword here
        q1.sum(10, 20);
        System.out.println(q1.sum(10, 20));
    }
}
