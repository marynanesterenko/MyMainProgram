//    package com.java.JavaTrickyQuestions;
///*
//    1. Will this code compile? -> No, the code wont compile
//    2. If yes, what would be the output?
//
//    java: method sum(int,int) is already defined in class com.java.JavaTrickyQuestions.Q1_WillTheCodeCompile
// */
//public class Q1_WillTheCodeCompile {
//    // duplicate methods
//    // the only way to fix this is to either change the number of parameters or change the type of parameters
//    public void sum(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    public int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static void main(String[] args) {
//        // main method is always the starting point of the application
//
//        Q1_WillTheCodeCompile q1 = Q1_WillTheCodeCompile(); // we are missing the "new" keyword here, so the Object won't get created
//
//        q1.sum(10, 20); // here Java will get confused, which method to call, we cannot have two methods with the same name
//
//        System.out.println(q1.sum(10, 20));
//    }
//}
