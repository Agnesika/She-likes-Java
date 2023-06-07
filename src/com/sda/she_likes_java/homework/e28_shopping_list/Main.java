package com.sda.she_likes_java.homework.e28_shopping_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("bread"));
        products.add(new Product("milk"));
        products.add(new Product("mayonnaise"));
        products.add(new Product("tea"));
        products.add(new Product("coffee"));
        products.add(new Product("chocolate"));
        products.add(new Product("detergent"));
        products.add(new Product("egg"));
        products.add(new Product("candle"));
        // addition from AI internal solution
        //, Comparator.comparingInt(String::length)
//        Collections.sort(products, Comparator.comparingInt(products); // MP: cannot sort if class doesn't implement Comparable
        System.out.println("Sorted names alphabetically: " + products);

//        NameLength comparingProductsByNameLength = new NameLength();
//        Comparator<NameLength> comparingProductsByNameLength = new NameLength();
        Collections.sort(products, new NameLength());
        System.out.println("Sorted names by their length: " + products);

    }


}
