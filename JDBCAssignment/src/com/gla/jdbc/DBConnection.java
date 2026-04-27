package com.gla.jdbc;
import java.sql.*;
public class DBConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true",
                "root","Prashant@40");
        } catch(Exception e){ e.printStackTrace(); return null;}
    }
}

