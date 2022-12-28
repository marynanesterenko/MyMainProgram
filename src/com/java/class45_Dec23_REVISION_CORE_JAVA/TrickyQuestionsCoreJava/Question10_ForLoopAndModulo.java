package com.java.class45_Dec23_REVISION_CORE_JAVA.TrickyQuestionsCoreJava;
/*
Q: What would be the output?
A: 10 zeroes
 */
public class Question10_ForLoopAndModulo {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++){
            System.out.println(i % i);
        }
    }
}
