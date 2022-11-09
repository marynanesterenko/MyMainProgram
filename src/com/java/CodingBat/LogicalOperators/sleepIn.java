package com.java.CodingBat.LogicalOperators;
/*
The parameter weekday is true if it is a weekday,
and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday, or we're on vacation.
Return true if we sleep in.
 */
import java.util.Scanner;

public class sleepIn {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Is it a weekday? Please enter \"true\" or \"false\": ");
//        String input = sc.nextLine();
//
//        boolean weekday = false;
//        boolean vacation = true;
//
//        if (input.equalsIgnoreCase("true")){
//            boolean weekday = true;
//        } else {
//            boolean vacation = false;
//        }
//        sleepIn();
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
}
