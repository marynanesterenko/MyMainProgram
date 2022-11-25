package com.java.class17_Oct25_NestereForLoopPractice;

public class Calculator {
    public static void main(String[] args) {
        int i = 1;
        int j = i++ + i;
        System.out.println(j);

        int k = ++i + i;
        System.out.println(k);
    }
}
