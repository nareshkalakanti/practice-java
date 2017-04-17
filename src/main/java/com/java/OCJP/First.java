package com.java.OCJP;

class First {

    static int a = Second.initialize();

    static {
        System.out.println("First PersonTest loading ....");
    }

    public static void main(String[] args) {
        System.out.println("main method ...");
        System.out.println("First-a val:" + First.a);
        System.out.println("Second-a val:" + Second.a);

    }

    static int initialize() {
        System.out.println("First initialize");
        return First.a + 100;
    }
}

class Second

{
    // intialize with 0 // replaced with 100
    static int a = First.initialize();

    static {
        System.out.println("Second class loading");
    }

    //stop executing and start loading the class
    static int initialize() {
        System.out.println("Second initialize");
        return Second.a + 200;
    }


}
//First execution starts from the class were we have defined main method
//static variable and static block same priority
// at the time of class loadings static variable initializes with 0
// so int a ->0 next right side data i.e  Second.initialize() we are calling control moves to Second class but class is not loaded
//The advantage of java application is when multiple classes are connected in one application
// all the classes will not be loaded at a time when ever we access particular member of the class by that time class will be loaded
//