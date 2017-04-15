package com.java.exception;

public class return_finally {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            return;
        }
        catch (ArithmeticException e) {
            System.out.println("catch");
            return;
        }
        finally {
            System.out.println("finally");
        }
    }
}
