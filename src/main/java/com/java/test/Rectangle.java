package com.java.test;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length , double breadth)
    {
        this.breadth=breadth;
        this.length=length;
    }

    public  double getArea(){
        return 2 * length * breadth;
    }

    public double getOutline(){
        return 2 * length * breadth;
    }

}
