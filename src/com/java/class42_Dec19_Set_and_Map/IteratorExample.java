package com.java.class42_Dec19_SetANDMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();

        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);
        listOfData.add(10);

        System.out.println(listOfData);

        // ways we can print out the contents of the list
        // using index-based "for loop" (this won't work with the Set)
        for (int i = 0; i < listOfData.size(); i++){
            System.out.println(listOfData.get(i));
        }

        // for each loop
        for(int item : listOfData){
            System.out.println(item);
        }


        // using the Iterator
        Iterator<Integer> itr = listOfData.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
