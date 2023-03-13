package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class DiscoBouncerUpgraded {
    public static void main(String[] args) {
        System.out.println("Party time!");
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Tell me how old are You");
        String declineMessage = "Sorry, you don't comply with the rules for youngsters :)";

        int personAge = inputReader.nextInt();
        System.out.println("We need to know your height too!");
        System.out.println("Tell me how tall are You?");

        double personHeight = inputReader.nextDouble();


                System.out.println();

        if (personHeight <= 1.5) {
            System.out.println("Yeah. Welcome to the club of singing liliputs!");
        } else {
            System.out.println("Sorry, this time we will miss you :(");
        }


        if (personAge >=16 && personAge <=30 && personHeight <= 1.5) {

            boolean isAllowedParty = true;
            if (isAllowedParty) {
                System.out.println("We are happy to see and hear you today");
            } else {
                System.out.println(declineMessage);
            }

        } else {
            System.out.println("declineMessage");
        }

        String singingSkills = inputReader.next();

        System.out.println("Let's see weather you can sing or not");
        System.out.println("Can you sing an opera?");
        boolean canSing = true;
        boolean onlyLullaby = false;
        boolean singer = canSing || onlyLullaby;
        System.out.println("true || false is: " + singer);


    }
}
