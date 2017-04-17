package com.java.exception;

import java.io.IOException;

public class Test4 {

    //method

    public static void methodOne(int randomNumber) throws IOException, NullPointerException {
        if (randomNumber == 1) {
            throw new IOException("IO Exception");

        } else if (randomNumber == 2) {
            throw new NullPointerException("Null pointer Exception");
        }
    }
    public static void methodTwo(int randomNumber) throws IOException {
        try {
            methodOne(randomNumber);

        } catch (NullPointerException nex) {
            System.out.println("caught the null pointer exception inside methodTwo");
        }
    }

     public static void methodThree(int randomNumber) {
        try {
            methodTwo(randomNumber);
        }catch (IOException iox) {
            System.out.println("Caught IO  Exception inside methodThree");

    }

    // no try/catch needed at all

}

    public static void main(String[] args) {
        int randomNumber = (int)Math.ceil(Math.random()*10);
        methodThree(randomNumber);
        System.out.println(randomNumber);
    }


}





/*
1.IOException : used when trying to do input/output operation
2.NullPointer Exception : some argument which you expect to be not null was null
                          if you  don't know how to handle that null so you throw null pointer exceptions

Main <->method 3 <-> method 2 <->method 1 {something goes wrong}
          catch      Catch
           {IO}       {NPE}

 */

