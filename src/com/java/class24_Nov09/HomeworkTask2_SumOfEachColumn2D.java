package com.java.class24_Nov09;
/*
2. Write a program to print the sum of each COLUMN from a 2D array
Example
Array:
        {23, 44, 21},
        {45, 42, 31},
        {73, 14, 0 }
 */
public class HomeworkTask2_SumOfEachColumn2D {
    public static void main(String[] args) {

        int info[][] = {
                            {23, 44, 21},
                            {45, 42, 31},
                            {73, 14, 0 }
                                            };


        for (int i = 0; i < info.length; i++) {

            int sum = 0;

            for (int j = 0; j < info[i].length; j++){
                sum = sum + info[j][i];
            }

            System.out.println(sum);
        }
    }
}

