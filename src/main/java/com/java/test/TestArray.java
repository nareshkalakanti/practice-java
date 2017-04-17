package com.java.test;

public class TestArray {
    public static void main(String[] args) {
        String [] listOfMusketeers = {"Athos","Pathos","Aramis","D'Artangan"};
        if (listOfMusketeers.length==4){
            System.out.println("The last musketeer is " +listOfMusketeers[3]);
        }else {
            System.out.println("The last musketeer is " +listOfMusketeers[2]);
        }
    }
}
