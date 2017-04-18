package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
// Sort Elements of List According to Cutomized Sorting
public class CollectionsSortDemo2_AL {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("L");
        System.out.println("Before Sorting:" +l);//[Z, A, K, L]
        Collections.sort(l,new MyComparator9());
        System.out.println("After Sorting:" + l);//[Z, L, K, A]
    }
}

class MyComparator9 implements Comparator
{
    public int compare(Object  obj1 , Object obj2)
    {
        String s1 = (String)obj1;
        String s2 = obj2.toString();
        return s2.compareTo(s1);


    }
}