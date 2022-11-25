package com.java.class17_Oct25_NestereForLoopPractice;

public class PatternPractice2 {
    /*
    A
    AA
    AAA
    AAAA
    AAAAA
    AAAA
    AAA
    AA
    A
     */
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("A");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5 - i; j++){
                System.out.print("A");
            }
            System.out.println();
        }
    }
}

