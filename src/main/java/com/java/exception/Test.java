package com.java.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("abc.txt");
                pw.println("Hello");
        System.out.println(10/0);
    }
}
