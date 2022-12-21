package com.java.class42_Dec19_SetANDMap;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> setOfData = new HashSet<>();

        setOfData.add(50);
        setOfData.add(20);
        setOfData.add(45);
        setOfData.add(10);

        System.out.println(setOfData);

        for (int num : setOfData){
            System.out.println(num);
        }
    }
}
