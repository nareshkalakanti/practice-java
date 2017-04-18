package com.java.collections;

import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println(v.capacity()); //10
        for (int i = 1; i<=10 ; i++)
        {
            v.addElement(i);  //adding only 10 elements
        }
        System.out.println(v.capacity()); //10
        v.addElement("A");// Adding 11th element so capacity increased to 20
        System.out.println(v.capacity());//20
        System.out.println(v);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]

        // retrieve using listIterator

        ListIterator lit = v.listIterator();
        System.out.println("In forward Direction");
        while(lit.hasNext())
            System.out.println(lit.next() + "\t");

        System.out.println("In Backward Direction");
        while(lit.hasPrevious())
            System.out.println(lit.previous() + "\t");


    }


}
