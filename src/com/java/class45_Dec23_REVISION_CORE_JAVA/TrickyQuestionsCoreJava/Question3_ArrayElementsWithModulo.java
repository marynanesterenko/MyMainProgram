package com.java.class45_RevisionCoreJava.TrickyQuestionsCoreJava;
/*
Q: what would be the output?
A:  34
    65
    26
    34
    65
    26
 */
public class Question3_ArrayElementsWithModulo {
    public static void main(String[] args) {
        int[] nums = {34, 65, 26, 23, 16, 23};

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i % 3]);
        }
    }
}
