package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class DiscoBouncerUpgraded {
    /*
    Exercise 10.
A story about bouncers in a disco
Prepare a new class BouncersInDiscoStory and in it
- get the user’s age, ability to sing well and height from the console
- there are two bouncers in the disco: young and old
- Young checks if the person is adult, tall (or short :)) and can sing well
- Old has some kind of sight problem - so if any of the conditions are met, the person can enter the disco
- people try to cheat, so if someone is rejected by the young bouncer they try again with the old one:)
     */
    public static void main(String[] args) {
        System.out.println("Party time!");
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Tell me how old are You");
        String declineMessage = "Sorry, you don't comply with the rules for youngsters :)";

        int age = inputReader.nextInt();
        System.out.println("We need to know your height too!");
        System.out.println("Tell me how tall are You?");

        double height = inputReader.nextDouble();
        System.out.println("Can You sing well? ");
        boolean isAbleToSingWell = inputReader.nextBoolean();

        System.out.println();

        boolean isAllowedToParty = (age >= 18 && age <= 30) && height <= 1.5 && isAbleToSingWell == true;

        if (isAllowedToParty) {
            System.out.println("Yeah! Welcome to the club of singing liliputs!");
            System.out.println("We are happy to see and hear you today");
        } else {
            System.out.println("Sorry, you are not allowed");
        }
        System.out.println("But I really want to party");
        System.out.println("I gonna go to the second bouncer");
        System.out.println("We need some information from you");

        System.out.println("Tell me how old are You");
        age = inputReader.nextInt();

        System.out.println("And what is your height?");
         height = inputReader.nextDouble();

        System.out.println("Can You sing well? ");
         isAbleToSingWell = inputReader.nextBoolean();

        boolean canEnterTheParty = (age >= 18 && age <= 30) && height <= 1.5 && isAbleToSingWell;

        if (canEnterTheParty) {
            System.out.println("Welcome to the club of singing liliputs!");
            System.out.println("We are happy to see and listen at you today");
        } else {
            System.out.println(declineMessage);
        }



    }
}

