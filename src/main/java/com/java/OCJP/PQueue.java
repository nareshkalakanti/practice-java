package com.java.OCJP;

import java.util.PriorityQueue;

public class PQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        int i;

        for (i =10 ; i<=100; i=i+10 )
        {
            pq.add(new Integer(i));
            // converting 10 into object and adding to pq
        }
                 //0<10
        for (i=0;i<pq.size();i++)
        {
         pq.poll(); // remove top element in the list i.e poll means delete firts element is removed other will move forward
        }
        System.out.println("Q Elements : "+pq);
    }

}
