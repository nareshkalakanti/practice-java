package com.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

//Heterogenous object : If we are depending on default sorting order compulsory objects should be homogenous and comparable
//otherwise we will ger run time exception saying class cast exception
//If we are defining own sorting by Comparator then objects need not be comparable and homogenious i.e we can add heterogenious non comparable objects

public class TreeSetDemo4 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator3());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));
        System.out.println(t); // [A, K, L, Z]

    }

}

class MyComparator3 implements Comparator
{
    public int compare(Object obj1 , Object obj2)
    {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s1.compareTo(s2);
    }
}