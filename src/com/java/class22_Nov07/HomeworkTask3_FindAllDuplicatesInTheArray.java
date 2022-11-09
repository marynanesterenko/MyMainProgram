package com.java.class22_Nov07;
/*
  3. Write a program to find all duplicates number from the array (Tricky, do enough brainstorming before solving)
Example
Input : 23, 44, 21, 23, 27, 35, 75, 44, 25
Output : Duplicate numbers - 23, 44

 */

public class HomeworkTask3_FindAllDuplicatesInTheArray {
    public static void main(String[] args) {
        int[] nums = {23, 44, 21, 23, 27, 35, 75, 44, 25};
        // we need to compare the first number with every next one, that's why inner for loop starts from the i + 1

        // these two for loops are running in parallel
        // when "i" is at index "0" then the inner loop will run and iterate through the numbers starting from the second
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // pointer/starting point; increment;
                if (nums[i] == nums[j]) {
                    int duplicate = nums[j];
                    System.out.println(duplicate);
                }
            }
        }
    }
}