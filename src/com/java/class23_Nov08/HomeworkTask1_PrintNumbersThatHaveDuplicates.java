package com.java.class23_Nov08;
import java.util.Arrays;
/*
2. Write a program to find all duplicates number from the array (Implement this program to get unique numbers in the output)
Example
Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
Output : Duplicate numbers - 23, 44, 35
 */
public class HomeworkTask1_PrintNumbersThatHaveDuplicates {
    public static void main(String[] args) {

        // declaring and initializing the "nums" array
        // length - 11, indices are - 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        int[] nums = new int[]{23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};

        // for loop "i" is visiting each element of the array from index[0] to index[10]
        // and variable "i" remembers the value of each element that we visit, and goes into "j's" for loop
        for (int i = 0; i < nums.length - 1; i++) {

            // introducing a variable that will be the "count-keeper" for the number of duplicates we find
            int countNumOfDuplicates = 0;

            // for loop "j" is visiting every next element starting from index[1]
            /* Relationship between i and j:
              i | j
              0 | 1
              1 | 2
              2 | 3
              3 | 4
              4 | 5
              5 | 6
             */
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    countNumOfDuplicates++;
                }
            }
            /*
            if we found at least one duplicate, then -
            we are just going to print the value of the element, at the index of which we found that duplicate
             */
            if (countNumOfDuplicates == 1) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}