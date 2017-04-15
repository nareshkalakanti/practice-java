package com.java.exception;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println("try"); // risky code
            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("catch");  // handling code
        }
        finally {
            System.out.println("finally");  //clean up code
        }
    }
}
