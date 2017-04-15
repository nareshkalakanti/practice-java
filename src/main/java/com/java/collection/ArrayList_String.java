package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_String {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();

        //Add four objects
        l.add("Apple");
        l.add("Mango");
        l.add("Grapes");
        l.add("Guava");
        System.out.println("Contents  : " + l);

        //remove two object
        l.remove(3);
        l.remove("Apple");
        System.out.println("Contents  : " + l);

        //display its size
        System.out.println("size of arraylist: " + l.size());

        //extract elements using iterator
        System.out.println("Extracting using Iterator :");

        //add an Iterator to arraylist to retrieve elements

        Iterator it = l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }

}
