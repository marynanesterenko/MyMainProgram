package com.java.class10_Oct10_IfElsePractice;

public class HomeworkTask2_Oct10th {
    /*
    2. Write all program by yourself that we did in class using:
    If, ladder if and nested if else & send video of explaining at least one program
     */

    public static void main(String[] args) {
        int i = 10, j = 15, k = 8;

        if (j > k && k <= i) {
            k = j + i;
            System.out.println("The new k is 25");
        } else {
            System.out.println("That's pretty much it!");
        }

        if ( k < j || i > k) {
            System.out.println("Well, that's not true now!");
        } else if ( k > i + j) {
            System.out.println("Ha! That's also not true!");
        } else {
            System.out.println("I think it's time to go to bed now!");
        }
    }
}
