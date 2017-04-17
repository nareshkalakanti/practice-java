package com.java.OCJP;

public class Pro1 {

    static {
        Pro1.a = new Pro1().fun();
    }
    static int a = 70;

    public static void main(String[] args) {
        System.out.println(Pro1.a);
    }
    static
    {
        Pro1.a = Pro1.a+Pro1.fun();
    }

    static int fun()
    {
        Pro1.a = 50;
        return Pro1.fun1();
    }

    static int fun1()
    {
        System.out.println(Pro1.a);
        return Pro1.a+30;
    }


}
/*First static block execution */
//The above code is using ClassPerson Members nothing but static members , static method and block
// Execution first static variable and static methods and then finally manin method executes
//At the time of class loading static variable get memomory allocation and initializes with default value i.e a =0 initializes with zero
// static blocks and static variable equal priority
//Pro1.fun() -> In fun method we are assigning value 50 to 'a' so it changes from 0 to 50
//But its returning value return Pro1.fun1() ->so the control commes to fun1 function
//  so we are printing System.out.println(Pro1.a) ->50 o/p
//But the return Pro1.a+30-> 50+30 =80 it will return it back to Pro1.fun1() from were it has called
//Then it returns a value 80 to Proj1.func() ->80
/* Second here is static variable execution */
// assign vaalue of a = 70  i.e  a value from 80 becomes 70
/* Second static block execution */
// Pro1.a+Pro1.fun() => 70 calling method fun() : 70 + 80
// a value 70 becomes 50
//second statement calling fun1() ->pro1.a printing :o/p 50
// 50 to  80 => returned
//output: 50 50 150s