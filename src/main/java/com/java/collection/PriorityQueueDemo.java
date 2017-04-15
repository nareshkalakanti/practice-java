package com.java.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
       // System.out.println(q.peek());
        //System.out.println(q.element());
        for (int i = 0 ; i<=10 ;i++)
        {
            q.offer(i);
        }
        System.out.println(q); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(q.poll()); // remove and return head element of queue
        System.out.println(q);
    }
}
