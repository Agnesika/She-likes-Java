package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class DiscoBouncerV2 {
    public static void main(String[] args) {
        System.out.println("Party time?");

        System.out.println("Somebody is coming to the club");
        System.out.println("Hi, how old are you?");

        Scanner inputReader = new Scanner(System.in);
        String declineMessage = "Sorry, go home :) ";

        int age = inputReader.nextInt();

        if (age >= 18) {
            System.out.println("OK, so you are an adult");
            System.out.println("Let me know your height");
            double height = inputReader.nextDouble();
            if (height >= 200) {
                System.out.println("Great! Welcome to the party!");
            } else {
                System.out.println("declineMessage");
            }

        } else {
            System.out.println(declineMessage);
        }
    }
}
