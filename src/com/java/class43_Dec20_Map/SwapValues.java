package com.java.class43_Dec20_Map;

import java.util.HashMap;
import java.util.Map;

public class SwapValues {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "candy");
        map.put("b", "carrot");
        map.put("c", "meh");

        SwapValues obj = new SwapValues();
        System.out.println(obj.mapBully(map));
    }

    public Map<String, String> mapBully(Map<String, String> map) {

        if (map.containsKey("a")){
            map.put("b", map.get("a"));
            map.put("a", "");
        }

        return map;
    }
}
