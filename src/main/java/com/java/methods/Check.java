package com.java.methods;

//passing primitive datatypes

public class Check {
    // to interchange num1 and num 2values
    void swap(int num1 , int num2)
    {
        int temp; // temperory variable
        temp = num1;
        num1 = num2;
        num2 = temp;
    }

}

class PassPrimitive{
    public static void main(String[] args) {
        //take two primitive datatypes
        int num1 =10 , num2 = 20;
        //create class object
        Check obj = new Check();
        //display data before calling
        System.out.println(num1+"\t"+num2);
        //call and swap and pass primitive data types
        obj.swap(num1,num2);
        //display data after calling
        System.out.println(num1+"\t"+num2);
    }
}
