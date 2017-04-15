package com.java.methods;

public class Person {
    //instance variables
    private String name;
    private int age;

    //mutator methods to store data

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age=age;
    }
    //accessor methods to read data

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

}

class Method
{
    public static void main(String[] args) {
        //create an empty person class object
        Person p1 = new Person();
        //store some data into the object
        p1.setAge(20);
        p1.setName("Naresh");
        //access data from object

        System.out.println("Name = " +  p1.getName());
        System.out.println("Age = " +  p1.getAge());


    }
}
