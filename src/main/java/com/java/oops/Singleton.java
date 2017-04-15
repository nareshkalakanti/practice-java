package com.java.oops;

public class Singleton {

    private static Singleton t = new Singleton();

    private Singleton()
    {

    }

    public static Singleton getTest()
    {
        return t;
    }

}















/*
1. For any Java if we are allowed to create only one object such type of class is called singleton class
    example: 1. Runtime , business delegate , service locator etc
2. Advantage : improve performance and memory utilization
Factory methods : Singleton
3. Runtime r1 = Runtime.getRuntime();
    runtime to communicate with JVM
 */