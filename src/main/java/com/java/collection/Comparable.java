package com.java.collection;

public class Comparable {
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z")); // -ve before
        System.out.println("Z".compareTo("K")); // +ve After
        System.out.println("A".compareTo("A"));//0
        System.out.println("A".compareTo(null));//NPE

    }
}

/*
* obj1.compareTo(obj2)
* obj1: The object , which is to be inserted
* obj2: The object , which is already inserted
* */