package com.java.flow;

// To print elements of one-dimensinal array:
public class For_Each {
    public static void main(String[] args) {
        int[] x = {10,20,30,40};
        for (int x1:x) {   // for each int value print x
            System.out.println(x1);

        }
    }
}













/*
Synatax: for-each loop ( Enhanced for loop)
1.To retrive elements of arrays and collection


for(eachitem x : target)     target : Array/Collection
{                                     Iterable object
                                      Should be Iterable object [j.l.Iterable(I)]
                                      Iterator-3 methods
                                      1.hasNext()
                                      2.next()
                                      3.remove
Action

}



*/
