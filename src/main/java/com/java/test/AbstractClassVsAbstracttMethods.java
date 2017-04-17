package com.java.test;

public class AbstractClassVsAbstracttMethods {
}



/*
#abstract class and abstract methods

what is abstract ?

1. abstract  : it is a non-access modifier in java
2. modifier is applicable for classes,interfaces,methods & inner classes.
3.variables not declared with abstract


concrete method:
=======================

1) allways contains method body
2)Complete method in Java
3)
ex:

public double withdraw(int accNum, double amt){
//body
}


abstract class :
================
1) Allows 0 or n number of abstarct and concrete methods
2) Allows abstract methods and concrete methods
3) partial implemented class
4) not ready to provide service
5) Object creation is not possible
6) static and non static : variables & methods    & Constructors
7)Need of constructor in abstract class & when it executes
   - to provide initialization to non-static variables
   - constructor is executing whenever we are creating an object



ex:
abstract class Account {
abstract double withdraw(intaccNum,double amt); #abstract method
void balanceEnq(int accNum) {                   #concrete method
}

Account acc = new Account();  // Object compile time error [invalid CTE]
}


ex :

public abstract Employee {
private int empNo;
private String name;
#constructor
public Employee(int empNo , String name ){
this.empNo = empno;
this.name = name;
}
}


======================

public class Manager extends Employee {
public Manager(int empNo, String name ) {
super(empNo,name); //this statement is used to call
 //super class constructor
// creating an object of sub class
Manager m = new Manager(101,"naresh')

}



==============================
# To avoid object creation not possible

abstract class Account{
double deposit(int accNum,double amt) {
}
}



abstract method:
===============

1) If any method that ends with ; without body

public abstract  double withdraw(int accNum, double amt);

1. when ever we don't no how to provide implementation for a method
2.cannot contain body
3. abstract is keyword and mofifier
4. Need to end method with semi-colon
   -when ever we don't no how to provide implementation for a method
   -why we dont know about implementation
   -To provide impelemtation we need some other methods and variables there support is required
5. In any Java class atleast one abstract method is there is it is mandatory to declare the class as abstract
6. In a class abstract method are available for that class we can create sub -class
7. sub class must overide super class abstract methods and provide implementation logic
8. Else declare sub class as abstract


ex :

  abstract class Account { // implentation not possible
  public abstract  double withdraw(int accNum, double amt);
       }
  #creating a sub-class
   class SubAccount extends Account { // overide the withdraw method and provide body
    public double withdraw(int accNum,double amt) {
    //get totalBalance from database based accNumber
    totalBalance = totalBalance-amt;
    //update the totalBalance into the database
    return totalBalance;
       }
       }
 */

/*
===More Notes===
Abstarct base classes
1) Abstract class is a class that is Abstract
2)An abstract method is a method without implemention
3) same like methods in interfaces




















 */














