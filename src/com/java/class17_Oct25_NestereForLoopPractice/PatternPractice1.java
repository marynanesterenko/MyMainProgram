package com.java.class17_Oct25_NestereForLoopPractice;

public class PatternPractice1 {
    /*
    AAAAA
    AAAA
    AAA
    AA
    A
     */

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            // in the pattern i + j always equals to 6, so j will always be 6 - i
            // the value of j will always be dependent on i

            for (int j = 1; j <= 6 - i; j++){
                System.out.print("A");
            }
            System.out.println();
        }
    }

    /*
            Approach 2:
            for (int i = 5; i >= 1; i-- ){

                    for (int j = 1; j <= i; j++) {
                        System.out.print("A");
                    }
                        System.out.println();

                }
     */
}
