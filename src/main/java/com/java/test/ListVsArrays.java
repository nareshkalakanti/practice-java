package com.java.test;

import java.util.ArrayList;
import java.util.List;

public class ListVsArrays {
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

        String[] arrayOfStrings = {"Athos","Pothos","Aramis","D'Artagan"};

        //this is a single line declaration + initialization of array

        for (String mName:arrayOfStrings) {
            System.out.println("Inside our first for-loop" +mName);
        }

        for (int x = 0 ; x<arrayOfIntegers.length;x++){
            System.out.println("Inside our second for loop " +arrayOfIntegers[x] + "is the" +x+"-th element"  );
        }

      //create list of integer

        List<Integer> listOfIntegers = new ArrayList<Integer>();
        List<String>  listOfStrings = new ArrayList<String>();
        for (int y =0; y<arrayOfIntegers.length;y++) {
            listOfIntegers.add(arrayOfIntegers[y]);
            listOfStrings.add(arrayOfStrings[y]);
            //notice that the square brackets are used to access the yth element of an array
        }

        for (int z=0;z<listOfIntegers.size();z++){
            System.out.println(listOfStrings.get(z));
            //get() member function to get a specific element of list

        }

    }


}






































/*

LIST: containers for elements of order
 All things we do with LISTS
1.create a list
2.insert items into lists
3.remove items from lists
4.check size of lists
5. no of elements in list can change
6. only contain objects type
7. list.size()  to get no of elements in a list

ARRAYS are almosts lists
1.order is imporrtant
2.once u create an array of specific size no of elements in array cannot change
3.ARRAYS can contain ref type and primitive type
4.array.length no of elements in an array

*/