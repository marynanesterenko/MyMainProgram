package com.java.class45_RevisionCoreJava.TrickyQuestionsCoreJava;
/*
Q: What would be the output?
A: 20
 */
public class Question8_ForLoopWithTheBreak {
    public static void main(String[] args) {

        for (int i = 10; i >= 1; i++){
            System.out.println(i * 2);
            break;
        }
    }
}
