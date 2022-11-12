package com.java.class23_Nov08;
import java.util.Arrays;
/*
3. Program to sort the elements of an array in ascending order (Tricky, do enough brainstorming before solving)
Example
Input : 5, 2, 8, 7, 3, 6
Output : Duplicate numbers - 2, 3, 5, 6, 7, 8
 */
public class HomeworkTask3_SortArrayElementsAsc {
    public static void main(String[] args) {
        // declaring and initializing the "nums" array
        int[] nums = new int[]{5, 2, 8, 7, 3, 6}; // length - 6, indices are - 0, 1, 2, 3, 4, 5

        // for loop is visiting each element of the array from index[0] to index[5]
        // and variable "i" remembers the value of each element that we visit
        for (int i = 0; i < nums.length - 1; i++) {

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
                /*
                as we are looping through j, which is every next number after i,
                and we are comparing the value of the element at the index[j] to the
                value of the element at the index[i], and if later(which is "i") is bigger than the first one(which is "j"),
                then, j needs to take the place of i
                 */

                if (nums[i] > nums[j]) {
                    // using the variables value re-assignment method
                    int placeholder = nums[i]; // placeholder took the value of nums[i], so now nums[i] is free
                    nums[i] = nums[j]; // nums[i] took the value of j, so now j is free
                    nums[j] = placeholder; // nums [j] took the values that placeholder was keeping for us, which was nums[i]
                }
            }
        }
        /*
        we could also create a variable here, and pass it to "toString" method instead of "nums",
        but intelliJ says it's redundant int [] sortedNums = nums;
         */
        System.out.println("\nSorted array is: " + Arrays.toString(nums));
    }
}
