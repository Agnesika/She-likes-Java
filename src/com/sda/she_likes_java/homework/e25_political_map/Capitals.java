package com.sda.she_likes_java.homework.e25_political_map;

import java.util.HashMap;
import java.util.Map;

public class Capitals {
    private final Map<String, String> capitals;

    public Capitals(Map<String, String> capitals) {
        this.capitals = capitals;
    }

    public Capitals() {
        capitals = new HashMap<>();

        capitals.put("Malta", "Valetta");
        capitals.put("Lao", "Vientiane");
        capitals.put("Dominica", "Roseau");
        capitals.put("India", "Deli");
        capitals.put("Romania", "Bucharest");


    }
    public void connect(String country){
        String capital = capitals.get(country);
        if (capital != null) {
            System.out.printf("Country: [%s] has a capital [%s]%n", country, capital);

        } else {
            System.out.printf("Don't know the capital of country [%s]%n", country);
        }
    }
}
