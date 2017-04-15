package com.java.collection;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {

        Hashtable h = new Hashtable(25);
        h.put(new TempA(5),"A");
        h.put(new TempA(2),"B");
        h.put(new TempA(6),"C");
        h.put(new TempA(15),"D");
        h.put(new TempA(23),"E");
        h.put(new TempA(16),"F");
       // h.put("durga",null);
        System.out.println(h); //{6 =C, 16 =F, 5 =A, 15 =D, 2 =B, 23 =E}
                                //{16 =F, 15 =D, 6 =C, 23 =E, 5 =A, 2 =B}
                                //{23 =E, 16 =F, 15 =D, 6 =C, 5 =A, 2 =B}
    }

}
class TempA
{
    int i; //instance variable

    TempA(int i)
    {
        this.i = i;
    }
   // what ever i value passing will become hashcode
    public  int hashCode()
    {
        return i;
        //return i%9;
    }
    public String toString()
    {
        return i + " ";  //int no + empty String
    }


}