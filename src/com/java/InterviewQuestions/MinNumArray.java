package com.java.InterviewQuestions;
/*
Task: create an array of random numbers and write the code to find the min number in that array.
 */
public class MinNumArray {
    public static void main(String[] args) {
        // first, lets create an array:
        int[] num = {1, 2, 3, 4567, 6, 1, 455678, 0, 5};

        // second, lets create a variable, and initialize it with the first element of the array
        int min = num[0];

        // third, lets loop through an array using the regular for loop (we can also use an enhanced for loop here)
        for (int i = 0; i < num.length; i++){
            // let's set a condition for each iteration:
            if (num[i] <= min){
                min = num[i];
            }
        }
        System.out.println("The minimum number in an array is: " + min);
    }
}
