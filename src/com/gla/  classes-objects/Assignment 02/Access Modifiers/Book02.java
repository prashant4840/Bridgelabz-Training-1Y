package com.gla.methods;

class Book02 {

    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {

    void display() {
        System.out.println(ISBN + " " + title);
    }
}

class TestBook {
    public static void main(String[] args) {

        EBook b = new EBook();

        b.ISBN = "123";
        b.title = "Java";
        b.setAuthor("James");

        b.display();
        System.out.println(b.getAuthor());
    }
}
