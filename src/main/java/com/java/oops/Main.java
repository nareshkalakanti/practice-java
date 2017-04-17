package com.java.oops;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //lets create and use objects of class Musketeer that we just created
        //call to the first constructor , which takes in both name and age
        Musketeer m1 = new Musketeer("Athos",57);
        //create an object and call second constructor , which takes only name,and assigns a default age
        Musketeer m2 = new Musketeer("Porthos");
        //create another object of muskerteer class
        Musketeer m3 = new Musketeer();
        //we get CTE for the above sinve we have created 2 constructors , both which take
        //in arguments (2 or 1)
        //to fix this , lets create a third constructor,with a default value for the name as well as the age

        //create a list of musketeer object
        //List is interface and ArrayList is a base class

        List<Musketeer> musketeerList = new ArrayList<Musketeer>();
        musketeerList.add(m1);
        musketeerList.add(m2);
        musketeerList.add(m3);

        //we can iterate over this list like we would any other list
        for (Musketeer m:musketeerList) {
            System.out.println("Name of this musketeer = " + m.getName() + ", Age of this musketeer=" + m.getAge());

        }





























    }
}
