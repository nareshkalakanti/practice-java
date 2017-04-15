package com.java.methods;

public class Test_1 {
    static int x = 10;

    //display the variable

    static void display()
    {
        System.out.println(x);
    }
}

class StaticDemo
{
    public static void main(String[] args) {
        //create two references obj1 ob2
            Test_1 obj1,obj2;
            obj1 = new Test_1();
            obj2 = new Test_1();
        //increemt x in obj1
        ++obj1.x;
        System.out.println("x in obj1:  ");
        obj1.display();
        //display x in obj2
        System.out.println("x in obj2:  ");
        obj2.display();
    }
}