package com.java.class23_Nov08;

public class ForEachLoop { // it is also called an enhanced for loop
    public static void main(String[] args) {
        int [] data = {23, 44, 21, 23, 23, 35, 35, 44, 35};

        // printing all elements of the array using index based for loop
        for (int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }

        // print all elements of the array using the for each loop
        // three parts: initialization; condition; increment / decrement -> regular for loop
        // for each has 2 parts:

        for ( int num : data ) {
            System.out.println(num);
        }
    }
}
