package com.java.oops;

public class Person_Access_Specifiers {
    //intance variables initialzed

    private String name="Naresh";
    private int age =30;

    //Methods
    void talk()
    {
        System.out.println("Hello Iam" + name);
        System.out.println("My age is" + age);
    }

}


class Demo1 {
    public static void main(String[] args) {
        //create Person_Access_Specifiers class object : Naresh

        Person_Access_Specifiers Naresh = new Person_Access_Specifiers();
        //call the talk method
        Naresh.talk();

        // create another Person class object : Sita
        Person_Access_Specifiers Sita = new Person_Access_Specifiers();
        Sita.talk();


    }

}
