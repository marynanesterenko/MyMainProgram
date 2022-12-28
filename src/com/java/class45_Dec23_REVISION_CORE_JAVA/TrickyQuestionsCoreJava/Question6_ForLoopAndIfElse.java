package com.java.class45_Dec23_REVISION_CORE_JAVA.TrickyQuestionsCoreJava;
/*
Q: What would be the output?
A: 9
 */
public class Question6_ForLoopAndIfElse {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 1 || i % 5 == 0){
                i = i + 3;
            } else {
                System.out.println(i);
            }
        }
    }
}
