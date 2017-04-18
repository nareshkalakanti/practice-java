package com.java.collections;

import java.util.*;
import java.util.Map;

public class TreeMapDemo4 {

    public static void main(String[] args) {
        Map<Integer, String> orderedMap = new TreeMap<Integer, String>();
        orderedMap.put(3,"Bob");
        orderedMap.put(1,"Sally");
        orderedMap.put(2,"Tom");
        orderedMap.put(4,"Richard");
        System.out.println("First in the queue is : " + orderedMap.get(1));

        for (Map.Entry<Integer,String> entry:orderedMap.entrySet()) {
            System.out.println("Key is:" +entry.getKey() + "value is:" + entry.getValue());

        }

    }

}
