package com.sda.she_likes_java.loops.while_loop;

public class WhileLoop {
    public static void main(String[] args) {
        // how to make our calculations in a loop
        System.out.println("I'm here");
        System.out.println("I'm here");
        System.out.println("I'm here");

        boolean condition = false;
        // while loop is going to be executed only when condition is true
        // the body of while loop is going to be repeated as many times as condition is true
        while (condition) {
            System.out.println("Java forever");
        }

        int numberOfTrials = 5;
        System.out.println("Current value of numberOfTrials: " + numberOfTrials);
        while (numberOfTrials > 0) {
            System.out.println("I'm working");
            // first right part of the expression is evaluated and is assigned to variable
            numberOfTrials = (numberOfTrials - 1);
            if (numberOfTrials % 2 == 0) { // with 0 at the end prints even numbers, with 1 = odd numbers
                System.out.println("Current value of numberOfTrials: " + numberOfTrials);
                // And for the lady that asked about modulo:  the number of trials % 2 == 1 means if you divide the current (updated) number of trials to 2 and you have a remainder (for example 5/2 = 2 remainder 1) it will display the current (updated) number of trials
                // which will be uneven
            }
        }

        System.out.println("The End.");
    }

}