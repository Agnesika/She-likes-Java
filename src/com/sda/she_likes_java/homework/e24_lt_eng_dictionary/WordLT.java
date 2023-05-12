package com.sda.she_likes_java.homework.e24_lt_eng_dictionary;

import java.util.List;
import java.util.Objects;

public class WordLT {
    private String wordLT;

    public WordLT(String wordLT) {
        this.wordLT = wordLT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordLT wordLT1 = (WordLT) o;
        return Objects.equals(wordLT, wordLT1.wordLT);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordLT);
    }

    @Override
    public String toString() {
        return "WordLT{" +
                "wordLT='" + wordLT + '\'' +
                '}';
    }
    public static void listLT(){
        List<WordLT> listLT = List.of(
                new WordLT("Ačiu"),
                new WordLT("Braliukas"),
                new WordLT("Pelke"),
                new WordLT("Žirgas"),
                new WordLT("Labas dienas"),
                new WordLT("Galva")
        );
    }
}
