package com.sda.she_likes_java.homework.other_peoples_homeworks.mariusz_examples.e20_car_utils;

public class Car {
    /*
    Exercise 20
Create a Car class with a drive() method.
Create 3 subclasses:
- Mazda
- Toyota
- Ferrari
Override the drive() method in each of the subclasses.
In addition, create three unique methods in each subclass.
Create a class CarUtils with method safeCast(Car car)
- inside it, try a safe cast for Mazda and Toyota to call specific methods.
- if the object sent is of a different type - just output the information to the console.
- have fun
     */

    public void drive() {
        System.out.println("Car is driving");
    }
}