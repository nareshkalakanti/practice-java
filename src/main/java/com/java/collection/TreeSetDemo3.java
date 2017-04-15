package com.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t); //[20, 15, 10, 5, 0]
    }
}

class MyComparator implements Comparator
{
public int compare(Object obj1, Object obj2)
{
    Integer I1 = (Integer)obj1;
    Integer I2 = (Integer)obj2;
    if(I1<I2)
        return  +1;
    else if (I1 > I2)
        return -1;
    else
        return 0;
}

}

/*
Customised Sorting:
if not passing object internally jvm calls compareTo() which is default sorting o/p is [0,5,10,15,20]
if passing comparator object then jvm will call compare method which is ment for customized sorting in this case o/p is [20, 15, 10, 5, 0]
*/