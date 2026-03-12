package com.gla.animal;

public class Dog extends Animal {
    private String breed;
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public String getBreed() {
        return breed;
    }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            Dog d = (Dog) obj;
            return this.name.equals(d.name) &&
                    this.age == d.age &&
                    this.breed.equals(d.breed);
    }
}
