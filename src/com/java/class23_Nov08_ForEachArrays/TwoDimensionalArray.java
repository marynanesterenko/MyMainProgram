package com.java.class23_Nov08_ForEachArrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // declaration of the two-dimensional array
        int data [][];

        // declaration and init of 2D array ate the same time
        int nums [][] = new int[3][3];

        int info [][] = {{23, 44, 21}, {45, 75, 101}, {80, 90, 25} };

        // find number of rows in the array
        System.out.println(nums.length);

        // find the number of columns in a row
        System.out.println(nums[0].length);

        // print data at particular index
        System.out.println(nums[1][1]);

        // print dara from 2D array using index based for loop
        for (int i = 0; i < info.length; i++){
            for (int j = 0; j <info[i].length; j++){
                System.out.print(info[i][j]  + " ");
            }

            System.out.println();
        }


    }

}
