package com.java.methods;

public class Primes {
    //to test and return true if num is prime

    static boolean prime(long num)
    {
        //initally isPrime is true, it becomes false if
        // num is not prime
        boolean isPrime = true;
        for (int i=2; i<=num-1 ;i++)
            if (num % i ==0) isPrime =false;
        return isPrime;

    }
}
