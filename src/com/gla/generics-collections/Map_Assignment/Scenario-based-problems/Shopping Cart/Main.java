package com.gla.generics-collections.map_assignment.shopping_cart;

public class Main {
    public static void main(String[] args) {

        ShoppingCart c = new ShoppingCart();

        c.addItem("Laptop",6000);
        c.addItem("Mouse",500);

        c.display();
        c.total();
    }
}
