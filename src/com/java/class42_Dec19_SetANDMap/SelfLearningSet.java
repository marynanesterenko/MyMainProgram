package com.java.class42_Dec19_SetANDMap;

import java.util.HashSet;
import java.util.Set;

public abstract class SelfLearningSet {
    public static void main(String[] args) {

        // let's specify the type of the Generic we are creating here: <Integer>
        Set <Integer> values = new HashSet<>();

        // adding values to the Set (similar to the List)
        values.add(5);
        values.add(6);
        values.add(9);

        for (int i : values){
            System.out.println(i);
        }
    }

}
