package com.java.Object;
public class MyRectangle {
    // memeber variables hold the length of rectangle and breadth of rectangle

    private int length;
    private int breadth;

    // Constructor is used to initiantiate the object
    public MyRectangle(int length, int breadth) {
        this.setBreadth(breadth);
        this.setLength(length);
    }

    //getters and setters

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public static void main(String[] args) {

        // instantiate two rectangle objects with the same length and breadth

        MyRectangle rectangle1 = new MyRectangle(5, 10);
        MyRectangle rectangle2 = new MyRectangle(5, 10);


        if (rectangle1.equals(rectangle2)) {
            System.out.println("These two rectangles are 'equal'");
        } else {
            System.out.println("These two rectangles are 'not equal'");
        }


        // If we would like two rectangles to be 'EQUAL' if they have same length and breadth , we would need to verride the equals method of the object base class
//
//    public boolean equals(Object object){
//        if (object instanceof MyRectangle){
//            MyRectangle otherRectangle = (MyRectangle) object;
//            if (otherRectangle.breadth == this.breadth && otherRectangle.length == this.length){
//                return true;
//            }
//        }
//        return false;
//    }

        // are these two objects 'equal'
/*

== is an operator always goes with refrence equality
  .equals() is for  semantic  euqality we need to use .equals method

 */

    }

}
