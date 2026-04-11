package com.gla.generics-collections.problem13;

public class DiscountUtil {
    public static <T extends MarketplaceProduct<?>> void applyDiscount(T product, double percentage){
        product.price -= product.price * percentage / 100;
    }
}
