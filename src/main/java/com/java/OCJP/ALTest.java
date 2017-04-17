package com.java.OCJP;

import java.util.ArrayList;

public class ALTest {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        int i;
        for ( i=10; i<=100; i=i+10)
        {
            list.add(new Integer(i));
        }
        //index<size decreased
        // 0 <10 -> T i++ ->0 first element is removed
        // 1 <9 -> T  i++ ->1 size dec to 9 index from 1 is removed
        // 2 < 8 - T  i++ ->2  size becomes 8 index from 2 is removed

        for ( i = 0 ; i<list.size(); i++)
        {
            list.remove(i);
        }
        System.out.println("List:" + list);
    }
}


//This code represents creating object for arraylist and we are storing some elements
// and by using remove method remove some elements and print the final list
// starts with 10 , 10 <=100 ->T control move inside and then 10 will converted to integer Object and added to list
// next i value will become 20 i.e i = i+10
// 0   1  2  3  4  5  6  7  8  9
// 10 20 30 40 50 60 70 80 90 100 -->list
// 20 30 40 50 60 70 80 90 100    -- size will decrease
// initially size is 10 so  0<10
