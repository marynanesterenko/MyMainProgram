package com.java.JavaTrickyQuestions;
/*
We need to find the updated values of the array
 */
public class Array {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 2, 0, 3};

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
