package com.sda.she_likes_java.homework.exercises_4_14;

import java.util.Scanner;

public class DiscoBouncer {
    /*
    Exercise 9.
Bouncer in a disco
Prepare a new class BouncerInDisco and in it
- get the user’s age and height from the console
- only people who are at least 16 years old and taller (or shorter than - at your choice) can enter the disco
- print a text saying how the verification went in both cases
     */
    public static void main(String[] args) {
        System.out.println("Party time!");
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Tell me how old are You");


        int personAge = inputReader.nextInt();


        if (personAge >= 16) {
            System.out.println("We need to know your height too!");
            boolean condition = true;
            if (condition) {
                System.out.println("Thank you for showing the interest");
            } else {
                System.out.println("We need more information from you");
            }
            System.out.println("Tell me how tall are You?");

            double personHeight = inputReader.nextDouble();

            if (personHeight <= 1.5) {
                System.out.println("Yeah. Welcome to the club of liliputs!");
            } else {
                System.out.println("Sorry, this time we will miss you :(");
            }
        } else {
            System.out.println("Please go to the playground :)");
        }


    }
}
