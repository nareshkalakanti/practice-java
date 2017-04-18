package com.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args)  {
        HashMap m = new HashMap();
        m.put("chiranjeevi", 700);
        m.put("balaiah", 800);
        m.put("venkatesh", 200);
        m.put("nagarjuna", 500);
        System.out.println(m); // {k=v,k=v,---}
        System.out.println(m.put("chiranjeevi", 1000));
        Set s = m.keySet();
       System.out.println(s);
        Collection c = m.values();
        System.out.println(c);
        Set s1 = m.entrySet();
        System.out.println(s1);
        Iterator itr = s1.iterator();

        while (itr.hasNext()) // can u provide next element i.e entry type
        {
            Map.Entry m1 = (Map.Entry)itr.next();  // outerclassName.InnerClassName
            System.out.println(m1.getKey()+ "---- "+ m1.getValue());
            if (m1.getKey().equals("nagarjuna"))
            {

                m1.SetValue(10000);
            }
        }
            System.out.println(m);
        }
    }

