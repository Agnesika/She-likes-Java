package com.sda.she_likes_java.homework.e24_lt_lv_dictionary;

import java.util.HashMap;
import java.util.Map;

public class LatvianLithuanianDictionary {
    /*
    Homework:)
Create a class English-Lithuanian dictionary.
Requirements:
- the class has a translate method that takes an English word as an argument;
- add support for 10 words;
- if the user asks for an unsupported word - add a message about the lack of support.
Create a class Main and check the functionality of your class.
     */


    private static String translation;

    public static void LatvianLithuanianDictionary() {
        Map<String, String> translation = new HashMap<>();

        translation.put("ačiu", "paldies");
        translation.put("braliukas", "brāļi");
        translation.put("pelke", "purvs");
        translation.put("žirgas", "zirgs");
        translation.put("labas dienas", "labdien");
        translation.put("galva", "galva");
        translation.put("gerai", "labi");


    }

    public static void translation(String wordFromTheUser) {
    }


    public String getTranslation() {
        return translation;
    }

    public LatvianLithuanianDictionary(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "LatvianLithuanianDictionary{" +
                "translation='" + translation + '\'' +
                '}';
    }
}


