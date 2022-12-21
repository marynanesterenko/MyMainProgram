package com.java.class43_Dec20_Map;
/*
INTERVIEW QUESTION:
 */
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNames {
    public static void main(String[] args) {
        // let's say we have the following string:
        String names = "chirag maria gulnur ali " +
                       "maryna max ali maria max " +
                       "ali chirag yana maggie ali " +
                       "yana maggie ali maryna max";

        // to separate the words - we can use the ".split" method" of String Class by specifying the white space as separator
        String[] arrayOfNames = names.split(" ");
/*
        for (String name : arrayOfNames){
            System.out.println(name);
        }
*/
        // creating an Object "frequency" of the type Map through the HashMap Class
        // Map is an Interface, so for us to create an Object of Map - we have to use the default Constructor of the HashMap subClass
        Map<String, Integer> frequesncy = new HashMap<>();
        for (String name : arrayOfNames){
                if(frequesncy.containsKey(name)){
                    int beginningCount = frequesncy.get(name);
                    frequesncy.put(name, beginningCount + 1);
                } else {
                    frequesncy.put(name, 1);
                }
        }
        System.out.println(frequesncy);
    }


}
