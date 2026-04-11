package com.gla.generics-collections.java_collection_assignment.problem16_ecommerce_system;

public class Order {
    int id;

    public Order(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Order)) return false;
        return id == ((Order)o).id;
    }

    @Override
    public int hashCode(){
        return id;
    }
}
