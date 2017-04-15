package com.java.collection;

import java.util.TreeMap;
//Demo for Default Natural Sorting Order
public class TreeMapDemo3 {
    public static void main(String[] args) {
        TreeMap m = new TreeMap();
        m.put(100,"ZZZ");
        m.put(103,"YYY");
        m.put(101,"XXX");
        m.put(104,106);
       // m.put("FFF","XXX"); //CCE (class case exception) i.e Hetegrogenous Keys i.e String Type
       // m.put(null,"XXX"); //NPE TreeMap contains element and compare anything with null NPE we get
        System.out.println(m); //{100=ZZZ, 101=XXX, 103=YYY, 104=106} : Sorting based on key i.e keys homogenous & values heterogeneous

    }
}
