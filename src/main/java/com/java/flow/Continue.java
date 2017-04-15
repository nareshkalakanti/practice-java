package com.java.flow;

public class Continue {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            if (i%2==0)
                continue;  // skip current iteration and continue for next iteration
            System.out.println(i);
        }
    }
}

