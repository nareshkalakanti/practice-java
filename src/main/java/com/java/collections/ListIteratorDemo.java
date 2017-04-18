package com.java.collections;
import java.util.*;



import java.util.LinkedList;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("balakrishna");
        l.add("venki");
        l.add("chiru");
        l.add("nag");
        System.out.println(l); //[balakrishna, venki, chiru, nag]

        ListIterator ltr = l.listIterator();
        while (ltr.hasNext())  // wat next element is there store in s
        {
            String s = (String) ltr.next();
            if (s.equals("venki"))
            {
                ltr.remove();
            }
            else if (s.equals("nag"))
            {
                ltr.add("chaitanya");
            }
            else if(s.equals("chiru"))
            {
                ltr.set("charan");
            }

        }
        System.out.println(l); //[balakrishna, charan, nag, chaitanya]
    }
}
