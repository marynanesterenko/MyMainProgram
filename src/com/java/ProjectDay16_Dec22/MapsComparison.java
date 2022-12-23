package com.java.ProjectDay16_Dec22;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsComparison {
    public static void main(String[] args) {
        /**
         * Verify map has same values as another map ignoring null values
         */

        Map<String, String> values = new HashMap<>();
        values.put("1", "HeyHey");
        values.put("0", null);
        values.put("23", "NoNo");
        values.put("2", null);
        values.put("4", "AhAhAhA");

        Map<String, String> values2 = new HashMap<>();
        values2.put("1", "HeyHey");
        values2.put("0", "null");
        values2.put("23", "NoNo");
        values2.put("2", "empty");
        values2.put("4", "AhAhAhA");

        MapsComparison mapsComparison = new MapsComparison();

        System.out.println(mapsComparison.equalsIgnoringNullValues(values, values2));
    }

    public boolean equalsIgnoringNullValues(Map map1, Map map2) {
        //TODO implement this method

        if(map1.size() == map2.size()){

            Set<String> keys = map1.keySet();

            for(String key : keys){

                // here "get methods" will retrieve correspondent value of the specified key
                if(map1.get(key) != null){
                    return map1.get(key) == map2.get(key);
                }
            }
        }
        return false;
    }
}
