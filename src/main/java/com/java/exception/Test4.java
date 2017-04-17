package com.java.exception;

import java.io.IOException;

public class Test4 {

    //method

    public static void methodOne(int randomNumber) throws IOException,NullPointerException {
        if (randomNumber ==1)
        {
            throw new IOException("IO Exception");

        }else if (randomNumber == 2){
            throw new NullPointerException("Null pointer Exception");
        }
    }


}

