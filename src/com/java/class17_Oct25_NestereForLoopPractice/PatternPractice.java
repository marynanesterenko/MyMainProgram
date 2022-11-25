package com.java.class17_Oct25_NestereForLoopPractice;

public class PatternPractice {
    /*
    A
    AA
    AAA
    AAAA
    AAAAA
     */
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){ // this is because we have 5 lines in the task
            for (int j = 1; j <= i; j++){
                // each time we need to print A that is equals to the value of i on th first iteration
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
