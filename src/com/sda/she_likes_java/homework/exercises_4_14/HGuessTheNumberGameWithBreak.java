package com.sda.she_likes_java.homework.exercises_4_14;

import java.util.Random;
import java.util.Scanner;

public class HGuessTheNumberGameWithBreak {
    /*
    Čau :) man tūliņ izlādēsies tel, bet mēģināšu paskaidrot :grin: tātad pēdējam šērotajam kodam.. spēlei jāizdomā beigas.
    Šobrīd kods ir tāds, kas pasaka, ka skaitlis ir uzminēts pēdējā minēšanas reizē. Bet tā nav.
     */

    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int someRandomNumber = numberGenerator.nextInt(20);
        int numberOfTrials = 8;
//        System.out.println("random number provided by java is: " + someRandomNumber);
        Scanner inputReader = new Scanner(System.in);
        int userAnswer;
        System.out.println("Play game with me:)");
        do {

            System.out.println("Guess a number between 1 and 20");
            userAnswer = inputReader.nextInt();
            numberOfTrials--;
            if (numberOfTrials <= 0) {
                break;
            }

        } while (userAnswer != someRandomNumber);

        if (userAnswer == someRandomNumber) {
            System.out.println("Great, You win!!!");
        } else
            System.out.println("Sorry, you lose");

    }
}