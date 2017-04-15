package com.java.flow;

public class Break_Lab_blocks {
    public static void main(String[] args) {
        int x =10;
        l1:
        {
            System.out.println("begin block");
            if (x==10)
                break l1;
            System.out.println("end");
        }
        System.out.println("hello");
    }
}



// To break block exec based on some conditions