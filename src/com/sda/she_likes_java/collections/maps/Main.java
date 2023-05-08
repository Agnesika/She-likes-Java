package com.sda.she_likes_java.collections.maps;

import com.sda.she_likes_java.collections.Person;
import com.sda.she_likes_java.collections.Trousers;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Maps are like dictionaries");

        // type of the key is String
        // type of the value is Trousers
        Map<String, Trousers> myJeans = new HashMap<>();
        // key: "my favourite jeans"
        // value: new Trousers("jeans", "big star")
        myJeans.put("my favourite jeans", new Trousers("jeans", "big star"));
        myJeans.put("my old one", new Trousers("wool", "Primemark"));
        myJeans.put("my old one", new Trousers("wool", "Primemark II"));

        printMyJeans(myJeans);
        Map<Person, Trousers> personsTrousers = new HashMap<>();
        personsTrousers.put(new Person("Agnese", "Fomrate"), new Trousers("cotton", "Levis"));
        personsTrousers.put(new Person("Gita", "Mazkalne"), new Trousers("silk", "Boomer"));

        System.out.println("Person's trousers " + personsTrousers);
    }

    public static void printMyJeans(Map<String, Trousers> trousersMap) {
        System.out.println("Let's start with known keys");
//        System.out.println(trousersMap.get("my favourite jeans"));
//        System.out.println(trousersMap.get("stupid key"));
        System.out.println("key=[my favourite jeans] " + trousersMap.get("my favourite jeans"));
        System.out.println("key=[stupid key] " + trousersMap.get("stupid key"));


        System.out.println("Let's iterate the map");
        // Map.Entry represent key + value at once
        for (Map.Entry<String, Trousers> item : trousersMap.entrySet()) {
            System.out.println("Key: " + item.getKey());
            System.out.println("Value: " + item.getValue());
        }
    }
}

