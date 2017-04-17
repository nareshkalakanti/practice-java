package com.java.test;

public class Circle {
    private double radius;

    public Circle(double radius)
    {
        this.radius=radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public double getOutline(){
        return 2 * 3.14 * radius;
    }

}
