package com.gla;

public class LibraryService {

    private LibraryRepository repo = new LibraryRepository();

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        repo.addBook(book);
    }

    public void viewBooks() {
        repo.viewBooks();
    }
}