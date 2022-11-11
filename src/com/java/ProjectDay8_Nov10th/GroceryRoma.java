package com.java.ProjectDay8_Nov10th;

import java.util.Scanner;

public class GroceryRoma {

    public static String[] createList(Scanner scanner) {
        // TODO IMPLEMENT THIS METHOD
        System.out.println("How many items do you want to add?");
        int itemsCount = scanner.nextInt();
        String[] tempArray = new String[itemsCount];

        for (int i = 0; i < itemsCount; i++) {
            System.out.println("Please enter item #" + (i+1));
            tempArray[i] = scanner.next();
        }
        return tempArray;
    }

}