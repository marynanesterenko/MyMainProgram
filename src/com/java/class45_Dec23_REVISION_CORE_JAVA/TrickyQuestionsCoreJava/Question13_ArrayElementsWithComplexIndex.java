package com.java.class45_Dec23_REVISION_CORE_JAVA.TrickyQuestionsCoreJava;
/*
Q: What would be the output?
A:  2
    2
    0
    0
    0
    3
 */
public class Question13_ArrayElementsWithComplexIndex {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 2, 0, 3};

        // we need to find the updated values of the array
        // here we are not printing anything out, but we are updating the values of the array a
        for (int i = 0; i < a.length; i++){
            a[i] = a[a[i] + 2] % a.length;
        }

        // and here we are printing out the contents of the array a
        for (int i : a) {
            System.out.println(i);
        }
    }
}
