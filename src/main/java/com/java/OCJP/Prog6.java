package com.java.OCJP;

public class Prog6 {
    public static void main(String[] args) {
        int i = 10; // decalring i  and intializing with 10
        // i = 11 , 12 , 13 , 14, 15
        while(i++ <=12) // modify operator post increment
            // execute as long condition is trues
           // 10 <=12

        {
            i++; // 10 ++ repeat the loop s
        }
        System.out.println("i value :" + i );
    }
}

// block is going to execute a block repeatedly as long as the condtion is true
// i = 10 , post increment = first substitute the value and later increase
//          pre increment =  fisrt increase value and substiture the value