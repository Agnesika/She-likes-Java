package com.sda.she_likes_java.homework.e31_lambda_calculator;

public class Main {

    public static void main(String[] args) {
        Calculator compactVersion = (first, second) -> first + second;
        int sum = compactVersion.addTwoNumbers(1,5);
        System.out.println("Sum of 1 and 5 is " + sum);



    }
}
