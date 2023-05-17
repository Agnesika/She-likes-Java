package com.sda.she_likes_java.homework.e24_lt_lv_dictionary;

public class WordsBaltic {
    private String wordLT;
    private String wordLV;
    private String translation;

    public String getWordLT() {
        return wordLT;
    }

    public String getWordLV() {
        return wordLV;
    }

    public String getTranslation() {
        return translation;
    }

    public WordsBaltic(String translation) {
        this.translation = translation;
    }

    public WordsBaltic(String wordLT, String wordLV) {
        this.wordLT = wordLT;
        this.wordLV = wordLV;
    }

    @Override
    public String toString() {
        return "WordsBaltic{" +
                "wordLT='" + wordLT + '\'' +
                ", wordLV='" + wordLV + '\'' +
                '}';
    }

}
