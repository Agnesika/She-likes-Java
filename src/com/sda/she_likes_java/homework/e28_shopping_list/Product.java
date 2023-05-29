package com.sda.she_likes_java.homework.e28_shopping_list;

import java.util.Objects;

public class Product {
    private String product;

    public Product(String products) {
        this.product = products;
    }

    public String getProducts(String s) {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "ShoppingList{" +
                "products='" + product + '\'' +
                '}';
    }

//    public String getProduct() {
//    return product;
//    }
//
//    public <T> Comparable<T> product() {
//    return product;
//    }
}
