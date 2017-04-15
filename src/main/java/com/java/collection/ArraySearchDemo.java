package com.java.collection;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.binarySearch;

public class ArraySearchDemo {
    public static void main(String[] args) {
        int[] a = {10,5,20,11,6};
        Arrays.sort(a);
        System.out.println(binarySearch(a,6)); // 1
        System.out.println(binarySearch(a,14)); // -5

        String []s = {"A","Z","B"};
        Arrays.sort(s);
        for (String a1:s) {
            System.out.println(a1);
        }
        System.out.println(binarySearch(s,"Z")); // 2
        System.out.println(binarySearch(s,"S"));// -3
        Arrays.sort(s, new MyComparator11());
        System.out.println(binarySearch(s,"Z", new MyComparator11()));
        System.out.println(binarySearch(s,"S", new MyComparator11()));
        System.out.println(binarySearch(s,"N"));

    }
}


class MyComparator11 implements Comparator
{
    public int compare(Object O1 , Object O2)
    {
        String s1 = O1.toString();
        String s2 = O2.toString();
        return s2.compareTo(s1);

    }
}
