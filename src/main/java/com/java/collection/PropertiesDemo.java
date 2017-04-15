package com.java.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("abc.properties");
        p.load(fis);
        System.out.println(p);
        String s = p.getProperty("Venki");
        System.out.println(s);
        p.setProperty("nag","9999");
        FileOutputStream fos = new FileOutputStream("abc.properties");
        p.store(fos,"Updated by naresh for properties demo");
    }
}
