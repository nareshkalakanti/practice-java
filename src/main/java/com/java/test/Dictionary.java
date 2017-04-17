package com.java.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
        int i = 0;
        String someString = "name";


        //arrays have a fixed -pre-determined length
        // create an array of 4 integers
        int[] arrayOfIntegers = new int[4];
        arrayOfIntegers[0] = 55;
        arrayOfIntegers[1] = 67;
        arrayOfIntegers[2] = 34;
        arrayOfIntegers[3] = 22;

        // create a array of 4 strings,using a slightly diffrent syntax

        String[] arrayOfStrings = {"Athos", "Pothos", "Aramis", "D'Artagan"};

        //this is a single line declaration + initialization of array

        for (String mName : arrayOfStrings) {
            System.out.println("Inside our first for-loop" + mName);
        }

        for (int x = 0; x < arrayOfIntegers.length; x++) {
            System.out.println("Inside our second for loop " + arrayOfIntegers[x] + "is the" + x + "-th element");
        }

        //create list of integer

        List<Integer> listOfIntegers = new ArrayList<Integer>();
        List<String> listOfStrings = new ArrayList<String>();
        for (int y = 0; y < arrayOfIntegers.length; y++) {
            listOfIntegers.add(arrayOfIntegers[y]);
            listOfStrings.add(arrayOfStrings[y]);
            //notice that the square brackets are used to access the yth element of an array
        }

        for (int z = 0; z < listOfIntegers.size(); z++) {
            System.out.println(listOfStrings.get(z));
            //get() member function to get a specific element of list

         // MAPs

            Map<String, Integer> mapOfStringIntPairs = new HashMap<String, Integer>();
            for (int j = 0; j<arrayOfIntegers.length; j++){
                mapOfStringIntPairs.put(arrayOfStrings[j],arrayOfIntegers[j]);
                //here the key is j-th element of arrayofStrings, and the value is the
                //j-th element of the arrayofIntegers
            }

            // check the presence of key in Java
            String someKey = "Athos";
            if(mapOfStringIntPairs.containsKey(someKey)){
                System.out.println("Keys"+someKey+ "is in the map and the corresponding value ="+mapOfStringIntPairs.get(someKey));
            }
            else {
                System.out.println("Keys"+someKey+ "is in the map and the corresponding value");

            }

            // Finally lets iterate over each string in set of keys in dictionart
            for (String oneKey:mapOfStringIntPairs.keySet()) {
                System.out.println("One key in the maps="+oneKey+",corresponding value="+mapOfStringIntPairs.get(oneKey));
                //notice how the '.get(key)' member function returns the value corresponding to a particular key


            }

            }

        }
    }




/*
Dictionary : MAP
1.A long List of [word , Meaning] pairs
2.with a way to look words up quickly
3.WORDS :KEYS used to lookup information
4.VALUE : Meaning are called using value

WE NEED TO CREATE A MAP
PUT(KEY,VALUE) pairs into them [insertion]
REMOVE(KEY,VALUE) pairs from them
GIVEN A KEY FIND THE VALUE     [LookUP]
CHECK HOW MANY (KEY,VALUE)PAIRS ARE IN THEM
CHECK IF A SPECIFIC KEY IS IN THE DICTIONARY

 */