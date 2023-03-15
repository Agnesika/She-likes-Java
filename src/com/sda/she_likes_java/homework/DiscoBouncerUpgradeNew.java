package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class DiscoBouncerUpgradeNew {

    public static void main(String[] args) {
        System.out.println("Party time???");

        System.out.println("Somebody is coming to club");
        System.out.println("Hi, how old are You: ");

        Scanner inputReader = new Scanner(System.in);
        String declineMessage = "Sorry, you don't comply with the rules for youngsters :)";

        int age = inputReader.nextInt();
        System.out.println("Let me know Your height now: ");
        double height = inputReader.nextDouble();
        System.out.println("Can You sing well? ");
        boolean isAbleToSingWell = inputReader.nextBoolean();
        boolean isAllowedToParty = age >= 18 && age <=30 && height <= 1.5 && isAbleToSingWell ==true;

        if (isAllowedToParty) {
            System.out.println("Yeah. Welcome to the club of singing liliputs!");
            System.out.println("We are happy to see and hear you today");
        } else {
            System.out.println(declineMessage);
        }
    }
}