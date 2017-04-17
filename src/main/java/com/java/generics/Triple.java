package com.java.generics;

public class Triple<T> {

    //Simply create a class to hold three numbers
    //create a class to hold 3 strings
    //Creating a Generic Class is only write once and still maintains complete type safety
    // <T> is called type parameter , T is like a place holder this class is templatetized and is a generic class
    // IN  the body of the class we replace with the type user specifies

    // 3- member variables of type T
    private T first;
    private T second;
    private T third;

// 3 -setter and getter numbers of type T

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public static void main(String[] args) {
        Triple<Double> threeNumbers = new Triple<Double>();
        Triple<String> threeStrings = new Triple<String>();

    }
}
