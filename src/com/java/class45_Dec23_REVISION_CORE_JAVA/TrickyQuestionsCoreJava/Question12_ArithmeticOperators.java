package com.java.class45_Dec23_REVISION_CORE_JAVA.TrickyQuestionsCoreJava;
/*
Q; What would be the output?
A: 41
 */
public class Question12_ArithmeticOperators {
    public static void main(String[] args) {
        int a = 35, b = 9, c = 3;
        int result = a + b % c * a / b + c + b / c;
        System.out.println(result);
    }
}
