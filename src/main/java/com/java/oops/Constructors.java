package com.java.oops;

//instance block vs constructor
public class Constructors {

    static int count=0;

    {

        count++; //instance block
    }
        Constructors()
        {

        }

        Constructors(int i)
        {

        }

        Constructors(double d)
        {

        }

    public static void main(String[] args) {
        Constructors t1 = new Constructors();
        Constructors t2 = new Constructors(10);
        Constructors t3 = new Constructors(10.5);
        System.out.println("The no of object created : " +count);


    }

}

/*
1.Name of class and name of constructor must be matched .
2.create a an object constructor is executed automatically so no return type and even void also.
3.modifiers : public ,private, protected and default.

*/

/*
Default Constructor
1.no arg constructor

    Test ()
        {
            super();
        }

2. Access modifier same as class modifier

3. A no argument call to super class constructor


*/



