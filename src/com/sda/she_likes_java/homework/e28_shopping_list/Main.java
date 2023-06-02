package com.sda.she_likes_java.homework.e28_shopping_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        products.add("bread");
        products.add("milk");
        products.add("mayonnaise");
        products.add("tea");
        products.add("coffee");
        products.add("chocolate");
        products.add("detergent");
        products.add("egg");
        products.add("candle");
        // addition from AI internal solution
        //, Comparator.comparingInt(String::length)
        Collections.sort(products);
        System.out.println("Sorted names alphabetically: " + products);

//        NameLength comparingProductsByNameLength = new NameLength();
//        Comparator<NameLength> comparingProductsByNameLength = new NameLength();
//        Collections.sort(products, new NameLength());
        System.out.println("Sorted names by their length: " + products);

    }
}
