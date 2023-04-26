package com.sda.she_likes_java.homework.exercises_4_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomSortedNumber {
    /*
    Exercise 12
Draw three numbers using the Random.nextInt() function.
Sort them and output them from smallest to largest.
     */


    public static void main(String[] args) {
        Random numberGenerator = new Random();

        int firstNumber = numberGenerator.nextInt();
        System.out.println("Random number provided by java is: " + firstNumber);

        int secondNumber = numberGenerator.nextInt();
        System.out.println("Random number provided by java is: " + secondNumber);

        int thirdNumber = numberGenerator.nextInt();
        System.out.println("Random number provided by java is: " + thirdNumber);


    }

}