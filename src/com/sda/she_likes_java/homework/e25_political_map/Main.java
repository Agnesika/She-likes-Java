package com.sda.she_likes_java.homework.e25_political_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    /*
    Exercise 25
9:40
Create the Cities Countries class
- class should have the following methods
- give names of countries
- give the cities in given country
- use appropriate structures to hold the data
Create a Main class to test your class
9:40
have fun
     */
    public static void main(String[] args) {
        System.out.println("Let's learn some political geography");




//        String capitals = Capitals.get(country);

        Capitals politicalMap = new Capitals(provideTestData());
        politicalMap.matchNames("Romania");
        politicalMap.matchNames("Malta");
        politicalMap.matchNames("Latvia");

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Provide the country to connect with the capital: ");
        String wordFromTheUser = inputReader.next();
        politicalMap.matchNames(wordFromTheUser);
    }

    public static Map<String, String> provideTestData(){
        final Map<String, String> capitals = new HashMap<>();
        capitals.put("Malta", "Valetta");
        capitals.put("Lao", "Vientiane");
        capitals.put("Dominica", "Roseau");
        capitals.put("India", "Deli");
        capitals.put("Romania", "Bucharest");


        return capitals;
    }
}
