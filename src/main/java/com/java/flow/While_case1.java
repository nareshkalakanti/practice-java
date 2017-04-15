package com.java.flow;

//unreachable statement and keeps on executing
// a>b control comes to sop of hi
public class While_case1 {
    public static void main(String[] args) {
        int a=10,b=20;
        while (a>b){
            System.out.println("Hello");

        }
        System.out.println("Hi");
    }
}
