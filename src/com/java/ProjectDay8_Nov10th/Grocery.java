package com.java.ProjectDay8_Nov10th;

import java.util.Arrays;
import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        /**
         * Write a program for a shopping
         * Create a list to go shopping in the grocery
         *
         * ex:
         * How many items do you want to add?
         * 3
         * Please enter item #1
         * watermelon
         * Please enter item #2
         * grapes
         * Please enter item #3
         * yogurt
         * Shopping list: [watermelon, grapes, yogurt]
         */

        Scanner scanner = new Scanner(System.in);
        //TODO WRITE YOUR CODE HERE
        createList(scanner);

    }

    public static String[] createList(Scanner scanner) {
        // TODO IMPLEMENT THIS METHOD
        System.out.println("How many items do you want to add?");
        int itemNumber = scanner.nextInt();
        String[] items = new String[itemNumber];
        for (int a = 0; a < items.length; a++) {
            System.out.println("please enter item #" + (a + 1));
            String itemName = scanner.next();
            items[a] = itemName;

        }
        System.out.println("Shopping list: " + Arrays.toString(items));
        return items;
    }
}
