package com.java.oops;

public class Employee {
    // data members are private possible to acess within the same class only
    private int empNo;
    private String name;

    public Employee(int empNo, String name) {
        this.empNo= empNo;
        this.name = name;
    }
    // providing initialization for two variables creating two methods
    //setter methods

    public void setEmpNo(int empNo){
        this.empNo=empNo; // provide initialization using setter methods
    }
    public void setName(String name)
    {
        this.name = name; //provide initialization
    }
    public void getEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("=================");
        System.out.println("Emp NO :" +empNo);
        System.out.println("Name:" +name);
    }
}

class Test{
    public static void main(String[] args) {
        //Employee e = new Employee();
        Employee e = new Employee(101,"Naresh");
//        e.empNo=101;//variable empNo has private acess in Employee
//        e.name="naresh";// variable empNo has private acess in Employee
        //by calling the two method setName and setEmpNo and
        // non static methods with help of object only we can call
        // provides initilizations
//        e.setEmpNo(101);
//        e.setName("Naresh");
        e.getEmployeeDetails();
    }
}





/*
Constructor:To initialize the properties of object

1. Constructor is a special java member
2.It is used to create an object and also used to provide initialization to the properties of an object
3. Constructor is used to provide initialization to the properties of an object
4.Constructor name and class name must be same
5.executing at the time of creating an object
6.Constructor allows 4 access modifiers
   public
   private
   <default>
   protected

7.Constructor looks like a method but method syntax contains retunrn type but constructor doesnt have return type


Example 1:
class Employee {

Employee()
{

}

Ex 2 :Constructor with parameter
Employee(int empNo, String name)
{
}

Ex 3 : Object creation and constructor is going to be executed


class Employee
{
Employee() {

}

}

Employee e = new Employee();

// object creation we are calling constructor ss



Ex 4 : initialization to the properties of Object using Constructor

class Employee {
 int empNo;
 String empName;

 Employee(int empNo, String empName) // parameterized constructors
 {

  this.empNo = empNo; // this keyword to accsess non static variable
  this.empName = empName;

 }
}

Employee e = new Employee(101,"Naresh");

in this object creation two properties we initialised 101-empno etc



Note : initialization to the properties of Object in Java we use
        1.setter
        2.methods
        3.constructors


Example 5 : Access Modifiers and examples

       public  class Employee {

        private Employee()
        {

        }

        }


Example 6 :

    public class Employee
    {

    Employee() { // zero argument constructor
    system.out.println("Emp constructor");
    }
    public static void main(String[] args){
       Employee e1 = new Employee();
       Employee e2 = new Employee();
        }
        }

Types of constructor in java:

Two types : default and user defined

  1. Default constructor : it is always a zero-arg constructor
  2.user defined ;: zero arg constructor and parameterized constructor


 */