package com.sda.she_likes_java.homework.exercises_4_14;

import java.util.Scanner;

public class DiscoBouncerV5 {
    public static void main(String[] args) {
        System.out.println("Party time???");

        System.out.println("Somebody is coming to club");
        System.out.println("Hi, how old are You: ");

        Scanner inputReader = new Scanner(System.in);
        String declineMessage = "Sorry, go home:)";
        int age = inputReader.nextInt();
        System.out.println("Let me know Your height now: ");

        // . or , is selected based on region settings in You OS
        double height = inputReader.nextDouble();
        boolean isAllowedToParty = age >= 18 && height >= 200;

        if (!isAllowedToParty) {
            System.out.println(declineMessage);
        } else {
            System.out.println("Have a great time at party!!!");
        }
    }
}