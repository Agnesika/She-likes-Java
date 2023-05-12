package com.sda.she_likes_java.homework.e24_lt_eng_dictionary;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lets translate some words in 2 foreign, but familiar languages :) ");


        Map<String, String> translations = new HashMap<>();

        translations.put("Ačiu", "Thank You");
        translations.put("Braliukas", "Brothers");
        translations.put("Pelke", "Swamp");
        translations.put("Žirgas", "Horse");
        translations.put("Labas dienas", "Good afternoon");
        translations.put("Galva", "Head");

        System.out.println("My little LT-ENG dictionary is like : " + translations);

        System.out.println("Can you tell me how to say " + "Crown" + " in Lithuanian");

        System.out.println("No, I am sorry, I am just a latvian lady doing lithuanian dictionary. All I now is those 6 words. " +
                "You will need to use G translator :) ");
        System.out.println("Yes, it is a small dictionary, but size doesn't matter, right? :) ");
    }
}
