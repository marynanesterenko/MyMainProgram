package com.java.class24_Nov09_ArraysPractice;

public class HomeworkTask3_FindUniqueDuplicates {
    public static void main(String[] args) {

        int[] nums = new int[]{5, 2, 8, 7, 3, 6}; // length - 6, indices are - 0, 1, 2, 3, 4, 5

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] > nums[j]) {

                    int placeholder = nums[i];
                    nums[i] = nums[j];
                    nums[j] = placeholder;
                }
            }
        }
        /*
        here we are using "for each" loop (aka enhanced for loop)
        inside the parentheses we have:
        int - as a data type of the array "nums"
        num - each element of the array
         */
        for (int num : nums) {
            System.out.print(num + " ");

        }
    }
}
