package com.java.class45_Dec23_REVISION_CORE_JAVA.TrickyQuestionsCoreJava;
/*
Q: What would be the output?
A:  8
    10
    12
    7
 */
public class Question16_TrickyForLoop {
    public static void main(String[] args) {
        int i;

        // if line 15 said: "for (int i = 1; i < 7; i++)",
        // we would have gotten a compilation error,
        // because the variable "i" has already been declared in line 5
        for (i = 1; i < 7; i++) {
            if (i > 3){
                System.out.println(i * 2);
            }
        }
        System.out.println(i);
    }
}
