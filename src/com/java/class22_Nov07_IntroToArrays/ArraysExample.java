package com.java.class22_Nov07_IntroToArrays;
/*
Arrays - container to hold more than one value of the SAME data type.
 */
public class ArraysExample {
    public static void main(String[] args) {
        String fruit1, fruit2; // if we have 20 fruits?..

        int marksStudent1, marksStudent2, marksStudent3; // but what if we have 100 students?

        int [] data; // Question13_ArrayElementsWithComplexIndex declaration,; normally it is placed after the variable name

        // when we declare the array, it will NOT initialize the size in memory
        // whenever we want to store multiple values inside the var - it will not reserve any memory until we initialize the variable
        // meaning assign some value to it

        data = new int[5];

        // declaration and initialization in the same line
        int [] salary = new int [100];

        // declaration, initialization and assignment
        int [] nums = {10, 20, 30, 34, 45, 23, 45, 23, 12, 65, 23}; // most likely we will be using this most of the time

        // length of the array
        System.out.println(nums.length);

        // print the value in particular index
        System.out.println(nums[4]);

        // print all the data from the array
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(nums[5]);
        System.out.println(nums[6]);
        System.out.println(nums[7]);
        System.out.println(nums[8]);
        System.out.println(nums[9]);
        System.out.println(nums[10]);

        System.out.println("====== Print all data from array =======");
        for ( int i = 0; i < nums.length; i++){
            System.out.println(i);
        }

        // print default value of element of array
        // default value for int = 0, for String - null
        System.out.println(salary[45]); //0

        // print
        System.out.println(nums[21]);

    }
}
