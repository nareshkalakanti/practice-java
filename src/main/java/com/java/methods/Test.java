package com.java.methods;

public class Test {
    //instance var

  static  int x;
    //parameterized constructor

    Test(int x)
    {
        this.x =x;
    }

    //static method access x value

    static void access()
    {
        System.out.println("x =" + x);
    }

}

class Demo3
{
    public static void main(String[] args) {
        Test obj = new Test(55);
        Test.access();  //className.method();
    }
}
