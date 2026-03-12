package com.gla.animal;

public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog("Tommy", 3, "DesiKutta");
        Dog d2 = new Dog("Tommy", 3, "DesiKutta");

        Animal a = d1;
        a.makeSound();

        System.out.println("Breed: " + d1.getBreed());
        System.out.println("Breed: " + d2.getBreed());

        System.out.println("Dogs equal: " + d1.equals(d2));
    }
}