package com.java.class42_Dec19_SetANDMap;

import java.util.HashSet;
import java.util.Set;

public abstract class SelfLearningSet {
    public static void main(String[] args) {

        // let's specify the type of the Generic we are creating here: <Integer>
        Set <Integer> values = new HashSet<>();

        // adding values to the Set (similar to the List)
        // when printed out - the sequence of the numbers will not be adhered to because of the "hash" concept
        // if we would want to store these values in the ascending order, we can use TreeSet instead of HashSet
        values.add(89);
        values.add(25);
        values.add(37);
        values.add(85);
        values.add(36);
        values.add(45);

        for (int i : values){
            System.out.println(i);
        }
    }

}
