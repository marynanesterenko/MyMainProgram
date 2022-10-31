package com.java.class18_Oct26;
/*
        1        i 1 2 3 4 5       j = i * 2 - 1
       123       j 1 3 5 7 9
      12345
     1234567     i 1 2 3 4 5
    123456789    s 4 3 2 1 0
                 s = 5 - i
 */

public class HomeworkTask3_Pattern3 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int space = 1; space <= 5 - row; space++){
                System.out.print(" ");
            }

            for (int column = 1; column <= row * 2 - 1; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
