package com.java.exception;

public class return_finally_2 {
    public static void main(String[] args) {
        System.out.println(m1());

    }

    public static int m1() {
        try {
            return 777;
        }
        catch (Exception e) {
            return 888;
        }
        finally {
            return 999;
        }
    }
}

//system.exit(0) : JVM will shutdown in this case finally block wont be executed

