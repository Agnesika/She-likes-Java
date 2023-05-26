package com.sda.she_likes_java.homework.e28_shopping_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        Collections.sort(products, Comparator.comparingInt(String::length));
        System.out.println("Sorted names: " + products);

    }
}