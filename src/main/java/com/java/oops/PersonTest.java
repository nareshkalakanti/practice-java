package com.java.oops;

public class PersonTest {

    //Member variables
    private String fisrtName;
    private String lastName;

    //Static member varibles

    public static final int S_DEFAULT_AGE=35;

    private static int personCount = 0;

    public PersonTest(String fisrtName, String lastName) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
    }

    //Member function or methods => indovidual person object can be instantiated from this class
    public String getFirstName() {
        return fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //static member function
    public static void incrementPersonCount() {
        personCount++;
    }

    // PersonTest is a class 'mark' and 'tom' are variables which holds objects of class PersonTest
    public static void main(String[] args) {

        PersonTest mark = new PersonTest("Tom", "Sawyer");
        PersonTest tom = new PersonTest("Mark", "Twain");

        //This statement will not change marks last name
        //tom.setLastName("Jones")
        //mark.setLastName("Jones")


        // String is a class, "s" is a variable holds an object of class String
        String s = "Mark Twain";
        // Boolean is a class , "b' is a variable holds an object of class boolean
        Boolean b = false;
        //Integer is a class , "i" is a variable which holds an object of class Integer
        Integer i = 5;


    }
}

/*

/**
     * 1.Encapsulation : Holding the data and behaviour which work on the data together in one logical componen
     * 2. Constructors :
     * - Called when an object is created
     * - Same name as class
     */

    /* Syntax to create a class
Syntax: [modifiers] class ClassName [extends superclass][implements interfaces]
    // variables
    //Methods
    //ClassName :Identifier
    //extends ; keyword ; to achive inheritence
    //write once class inside another class : inner classes i.e it is called members of the class


1.what is class
   - plan or template
   -Is used to define the variables and methods as single unit
      a) variables : are called as properties or data Members
      b) methods : behaviours or actions
       as single units

 Object : In Real life existed pysically is Object
    ex : Car plan - class
          car - object
          Interface - behaviour

2.class creation is nothing but data type creation
  ex : Emp is user defined data type
   class Emp {
   int empNo;
   String Name;

   }

3. Inheritance
   PersonTest A {
   100 variables, methods
   }

   PersonTest B extends A {  // B is using class A's variables and methods

   }

 - in Java one class can extend only once

   class A {
   }
   class B {
   }
   class c extends A, B {  # not possible in java

   }

4: Implements Keyword for implementing Interfaces
   1) To collect client requirement only
   2) or to Define all the client requirement only
    Ex :
    interface Account {
    void withdraw(int accNum,double amt)

    }


    class AccountImpl implements Account

   // class is overidiing the methods of interface by overridding the methods of Interface

    {

    public void withdraw(int accNum,double amt)
    {
    // logic


    }


    }

2.how to create a class in java
3.how many modifiers are allowed by Java PersonTest

modifiers:-

12 Modifiers

1) Access Modifiers (4)
   public , <default> , private & Protected

2) Non Access Modifiers (8)
   abstract, final , static , synchroized , strictfp(1.2),native,transient,volatile
3) Order is not important but combination is important

class syntax allows only 5 modifiers

public
<default>
final
abstract
strictfp

Ex 1:

final strictfp public class Emp {

//valid

}

ex 2:
abstract final class Employee
{
// illegal combination for classes
// illegal for methods

}


ex 3:
abstract strictfp class Employee
{
// legal combination for classes
// illegal for methods
    abstract strictfp void displayEmp();
   }


Example :

ex 1 :
class Employee {  // outer class allows 5 modifiers

{
class Inner1{   // allows 8 modfiers extra are  [static , private & protected]

}

class Inner2{

}

}


ex 2 : inner class is not same as inheritance
class Employee
{
protected class Inner1 {
}
private class Inner2   {
}
static class Inner3    {
}
}

========More notes on PersonTest=========
CLASS,OBJECTS,INTERFACES



1.PersonTest => Data + behaviour => logical component
2.PersonTest is a Type of variable
3.Variables of a class are callled as 'objects' of that class
4.Strings,Lists and Dictionaries are classes too [Built-in types]
5.Creating a variable of a Type is called instantiation
6.creating an Object of a class is called instantiation
7.Objects contaim data and functions
8.Object are instance of a Class
9.Objects contain data called as member variables
10.object has functions called as methods and member functions
11.


 */