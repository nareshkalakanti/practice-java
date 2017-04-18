package com.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

/*
* WAP to insert String & StringBuffer objects into tree set
* Where Sorting Order increasing length order .If two objectshaving same length
* then consider there alphabetical order
*
* */

public class TreeSetDemo5 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator5());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCD");
        t.add("A");
        System.out.println(t); //[A,AA,XX,ABC,ABCD] [alphabetically]
    }
}

class MyComparator5 implements Comparator
{
    public int compare(Object obj1 , Object obj2)
    {
        //convert to string objects

        String s1 = obj1.toString();
        String s2 = obj2.toString();
        int l1 = s1.length();
        int l2 = s2.length();
        //less length before
        if (l1<l2)
            return -1;
        else if(l1>l2)
            return +1;
        else
            return s1.compareTo(s2);//alphabetical order only

    }
}