package com.java.collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {
    public static void main(String[] args) {
        int[] a = {10,5,20,11,6};
        System.out.println("Primitive Array before Sorting: ");
        for (int a1:a) // to print element of a
        {
            System.out.println(a1); // 10 5 20 11 6
        }
        Arrays.sort(a);
        System.out.println("Primitive Array After Sorting: ");
        for (int a1:a)
        {
            System.out.println(a1); // Ascending order (D.S.O) 5 6 10 11 20
        }

        String[] s = {"A","Z","B"};
        System.out.println("Object Array Before Sorting : ");
        for (String a2:s)
        {
            System.out.println(a2); // A Z B
        }
        System.out.println("Object Array After Sorting : ");
        Arrays.sort(s);
        for (String a1:s)
        {
            System.out.println(a1); // A B Z
        }
        Arrays.sort(s, new MyComparator10());
        System.out.println("Object Array after Sorting using Comparator : ");
        for (String a1:s) {
            System.out.println(a1); // Z B A { Reverse of alphabetical order}
        }
    }

}

class MyComparator10 implements Comparator
{
    public int compare(Object o1,Object o2)
    {
        String s1 = o1.toString();
        String s2 = o2.toString();
      return   s2.compareTo(s1);

    }
}



