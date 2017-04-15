package com.java.flow;

public class SwitchcaseA {
    public static void main(String[] args) {
        byte b =10;
        switch (b+1){
            case 10:
                System.out.println("10");
                break;
            case 100:
                System.out.println("100");
                break;
            case 1000:
                System.out.println("1000");
                break;
        }
    }

}
//case label:
//1.It should be compile time constant
//2.Expression also allowed but should be constant expression
//3.Value should be with the range of switch argument type
//4.Duplicated are not allowed