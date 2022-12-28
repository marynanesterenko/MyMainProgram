package com.java.class45_Dec23_REVISION_CORE_JAVA.TrickyQuestionsCoreJava;
/*
Q: What would be the output?
A: 0

!! Remember: "do while" loop always executes at least once !!
 */
public class Question15_DoWhileLoopAndDecrement {
    public static void main(String[] args) {
        int i = 1;

        do {
            i--;
        } while (i > 2);
        System.out.println(i);
    }
}
