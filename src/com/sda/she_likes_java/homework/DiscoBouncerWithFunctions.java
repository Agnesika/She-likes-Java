package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class DiscoBouncerWithFunctions {
    public static void main(String[] args) {
        int age;
        double height;
        boolean isAbleToSingWell;

        System.out.println("Party time!");
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Tell me how old are You");
        String declineMessage = "Sorry, you don't comply with the rules for youngsters :)";

        age = inputReader.nextInt();
        System.out.println("We need to know your height too!");
        System.out.println("Tell me how tall are You?");

        height = inputReader.nextDouble();
        System.out.println("Can You sing well? ");
        isAbleToSingWell = inputReader.nextBoolean();

        System.out.println();

        boolean isAllowedToParty = checkedByYoungBouncer(age, height, isAbleToSingWell);

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

        boolean canEnterTheParty = checkedByOldBouncer(age, height, isAbleToSingWell);

        if(canEnterTheParty)
        {
            System.out.println("Welcome to the club of singing liliputs!");
            System.out.println("We are happy to see and listen at you today");
        } else

        {
            System.out.println(declineMessage);
        }

    }
    public static boolean checkedByYoungBouncer(int age, double height, boolean isAbleToSingWell) {
        return (age >= 18 && age <= 30) && height <= 1.5 && isAbleToSingWell == true;
    }

    public static boolean checkedByOldBouncer(int age, double height, boolean isAbleToSingWell) {
        return (age >= 18 && age <= 30) && height <= 1.5 && isAbleToSingWell == true;
    }


}


