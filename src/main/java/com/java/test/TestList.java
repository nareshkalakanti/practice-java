package com.java.test;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        List<String> listofMusketeers = new ArrayList<String>();
        listofMusketeers.add("Athos");
        listofMusketeers.add("Pathos");
        listofMusketeers.add("Aramis");
        System.out.println(listofMusketeers);
        if (listofMusketeers.size()==3){
            listofMusketeers.add("D'Artagnan");
            System.out.println(listofMusketeers);
            System.out.println("The last Musketeer is " + listofMusketeers.get(3));
        }
        else{
            System.out.println("The last Musketeer is " + listofMusketeers.get(2));
        }


    }


}
