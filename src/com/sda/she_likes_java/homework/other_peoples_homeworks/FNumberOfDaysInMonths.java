package com.sda.she_likes_java.controls;

import java.util.Scanner;

public class FNumberOfDaysInMonths {
    public static void main(String[] args) {
        System.out.println("Hey! Tell me the number of the month:");
        Scanner inputReader = new Scanner(System.in);
        int monthNumber = inputReader.nextInt();
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("There are 31 days in this month");
                break;
            case 2:
                System.out.println("what Year is it?");
                int year = inputReader.nextInt();
                if (year % 4 == 0) {
                    System.out.println("there are 29 days this year");
                } else {
                    System.out.println("There are 28 days in this month");
                }
                break;
            case 4, 6, 9, 11:
                System.out.println("There are 30 days in this month");
                break;
            default:
                System.out.println("Don't cheat!");
        }
    }
}