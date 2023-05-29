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
        //, Comparator.comparingInt(String::length)
        Collections.sort(products);
        System.out.println("Sorted names: " + products);

    }
}
