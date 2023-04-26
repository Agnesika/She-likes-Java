package com.sda.she_likes_java.homework.other_peoples_homeworks.mariusz_examples.e20_car_utils;

public class CarUtils {

    public static void safeCast(Car car) {
        if (car instanceof Mazda) {
            System.out.println("Is Mazda nice: " + ((Mazda) car).isNice());
        } else if (car instanceof Toyota) {
            System.out.println("Is Toyota safe: " + ((Toyota) car).isSafe());
        } else {
            System.out.println("Different type of car");
        }
    }
}
