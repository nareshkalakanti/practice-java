package com.java.oops;

public class PrivateConstructors {

}

/*

 Private
================
1 private : is an access modifier
2. private modifier is applicable for
   - variables
   - methods
   - constructors
   - inner classes

==========

   1. If a constructor is declared private how to create object of that class
   2. In Java the constructor allows only access modifier
      -private
      -protected
      -<default>
      -protected
   3> Constructor declared private how to handle that class

 ex:
 ===
public class Employee {
private Employee() {  // possible to access within the same class

   }

   public static void main(string[] args)
    Employee e = new Employee();
    System.out.println(e.hashCode());

   }
}

ex : When ever class contains private constructors , for that class  object creation is not possible
     by using new operator in another class because private members not accessable from outside class
============================

public class Employee {
private Employee(){
System.out.println("Employee Constructor");
}
}
class Demo {
public static void main(String[] args){
Employee e = new Employee();
// CTE : Employee() has private acess in Employee class

}

ex : To overcome the problem
1. Static factory methods
factory method: Any java method that is having the capability for  constructing and returning of some class object refrence
2. In Java we have two types of factory methods
    - static factory methods
    -non static factory methods
   ===============
ex :

   class Employee {
    public static Employee getEmployeeInstance() {
    #getEmployeeInstance() is factory method
    #Employee : object
    return new Employee();
    }
}

static factory methods
1. Create an object of private constructor  classes from another class
2. from outside of the employee class to create an object of employee instead of directly calling the constructor
   it is possible to call getEmployeeInstance() and possible to get the Employee object

BestExample:
java.lang.Runtime
java.lang.class

=========
ex :


public class Employee {
private Employee(){
System.out.println("Employee Constructor");
}
public static Employee getEmployeeInstance(){
  return new Employee();

}
class Demo {
public static void main(String[] args){
//Employee e = new Employee();
// CTE : Employee() has private access in Employee class
 Employee e1 =Employee.getEmployeeInstance();
 Employee e2 =Employee.getEmployeeInstance();

}




































 */