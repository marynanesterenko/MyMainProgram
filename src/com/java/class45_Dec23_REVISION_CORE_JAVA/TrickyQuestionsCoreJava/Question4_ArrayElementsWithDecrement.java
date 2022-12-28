package com.java.class45_Dec23_REVISION_CORE_JAVA.TrickyQuestionsCoreJava;
/*
Q: What will be the output?
A: ArrayIndexOutOfBoundsException
 */
public class Question4_ArrayElementsWithDecrement {
    public static void main(String[] args) {
        int[] nums = {34, 65, 26, 23, 16, 23};

        for (int i = nums.length; i > 0; i--){
            System.out.println(nums[i]);
        }
    }
}
