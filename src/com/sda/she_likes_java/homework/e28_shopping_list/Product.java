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

//    @Override
//    public int compareTo(Product o) {
//        String product1 = o1.getProduct();
//        String product2 = o2.getProduct();
//        if (product < o.getProducts(String)) {
//            return -1;
//        } else if (product > o.getProducts(String)) {
//            return 1;
//        } else {
//            return 0;
//        }
    }



//    public String getProduct() {
//    return product;
//    }
//
//    public <T> Comparable<T> product() {
//    return product;
//    }
//}
