package com.java.oops;

public class Musketeer {

    //member variables => static or non-static
    //non-static member variable is associated with object of a class
    //define state of musketeer object
    private String m_name;
    private int m_age;

    //Constructor - constructs an object
    //member fun of classes and they can take in argugemts to construct the objects
    public Musketeer(String name,int age){
        this.setName(name);
        this.m_age=age;

        //'this' is used to disambiguate member variables of this class
        //for instance had the arguments been named 'm_name' and 'm_age',instead of
        //'name and 'age', a statement like this.m_age=m_age' would have taken value of function argument

    }
    //static member variable is shared across all object of the class

    public  static final int S_DEFAULT_AGE=35;

    public static final String S_DEFAULT_NAME="unknown Soldier";

    public Musketeer() {
        //no argument constructor , populates all member variables
        this.setAge(S_DEFAULT_AGE);
        this.setName(S_DEFAULT_NAME);

    }


    //create a second constructor that takes in only the name ,assigns a
    //default agae

    public Musketeer(String name) {
        this.setName(name);
        this.m_age=S_DEFAULT_AGE;

    }


    //In order to have name and age to be available for outside this class we need to have member func
    //called getter and setters

    public void setAge(int age) {
        this.m_age = age;
    }


    public int getAge() {
        return this.m_age;
    }

    public String getName() {
        return m_name;
    }

    public void setName(String m_name) {
        this.m_name = m_name;
    }}




