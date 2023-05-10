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
        System.out.println("---------");
        printNamesWithSemicolon(names);
    }

    public static void printNames(List<String> names) {
        for (String singleName : names) {
            System.out.println("name is: " + singleName);
        }
    }

    public static void printOnlySomeNames(List<String> names) {
        // starting from position number 1 - second item
        for (int index = 1; index < names.size()-1; index++) {
            System.out.println("Printed some names: " + names.get(index));
        }
    }

    // name1, name2, name3
    public static void printNamesWithSemicolon(List<String> names) {
        String result = names.get(0);
        for (int i = 1; i < names.size(); i++) {
            result +="; " +  names.get(i);

        }
        System.out.println(result);
    }

    // Finding item inside the list
}