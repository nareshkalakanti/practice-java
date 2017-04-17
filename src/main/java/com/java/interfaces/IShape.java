package com.java.interfaces;

public interface IShape {

    //member functions
    public double getArea();
    public double getPerimeter();


//    default String getColor(){
//        return "Color.Red";
//    }

}









/*

The signature of a member functions includes
1) Member function name
2) parameter types
3)Exceptions thrown

BTW function signature doesnt include the return type
or access modifier (public,private etc)

4) Class then implements interfaces
5) which means that it includes implementations for every method signatire in the interface
6) Using default methods is incredibily simple,just mark the method with the default keyword
 */