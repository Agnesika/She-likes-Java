package com.sda.she_likes_java.homework.exercise_16;

public class Homework {
    /*
    Exercise 16Create a hierarchy of classes:

    use a separate package: exercise_16
    new Owner class with private fields
    First name
    Surname,
    Animal

class Animal containing the fields

    first name
    age
    breed

Use private variables and create get/set methods
Create a toString() method for each class.
Create a main method and a sample class hierarchy. (edited)
     */

    public static void main(String[] args) {


        Owner maybeMe = new Owner("Agnese", "The Driver", "The Cat");
        Animal Chiepa = new Animal("Chiepa", 5, "Tricolor hunter");
        System.out.println("Some info about me " + maybeMe);
        System.out.println("And some about my dear friend " + Chiepa);

    }
}
