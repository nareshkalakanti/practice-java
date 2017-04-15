package com.java.exception;

public class Test3 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            e.printStackTrace(); //Name of exception : description followed by stact trace
            System.out.println(e);
            System.out.println(e.toString()); // Name of Exception :description
            System.out.println(e.getMessage()); // description
        }
    }
}
