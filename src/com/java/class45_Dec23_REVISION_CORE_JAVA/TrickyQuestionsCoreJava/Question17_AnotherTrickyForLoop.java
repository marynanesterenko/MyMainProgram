package com.java.class45_Dec23_REVISION_CORE_JAVA.TrickyQuestionsCoreJava;
/*
Q: What would be the output?
A: 123 infinite number of times
 */
public class Question17_AnotherTrickyForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 4; j++){
                i = i % j;
                System.out.println(j);
            }
        }
    }
}
