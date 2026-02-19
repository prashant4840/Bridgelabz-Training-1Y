package com.gla;

public class Library {
   private int quantity;
   private Admin admin ;

    private LibraryRepositories libraryRepositories = new LibraryRepositories();


    public int getQuantity() {
        return quantity;
    }

    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
