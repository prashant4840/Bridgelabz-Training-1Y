package com.gla.generics-collections.problem13;

public class Main {
    public static void main(String[] args) {
        MarketplaceProduct<String> p = new MarketplaceProduct<>(1000);
        DiscountUtil.applyDiscount(p,10);
        System.out.println(p.price);
    }
}
