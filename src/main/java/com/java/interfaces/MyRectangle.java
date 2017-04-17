package com.java.interfaces;

import com.java.interfaces.IShape;

public class MyRectangle implements IShape {

    private double m_length;
    private double m_breadth;

    public MyRectangle(double length , double breadth){
        this.m_length=length;
        this.m_breadth=breadth;
    }


    public double getArea() {
        return m_breadth*m_length;
    }

    public double getPerimeter() {
        return 2*(m_length+m_breadth);
    }
}
