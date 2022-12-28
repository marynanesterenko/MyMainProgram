package com.java.class42_Dec19_SetANDMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPracticalExample {
    public static void main(String[] args) {
        List<String> listOfData = new ArrayList<>();

        listOfData.add("Banana");
        listOfData.add("Apple");
        listOfData.add("Potato");
        listOfData.add("Tomato");
        listOfData.add("Banana");
        listOfData.add("Apple");
        listOfData.add("Orange");
        listOfData.add("Cucumber");
        listOfData.add("Mango");

        System.out.println(listOfData);

        // creating an Object "uniqueItem" of the type Set
        Set<String> uniqueItem = new HashSet<>();
        uniqueItem.addAll(listOfData);
        System.out.println(uniqueItem);

        Set<String> duplicates = new HashSet<>();
        for (String element : listOfData){
            if (duplicates.add(element) == false){
                System.out.println(element);
            }
        }
    }
}
