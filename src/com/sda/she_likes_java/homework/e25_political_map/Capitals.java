package com.sda.she_likes_java.homework.e25_political_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Capitals {
    private static final Map<String, String> capitals = new HashMap<>();

//    public Capitals(Map<String, String> capitals) {
//        this.capitals = capitals;
//    }

    public Capitals() {
        capitals.put("Malta", "Valetta");
        capitals.put("Lao", "Vientiane");
        capitals.put("Dominica", "Roseau");
        capitals.put("India", "Deli");
        capitals.put("Romania", "Bucharest");

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Provide the country to connect with the capital: ");
        String wordFromTheUser = inputReader.next();
        Capitals.matchNames(wordFromTheUser);
    }

    public static void matchNames(String country){
        String capital = capitals.get(country);
        if (capital != null) {
            System.out.printf("Country: [%s] has a capital [%s]%n", country, capital);

        } else {
            System.out.printf("Don't know the capital of country [%s]%n", country);
        }
    }
}
