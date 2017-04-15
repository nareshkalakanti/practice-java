package com.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator2());
        t.add("Roja");
        t.add("Shoba Rani");
        t.add("RajaKumari");
        t.add("Ganga Bhavani");
        t.add("Ramulamma");
        System.out.println(t); //[Ganga Bhavani, RajaKumari, Ramulamma, Roja, Shoba Rani] : Alphabetical order
    }
}
//Reverse of alphabetical order // [Shoba Rani, Roja, Ramulamma, RajaKumari, Ganga Bhavani]
class MyComparator2 implements Comparator
{
    public int compare(Object obj1 , Object obj2)
    {
        String s1 = obj1.toString();
        String s2 = (String)obj2;
       // return s2.compareTo(s1);
        return -s1.compareTo(s2);
    }
}
