package com.java.OCJP;

public class Test {
    Test t1;
    static  Test t2;

    //Test.t2 value is null
    // in non static area we use this it will  point to Object i.e t1=null
    Test()
    {
        this.t1 = Test.t2;
    }

    public static void main(String[] args) {
        Test.t2 = new Test();
        Test.t2.m();
        Test.t2.t1.m();
        //2046.null.m()
    }
    void m()
    {
        System.out.println("fun .....");
    }
}

//Declaring two variable one static another non static
//if we observe here these are not primitive types these are class types
//i.e class type are Object refrence variable
//static variable get memomory allocation time of loading so here it is t2 =null
//next goes to main method
//whenever object is created so non static variable get memory allocation t1 also class type variable
////Object will be created in a leap area and t1 = null
//Once the object is created we are calling constructor Test() externally
//access static variable is by using class name
//when we are calling method with null pointer we get exception null pointer
