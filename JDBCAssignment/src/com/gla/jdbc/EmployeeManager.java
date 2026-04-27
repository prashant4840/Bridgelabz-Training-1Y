package com.gla.jdbc;
import java.sql.*;
public class EmployeeManager {
 public static void main(String[] args) throws Exception {
  Connection con = DBConnection.getConnection();
  Statement st = con.createStatement();
  System.out.println("EmployeeManager running...");
  con.close();
 }
}

