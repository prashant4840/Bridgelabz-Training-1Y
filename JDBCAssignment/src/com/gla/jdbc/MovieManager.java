package com.gla.jdbc;
import java.sql.*;
public class MovieManager {
 public static void main(String[] args) throws Exception {
  Connection con = DBConnection.getConnection();
  Statement st = con.createStatement();
  System.out.println("MovieManager running...");
  con.close();
 }
}


