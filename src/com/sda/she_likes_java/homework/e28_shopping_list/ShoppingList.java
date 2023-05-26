package com.sda.she_likes_java.homework.e28_shopping_list;

import java.util.Objects;

public class ShoppingList {
    private String products;

    public ShoppingList(String products) {
        this.products = products;
    }

    public String getProducts(String s) {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingList that = (ShoppingList) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "ShoppingList{" +
                "products='" + products + '\'' +
                '}';
    }
}
