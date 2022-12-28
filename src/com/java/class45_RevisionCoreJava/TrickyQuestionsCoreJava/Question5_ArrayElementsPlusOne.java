package com.java.class45_RevisionCoreJava.TrickyQuestionsCoreJava;
/*
Q: What would be the output?
A: ArrayIndexOutOfBoundsException
 */
public class Question5_ArrayElementsPlusOne {
    public static void main(String[] args) {
        int[] nums = {34, 65, 26, 23, 16, 23};

        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i + 1];
        }

        for (int num : nums){
            System.out.println(num);
        }
    }
}
