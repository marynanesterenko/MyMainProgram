package com.java.class45_RevisionCoreJava.TrickyQuestionsCoreJava;
/*
Q: What would be the output?
A:  2 4
    3
    4
    5
 */
public class Question7_NestedForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 3; j++){
                j = j + i;
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
