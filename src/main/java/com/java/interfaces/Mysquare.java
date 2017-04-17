package com.java.interfaces;

public class Mysquare  extends  MyRectangle{

    //MyRectangle is a base class

    private double m_side;
    public Mysquare(double side) {
        super(side,side);
        // basically 'super' is a way of calling constructor of MyRectangle
        this.m_side=side;

    }


}
