package com.java.collection;

import java.lang.*;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.TreeSet;

public class Employee implements Comparable {
    String name;
    int eid;

    //Constructor
    Employee(String name , int eid)
    {
        this.name = name;
        this.eid = eid;
    }
    //print object we need toString method called on object while printing
    public String toString()
    {
        return name+"--"+eid;
    }

    //Natural Sorting order : Based on ID
    public int compareTo(Object obj)
    {
        //how to access obj2:argument i.e obj1: current object so we use this to call current object this::current object
        int eid1 = this.eid; // find out employee id
        Employee e = (Employee)obj; // comming in object so we need to typecast we cannot as obj we can ask employee
        int eid2 = this.eid;
        if (eid1 < eid2)
        {
            return -1;
        }else if (eid1 > eid2)
            return +1;
        else
            return 0;
    }
}

class CompComp
{
    public static void main(String[] args) {
        Employee e1 = new Employee("Nag",100);
        Employee e2 = new Employee("Balaiah",200);
        Employee e3 = new Employee("Chiru",50);
        Employee e4 = new Employee("Venki",150);
        Employee e5 = new Employee("Nag",100);

        TreeSet t = new TreeSet();
        t.add(e1); // not require comparison
        t.add(e2); //->obj1.compareTo(obj2)
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);

        TreeSet t1 = new TreeSet(new MyComparator6());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1); // According to alphabetical order names

    }
}

class MyComparator6 implements Comparator
{
    public int compare(Object obj1 , Object obj2)
    {
        Employee e1 = (Employee)obj1;
        Employee e2 = (Employee)obj2;
        String s1 = e1.name;
        String s2 = e2.name;
        return s1.compareTo(s2);
       // return e2.compareTo(e1);
        //return -e1.compareTo(e2);
    }
}
