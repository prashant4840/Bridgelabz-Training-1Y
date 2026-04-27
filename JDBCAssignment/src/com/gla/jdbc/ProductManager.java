package com.gla.jdbc;
import java.sql.*;
public class ProductManager {
 public static void main(String[] args) throws Exception {
  Connection con = DBConnection.getConnection();
  Statement st = con.createStatement();
  System.out.println("ProductManager running...");
  con.close();
 }
}


