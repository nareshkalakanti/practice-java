package com.java.test;

public class InterfaceVsAbstract {
}



/*

Abstract class :
Ex:
abstract class Students {
1.allows 0 or n number of concrete and abstract methods
2. abstract methods and concrete methods
3. there are no default cases for methods
4. there are no default case for variables
5.Object creation is not possible for abstract class
abstract void getStudentDetails();
void setStudentDetails()

}


ex :
//define constuctor , non static & static block , static and non static variables defines i.e every this is possible
abstract class Student {
Student() {
}
static {
}
{//non-static blocks
}
static void display() {
}
void display() {
}
int x=10;
static int y = 20;
}




Interface :
1 0 or n number of abstract methods only
2  by default interface methods are internally it is public and abstract
3 by default the variables are public , static & final
4 Object creation is not possible for Interface


ex 1 :
interface Student {
abstract void getStudentDetails();
abstract void setStudentDetails();

}

ex 2 :

1 by default interface methods are internally it is public and abstract
2. by default the variables are public , static & final
interface Student {
int x = 10; //  public static final int x;
void display();

}
 ex 3:

1 constructors are not allowed
2  static blocks and non static blocks are not possible to declare
3  static methods not possible to declare
4 only public method are possible
    allowed:             not allowed:
    public               private,protected
    methods              methods
                        static, native, strictfp,final,synchronized

5  private & protected not allowed
6 In Java for methods illegal combination
   abstract          abstact    abstract   abstract   abstract        abstract
   static            native     strictfp   final      synchronized    private

interface Student{
Student() {   #not possible
}
static {     #not possible

}

{ // non static #not possible

}
static void display() {  #not possible
}
}




























 */