package com.java.oops;

public class Variables {


    public static void main(String[] args) {
        System.out.println("Hello World");

        // all statements in java must end with ;
        // except blocks if then else or loops like { }
        // Java has two types of variables- primitive type and object/refrencetypes

        int i = 0;
        String someString = "some String";
        System.out.println("This is  a  number" + i + " this is string :" + someString);


    }
}

/*


1. Variables in java are like containers that holds values
2.Type of variable is very important in java
3.Type safety
4. Variables can be either primitive or refrence types
   primitive types:
   - int, Boolean,char,long,double,byte,float,short
    reference types
   Strings, Arrays, LIST , MAPS, Object of classes

5. For every Primitive type , there is a correspoding refrence type that serves as a wrapper

-Integer  is A refrence Type , wrapper for int which is a primitive type
6  Why are these wrappers needed ?
   -Because much java functionality eg LIST only works with Refrence type

7. Diff Between primitive vs refrence types
   1. primitive types are never objects ->Reside memory stack
   2.refrence types are always Objects- Reside on HEAP
   3.Primitive types are passed-by-value
   4.Refrence types aare passed-by-refrences

   TEXT memory : source code and compile code lives
 PT:  STACK : temporary memory : used by program while its  running ex func with varaibles lives in stack when it done memory is released
 RT:  HEAP : Permanent : Object  lives in HEAP and address is passed to variable in stack

8. JAVA has a special keyword, called null
   -Object can be null i.e doesnt exists
   -primitive types can never be null
   - If you try to do stuff with an object that is null will lead to bad stuff
     i.e Exception being throwed of type NPE
   - to avoid this , its super common

   ex : It checks of the aboject exists before it try's to do something with it

   if(mediaPlayer !=null){
     mediaPlayer.stop();

 */