// packages use reverse domain names
package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Calculator1 {
    // psvm - not so magic shortcut
    public static void main(String[] args) {
        System.out.println("calculator....");
        System.out.println("calculating sum of two numbers");
        System.out.println("provide first number");
        int firstNumber;
        int secondNumber;
        // TODO: explain object creation
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);
        System.out.println("....................");


        System.out.println("calculating subtraction of two numbers");
        System.out.println("provide first number");
        int thirdNumber;
        int fourthNumber;

        thirdNumber = inputReader.nextInt();
        System.out.println("You provided number: " + thirdNumber);
        System.out.println("Provide second number: ");
        fourthNumber = inputReader.nextInt();
        System.out.println("You provided number: " + fourthNumber);
        int result = thirdNumber - fourthNumber;
        System.out.println("Subtraction is: " + result);





    }
}
