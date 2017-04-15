package com.java.collection;

import java.util.Comparator;
import java.util.TreeMap;

//Demo programm for customized sorting
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap t = new TreeMap(new MyComparator7());
        t.put("XXX",10);
        t.put("AAA",20);
        t.put("ZZZ",30);
        t.put("LLL",40);
        System.out.println(t); //{AAA=20, LLL=40, XXX=10, ZZZ=30} natural or {ZZZ=30, XXX=10, LLL=40, AAA=20} customised Sorting
    }
}
class MyComparator7 implements Comparator
{
    public int compare(Object obj1 , Object obj2)
    {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s2.compareTo(s1);
    }
}