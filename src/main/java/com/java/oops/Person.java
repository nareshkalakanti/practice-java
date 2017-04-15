package com.java.oops;

public class Person {

    //properties-variables
    String name;
    int age;

    //actions - methods
    void talk(){
        System.out.println("I am " + name);
        System.out.println("I am " + age);

    }
}

class Demo
{
    public static void main(String[] args) {
        // create a Person class object: Raju

        Person Raju = new Person();
        //find the hashcode of the object
        //System.out.println("Hash Code=" + Raju.hashCode());
        //Raju.talk();
//        1.Initalize Instance variable
        Raju.name="Raju";
        Raju.age=22;
        Raju.talk();
    }
}