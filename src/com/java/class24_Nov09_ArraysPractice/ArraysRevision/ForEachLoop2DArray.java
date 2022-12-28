package com.java.class24_Nov09_ArraysPractice.ArraysRevision;
/*
INTERVIEW QUESTION:
Task: print the two-dimensional array using "for-each" loop?
 */
public class ForEachLoop2DArray {
    public static void main(String[] args) {
        int info[][] = {
                            {23, 44, 21},
                            {45, 42, 31},
                            {73, 14, 0 }
                                            };
        // in order to solve this Task, we need to use the nested "for each" loop
        for (int[] row : info) {
            for (int num : row) {

                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
