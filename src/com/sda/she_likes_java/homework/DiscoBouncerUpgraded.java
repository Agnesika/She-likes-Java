package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class DiscoBouncerUpgraded {
    public static void main(String[] args) {
        System.out.println("Party time!");
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Tell me how old are You");
        String declineMessage = "Sorry, you don't comply with the rules for youngsters :)";

        int age = inputReader.nextInt();
        System.out.println("We need to know your height too!");
        System.out.println("Tell me how tall are You?");

        double height = inputReader.nextInt();

        System.out.println();

        boolean isAllowedToParty = age >= 18 && age <= 30 && height <= 1.5;

        if (isAllowedToParty) {
            System.out.println("Yeah. Welcome to the club of singing liliputs!");
            System.out.println("We are happy to see and hear you today");
        } else {
            System.out.println("declineMessage");
        }

    }
}

