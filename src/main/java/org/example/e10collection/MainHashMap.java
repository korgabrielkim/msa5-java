package org.example.e10collection;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>(10);

        hashMap.put("age", 20);
        hashMap.put("height", 170);
        hashMap.put("weight", 60);

        System.out.println(hashMap.get("weight"));

        hashMap.forEach((string, integer)->{
        System.out.println(string + " " + integer);
        });
    }
}
