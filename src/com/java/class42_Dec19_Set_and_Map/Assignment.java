package com.java.class42_Dec19_Set_and_Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
1. Find duplicate items in the given list
 */
public class Assignment {
    public static void main(String[] args) {
        List<String> listOfData = new ArrayList<>();

        // if we need to find the duplicates - we need to iterate through the list
        listOfData.add("Banana");
        listOfData.add("Apple");
        listOfData.add("Potato");
        listOfData.add("Tomato");
        listOfData.add("Banana");
        listOfData.add("Apple");
        listOfData.add("Orange");
        listOfData.add("Cucumber");
        listOfData.add("Mango");
        listOfData.add("Tomato");
        listOfData.add("Apple");
        listOfData.add("Banana");

        System.out.println(listOfData);

        //Set<String> uniqueItem = new HashSet<>();
//        uniqueItem.addAll(listOfData);
//        System.out.println(uniqueItem);

        Set<String> duplicates = new HashSet<>();
        Set<String> uniqueItem = new HashSet<>();
        for (String element : listOfData){
            if (uniqueItem.add(element) == false){
                duplicates.add(element);
            }
        }
        System.out.println("Duplicate items are: " + duplicates);
    }
}
