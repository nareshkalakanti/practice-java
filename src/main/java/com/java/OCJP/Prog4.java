package com.java.OCJP;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Prog4 {
    public static void main(String[] args) {
        List l = new LinkedList();
        l.add("a");
        l.add("b");
        l.add("c");
        // all the elements will become reverse i.e c b a
        Collections.reverse(l);// collections class contains static methods
        // Iterator is an Interface
        //iterator() method is a non static method is available in any collection implementation i,e AL , LL etc
        Iterator itr = l.iterator();
        // Foreach loop is enhanced for loop
        // is used to process the elements of collection object easily from JDK 1.5
       // foreach loop is taking right side array object or collection object
        // that should not be itr object
        // it is Object 0 type since we didnt mention the generic type so we are taking common type

        //for (Object o : itr) // error message : compilation fails
           // System.out.println(o);
    }
}

// We are creating object for linkedlist i.e collection object
// The refrence variable we are collecting into variable l its is of type list
//When ever we create object for child class and collecting the address into parent type variable : upcasting and run time polymorphisim
//If you want to process the elements i.e collecting element by element and then performing actions on invidual elements then we go for iterator concepts
// if you want to display the elements directly we can display the collections object by passing ref variable to sop
// create itr object in that elements will be stored [ c b a ]
//