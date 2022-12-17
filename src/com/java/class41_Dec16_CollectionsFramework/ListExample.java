package com.java.class41_Dec16_CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<Integer>();

        Integer element = 10;

        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);

        listOfData.remove(element);
        listOfData.remove(2);

        System.out.println(listOfData);
        System.out.println(listOfData.size());
    }
}
