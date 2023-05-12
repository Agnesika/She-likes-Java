package com.sda.she_likes_java.homework.e24_lt_eng_dictionary;

public class Dictionary {
    /*
    Homework:)
Create a class English-Lithuanian dictionary.
Requirements:
- the class has a translate method that takes an English word as an argument;
- add support for 10 words;
- if the user asks for an unsupported word - add a message about the lack of support.
Create a class Main and check the functionality of your class.
     */

    private String translation;

    public Dictionary(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "translation='" + translation + '\'' +
                '}';
    }
}
