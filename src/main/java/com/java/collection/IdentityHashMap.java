package com.java.collection;

import java.util.HashMap;

public class IdentityHashMap {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        Integer I1 = new Integer(10);
        Integer I2 = new Integer(10);
        m.put(I1,"pavan");
        m.put(I2,"kalyan");
        System.out.println(I1 == I2); //[reference Comparison] false
        System.out.println(I1.equals(I2)); //[content comparison] // true
        System.out.println(m); //{10=kalyan} value is replaced
    }
}

/* JVM will use .equals() method ->IdentityHashMap : To identify duplicate keys
* I1 & I2 are duplicate keys because I1.equals(I2) returns false
* If we replace HashMap with IdentityHashMap then the o/p is { 10 = pavan , 10 = kalyan}
* pavan is replaced by kalyan
*
* */