package com.java.class22_Nov07_IntroToArrays;
/*
  2. Write a program to find the greatest number from an array
Example
Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
Output : Maximum - 75

 */
public class HomeworkTas2_FindTheGreatestFromTheArray {
    public static void main(String[] args) {
        int[] nums = {23, 44, 21, 56, 27, 35, 75, 34, 25};

        int max = 0;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        System.out.println("Maximum number is: " + max);
    }
}
