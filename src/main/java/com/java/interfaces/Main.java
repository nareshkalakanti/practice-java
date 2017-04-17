package com.java.interfaces;

import com.java.interfaces.IShape;
import com.java.interfaces.MyCircle;
import com.java.interfaces.MyRectangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //we can instantiate a few objects of type MyCircle and MyRectangle
        MyRectangle myRec = new MyRectangle(5,4);
        MyCircle myCircle = new MyCircle(10);

        // note we cannot instantiaate an object of an interface!

        // create a list of shapes using interface
       //<IShape> specifies the type of object that will be in the list
        List<IShape> myshapeList = new ArrayList<IShape>();
        myshapeList.add(myRec);
        myshapeList.add(myCircle);
        for (IShape someShape:myshapeList) {
            System.out.println("Area of this shape = " +someShape.getArea()+ ","+ "Perimeter if this shape = " + someShape.getPerimeter());
        }
        //we can instantiate an object for MyRectangle and MyCircle and put in a variable type
        //IShape

        IShape someOtherShape = new MyRectangle(12,12);
        System.out.println("Area of this shape = " +someOtherShape.getArea()+ ","+ "Perimeter if this shape = " + someOtherShape.getPerimeter());

        IShape mySquare = new Mysquare(4);
        System.out.println("Area of this shape = " +mySquare.getArea()+ ","+ "Perimeter if this shape = " + mySquare.getPerimeter());


    }
}
