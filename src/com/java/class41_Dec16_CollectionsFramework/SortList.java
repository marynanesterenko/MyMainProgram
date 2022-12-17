package com.java.class41_Dec16_CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

        List<Integer> listOfData = new ArrayList<Integer>();

        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);

        int min = listOfData.get(0);
        int minIndex = 0;
        for (int i = 0; i < listOfData.size(); i++){
            for(int j = 0; i < listOfData.size(); j++){
                min = listOfData.get(j);
                if(listOfData.get(j) < min){
                    min = listOfData.get(j);
                    minIndex = j;
                }
            }
            int temp = listOfData.get(i);
            listOfData.set(i, min);
            listOfData.set(minIndex, temp);

        }
    }
}
