package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSearchDemo1 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);
        System.out.println(l);//[15, 0, 20, 10, 5]
        Collections.sort(l,new MyComparator4());
        System.out.println(l);//[20, 15, 10, 5, 0]
        System.out.println(Collections.binarySearch(l,10,new MyComparator4())); // 2 (index)
        System.out.println(Collections.binarySearch(l,13,new MyComparator4())); // -3
       System.out.println(Collections.binarySearch(l,17)); // unpretictable -6

    }
}

class MyComparator4 implements Comparator
{
    public int compare(Object obj1 , Object obj2)
    {
        Integer I1 = (Integer)obj1;
        Integer I2 = (Integer)obj2;
        return I2.compareTo(I1);
    }
}
