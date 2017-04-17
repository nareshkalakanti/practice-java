package com.java.OCJP;

public class Pro3 {

    static
    {
        Pro3.a = Pro3.fun();
    }
    static int a = 70;

    public static void main(String[] args) {
        System.out.println(Pro3.a);
    }
    static
    {
        Pro3.a = Pro3.a+Pro3.fun();
    }
    static int fun()
    {
        Pro3.a = 50;
        return Pro3.fun();
    }
    static  int sfun1()
    {
        System.out.println(Pro3.a);
        return Pro3.a+30;
    }
}


