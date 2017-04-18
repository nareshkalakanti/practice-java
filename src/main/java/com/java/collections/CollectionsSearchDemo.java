package com.java.collections;

import java.util.ArrayList;
import java.util.*;

public class CollectionsSearchDemo {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Z");
        l.add("A");
        l.add("M");
        l.add("K");
        l.add("a");
        System.out.println(l);//[Z, A, M, K, a]
        Collections.sort(l); //[A, K, M, Z, a]
        System.out.println(l);
        System.out.println(Collections.binarySearch(l,"Z")); // 3  : Successful search returns index
        System.out.println(Collections.binarySearch(l,"J")); // -2 : unsuccessful search : Insertion point we can take target element
    }
}
