package com.java.methods;

public class Sample_this {

    private int x;

    Sample_this()
    {
        this(55);
        this.access();
    }

    Sample_this(int x)
    {
        this.x = x; // refer present class instance variable
    }

    //method
    void access()
    {
        System.out.println("x= " +x);
    }
}

class ThisDemo
{
    public static void main(String[] args) {
        Sample_this s = new Sample_this();
    }
}

