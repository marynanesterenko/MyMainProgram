package com.java.class17_Oct25;

public class NestedForLoopAnotherExample {
    /*
    What will this print?
        123
        123
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
