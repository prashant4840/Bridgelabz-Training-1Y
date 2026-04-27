//package com.gla;
//
//import com.gla.Book;
//import java.util.ArrayList;
//import java.util.List;
//
//public class LibraryRepository {
//    private final List<Book> books = new ArrayList<>();
//
//    public void addBook(Book book) {
//        books.add(book);
//    }
//
//    public void removeBook(int id) {
//        books.removeIf(b -> b.getId() == id);
//    }
//
//    public List<Book> getBooks() {
//        return books;
//    }
//    public Book getBookById(int id) {
//        for (Book b : books) {
//            if (b.getId() == id) {
//                return b;
//            }
//        }
//        return null;
//    }
//}
package com.gla;

import java.sql.*;

public class LibraryRepository {

    public void addBook(Book book) {
        try {
            Connection con = DatabaseConnection.getConnection();

            String query = "INSERT INTO books(title, author, available) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setBoolean(3, true);

            ps.executeUpdate();

            System.out.println("Book added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewBooks() {
        try {
            Connection con = DatabaseConnection.getConnection();

            String query = "SELECT * FROM books";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

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