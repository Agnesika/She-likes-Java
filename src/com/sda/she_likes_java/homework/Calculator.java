// packages use reverse domain names
package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Calculator {
    /*
    Exercise 8.
Create calculator with 4 supported operations, which is able to read input from user.
     */
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
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int result = firstNumber - secondNumber;
        System.out.println("Subtraction is: " + result);
        System.out.println();


        System.out.println("calculating multiplication of two numbers");
        System.out.println("provide first number");
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int multiplication = firstNumber * secondNumber;
        System.out.println("multiplication is: " + multiplication);


        System.out.println("\ncalculating division of two numbers");
        System.out.println("provide first number");
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        double resultDivision = firstNumber / secondNumber;
        System.out.println("division is: " + resultDivision);

    }
}
