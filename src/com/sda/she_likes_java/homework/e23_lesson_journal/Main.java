package com.sda.she_likes_java.homework.e23_lesson_journal;

import java.util.HashMap;
import java.util.Map;

/*
Exercise 23:
Create a lesson journal:
- it should provide 3 methods
- provide a list of pupils
- provide a list of subjects
- provide the pupil’s grades in the subject.Think about what classes you will need.
What structures will you use to store the data: list, map, set.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("My little sister received these grades at school for the last semester");


        Map<String, Class> pupilGrades = new HashMap<>();
        printGrades(pupilGrades);
        pupilGrades.put("Madeira", new Class("Math", 7));
        pupilGrades.put("Madeira", new Class("Literature", 5));
        pupilGrades.put("Madeira", new Class("English", 9));
        pupilGrades.put("Madeira", new Class("Art", 4));
        pupilGrades.put("Madeira", new Class("History", 10));
        pupilGrades.put("Madeira", new Class("Sports", 6));
        printGrades(pupilGrades);

        System.out.println(" Madeira's grades are: " + pupilGrades);
    }

    public static void printGrades(Map<String, Class> gradesMap) {
        System.out.println("Let's start with known keys");
        System.out.println(gradesMap.get("my favourite jeans"));
        System.out.println("key=[Madeira] " + gradesMap.get("Madeira's grades"));

        System.out.println("Let's iterate the map");

//         Map.Entry represent key + value at once
        for (Map.Entry<String, Class> item : gradesMap.entrySet()) {
            System.out.println("Key: " + item.getKey());
            System.out.println("Value: " + item.getValue());
        }
    }
}

