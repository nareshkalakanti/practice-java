package com.java.oops;

public class Constructor_Person {
    // instance variables

    private String name;
    private int age;

    //default construct
    Constructor_Person()
    {
        name = "Naresh";
        age = 25;
    }

    //parametrized constructor
    Constructor_Person(String s , int i)
    {
        name = s;
        age = i;
    }

    //method

    void talk()
    {
        System.out.println("Hello Iam "  + name);
        System.out.println("My age is " + age);
    }


}

class Demo2 {
    public static void main(String[] args) {
        //create Person_Access_Specifiers class object : Naresh

        Constructor_Person Naresh = new Constructor_Person();
        //call the talk method
        Naresh.talk();

        // create another Person class object : Sita
        Constructor_Person Sita = new Constructor_Person("Sita",20);
        Sita.talk();

    }
}
