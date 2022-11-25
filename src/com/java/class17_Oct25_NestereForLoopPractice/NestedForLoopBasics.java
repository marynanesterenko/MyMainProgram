package com.java.class17_Oct25_NestereForLoopPractice;

public class NestedForLoopBasics {
    public static void main(String[] args) {
        /*
        How many times the nested for loop will print? - 9
         */
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 3; j++){
                System.out.println("Hello!"); // 9 times
            }
        }

        /*

        for (int i = 1; i <= 3; i++){
                System.out.println("Hello!");
            for (int j = 1; j <= 3; j++){
                System.out.println("Hello!"); // 15 times
            }
            System.out.println("Hello!");
        }
         */

    }
}
