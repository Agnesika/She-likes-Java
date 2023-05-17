package com.sda.she_likes_java.homework.e24_lt_lv_dictionary;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Scanner inputReader = new Scanner(System.in);


        String wordFromTheUser = inputReader.next();


        LatvianLithuanianDictionary.translation(wordFromTheUser);
//        String translation = LatvianLithuanianDictionary.get(wordLV);
//        System.out.println("My little LT-LV dictionary is like : " + translation);

        System.out.println("Can you tell me how to say " + "Crown" + " in Lithuanian");

        System.out.println("No, I am sorry, I am just a latvian lady doing lithuanian dictionary. All I now is those few words. " +
                "You will need to use G translator :) ");
        System.out.println("Yes, it is a small dictionary, but size doesn't matter, right? :) ");
    }
}


