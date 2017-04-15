package com.java.collection;

public interface Map {
    interface Entry {
        Object getKey();
        Object getValue();
        Object SetValue(int i);


    }
}


// Map is collection of Entry Objects
//Entry(I) methods are written above
//Without Map object there is no chance of Entry Object hence Entry Intraface is defined inside Map(I)