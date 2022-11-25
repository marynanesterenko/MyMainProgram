package com.java.class24_Nov09_ArraysPractice;
/*

1. Write a program to find all duplicates number from the array.
(Implement this program to get unique numbers in the output)
        Example
        Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
        Output : Duplicate numbers - 23, 44, 35
 */

public class HomeworkTask1_FindUniqueDuplicates {
    public static void main(String[] args) {
        int [] nums = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};

        for (int i = 0; i < nums.length - 1; i++) {

            int countNumOfDuplicates = 0;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    countNumOfDuplicates++;
                }
            }

            if (countNumOfDuplicates == 1) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
