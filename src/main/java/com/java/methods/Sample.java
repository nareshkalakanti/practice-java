package com.java.methods;

public class Sample {

//    //instance variables
//
//    private double num1,num2;
//
//    //parameterized constructor
//    Sample(double x , double y)
//    {
//        num1 =x;
//        num2 = y;
//    }
//    //method to claucu,ate sum num1,num2
//    //this method does not accept any values and
//    //does not retun result

      //static method should be declared as static
   static double sum(double num1 , double num2)
    {
        double res = num1+num2;
        return res; // return result
    }

}

class Methods
{
    public static void main(String[] args) {
        //create an object and pass values 10 and 22.5 to constructor
        //they will be stored into num1, num2
       // Sample s = new Sample();
        //call the method and pass two values
        //call the method and store the result in x
        //call static method by using classname.method()
        double x = Sample.sum(10,22.5);
        System.out.println("Sum= " + x);
    }
}
