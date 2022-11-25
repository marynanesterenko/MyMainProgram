package com.java.class23_Nov08_ForEachArrays;
// Write the program to print the sum of each row

public class SumOfElementRowwise {
    public static void main(String[] args) {

        int info[][] = {
                            {23, 44, 21},
                            {45, 42, 31},
                            {73, 14, 0 },
                                            };
        int sumOfElements = 0;
        for (int i = 0; i < info.length; i++) {

            for (int j = 0; j < info[i].length; j++) {

                sumOfElements = sumOfElements + info[i][j];
            }
            System.out.print(sumOfElements);
            System.out.println();
        }
    }
}
