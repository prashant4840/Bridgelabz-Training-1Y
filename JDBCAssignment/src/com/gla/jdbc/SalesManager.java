package com.gla.jdbc;
import java.sql.*;
public class SalesManager {
 public static void main(String[] args) throws Exception {
  Connection con = DBConnection.getConnection();
  Statement st = con.createStatement();
  System.out.println("SalesManager running...");
  con.close();
 }
}



