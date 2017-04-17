package com.java.OCJP;

public abstract class GraphicObject {

    //decalre fields
    //declare nonabstract methods

    // An abstract method is marked abstract , has no curly braces , simply a semi colon
    // Abstract base classes can never be initiated but they can be extended
    abstract void draw();

    // No this code below will not compile
    //GraphicObject graphicObject = new GraphicObject() ;

    // Yep this code will work in Java
  //  public class ConcreteGraphicObject extends GraphicObject{
    // Aa Java Class can implement any number of Interfaces, but extends only one Abstract base class

    }



