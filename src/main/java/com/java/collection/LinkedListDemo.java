package com.java.collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.add("Naresh");
        l.add(30);
        l.add(null);
        l.add("Naresh");//[Naresh,30,null,Naresh]
        l.set(0,"Software");//[Software,30,null,Naresh]
        l.add(0,"Venky");//[Venky,Software,30,null,Naresh]
        l.removeLast();//[Venky,Software,30,null]
        l.addFirst("CCC");//[CCC,Venky,Software,30,null]
        System.out.println(l); //[CCC, Venky, Software, 30, null]

    }
}
