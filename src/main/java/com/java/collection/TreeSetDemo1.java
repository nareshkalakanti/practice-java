package com.java.collection;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("B"));
        System.out.println(t);
    }

}

/*
Default Sorting Order
1. Homogenious
2.Comparable : An obj is said to be comparable if and only if coreesponding class implements comparable interface
String class and all Wrapper classes already implement comparable interface but
StringBuffer class doesnt implemet compable interaface hence we are getting ClassPerson Cast Exception
*/
