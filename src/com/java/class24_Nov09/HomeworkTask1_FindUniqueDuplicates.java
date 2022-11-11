package com.java.class24_Nov09;
/*

3. Program to sort the elements of an array in ascending order (Same from the previous homework)
   Example
   Input : 5, 2, 8, 7, 3, 6
   Output : Duplicate numbers - 2, 3, 5, 6, 7, 8

 */
public class HomeworkTask1_FindUniqueDuplicates {
    public static void main(String[] args) {

        int [] nums = {5, 2, 8, 7, 3, 6};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] < nums[i]){
                    int placeholder = nums[i];
                    nums[i] = nums[j];
                    nums[j] = placeholder;
                }
            }
        }

        for (int num : nums){
            System.out.print(num + " ");

        }
    }

}
