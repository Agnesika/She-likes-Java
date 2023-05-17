package com.sda.she_likes_java.homework.e25_political_map;

import java.util.HashMap;
import java.util.Map;

public class Capitals {
    private Map<String, String> capitals = new HashMap<>();

//    public Capitals(Map<String, String> capitals) {
//        this.capitals = capitals;
//    }

    public Capitals(Map<String, String> capitals) {
        this.capitals = capitals;
    }

    public void matchNames(String country) {
        String capital = capitals.get(country);
        if (capital != null) {
            System.out.printf("Country: [%s] has a capital [%s]%n", country, capital);

        } else {
            System.out.printf("Don't know the capital of country [%s]%n", country);
        }
    }
}

