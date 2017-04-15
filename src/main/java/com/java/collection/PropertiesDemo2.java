package com.java.collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException{
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("db.properties");
        p.load(fis);

        String url =p.getProperty("url");
        String user =p.getProperty("user");
        String pwd = p.getProperty("pwd");
        try {
            Connection con = DriverManager.getConnection(url,user,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
