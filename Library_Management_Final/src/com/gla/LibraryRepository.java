package com.gla;

import java.sql.*;

public class LibraryRepository {

    public void addBook(Book book) {

        String query = "INSERT INTO books(title, author, available) VALUES (?, ?, ?)";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            if (con == null) {
                System.out.println("Connection is null!");
                return;
            }

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setBoolean(3, true);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Book added to database!");
            } else {
                System.out.println("Insert failed!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewBooks() {

        String query = "SELECT * FROM books";

        try (Connection con = DatabaseConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            System.out.println("\n--- BOOK LIST ---");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("title") + " | " +
                                rs.getString("author") + " | " +
                                rs.getBoolean("available")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}