package com.java.OCJP;

public class Prog5 {
    int a = 10; // non static variable
    // parameter for any method works as local variable
    void cal(int a) // local variable // a = 3
    {
        this.a  += 1; // compund assigned operator
        // this.a = this.a+1;
        //this.a is 10 so 10 + 1 = 11
        // inside the object the value will be 11
        System.out.println(++a); //  modify operators
        // this will not access non static member we use this to acess non static variable
        // direct acess it will look for local variable ie a = 3
        //++a = 4
    }

    public static void main(String[] args) {
        Prog5 t = new Prog5();
        t.cal(3);
    }

}


// non static variable gets memory allocation means in the process of object  creation
//Here execution starts from main method because no static variables & static blocks
//In the main method first right side data gets executed i.e new Prog5()
//once object vreated all the non static variables gets memory allocations inside the object
//next we are calling constructor since we dont have constructor automatically default constructor will execute
//non static method we should call with the help of Object
