package com.sda.she_likes_java.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ListSecondExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Karolina");
        names.add("Ramune");
        names.add("Inese");
        names.add("Agnese");

        printNames(names);
        System.out.println("---------");
        printOnlySomeNames(names);
    }

    public static void printNames(List<String> names) {
        for (String singleName : names) {
            System.out.println("name is: " + singleName);
        }
    }

    public static void printOnlySomeNames(List<String> names) {
        // starting from position number 1 - second item
        for (int index = 1; index < names.size()-1; index++) {
            System.out.println("name is: " + names.get(index));
        }
    }
}