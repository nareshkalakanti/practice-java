package com.java.interfaces;

public class MyCircle implements IShape {


    // Mycircle class should have implementations of the two methods
    // that are available in Ishape interface, getArea & getPerimeter


    //Static member variable common accross all the objects of class Mycircle
    //final indicates it value cant be chaged
    public static final double S_PI=3.1415;
    private double m_radius;

    public MyCircle(double radius){
        this.m_radius=radius;
    }


    public double getArea() {
        return S_PI*m_radius*m_radius;
    }

    public double getPerimeter() {
        return S_PI * 2 * m_radius;
    }

    public static void main(String[] args) {

        //when a class implements an interface The class "IS-A" object of that Interface

        IShape myCircle = new MyCircle(10);
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getPerimeter());

        // now we could have objects of diffrent classes , all of which implement an interface, and trear them all the same
       // Ablity to take diffrent forms is called polymorphism
        IShape someShape= new MyCircle(10);
        System.out.println(someShape.getArea());

        //someShape = new MyRectange(5,10);
        System.out.println(someShape.getArea());

    }
}







/*
Note : that an interface cannot be instantiated directly
       it can only be instantiated via an Object of some class that implements that interface
 */