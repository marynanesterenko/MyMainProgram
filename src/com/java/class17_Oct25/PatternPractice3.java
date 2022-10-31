package com.java.class17_Oct25;

public class PatternPractice3 {
    public static void main(String[] args) {
        /*
            A
           AA
          AAA
         AAAA
        AAAAA

         */
        for (int i = 1; i <= 5; i++){
            // space depends on i
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
