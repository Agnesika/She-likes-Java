package com.sda.she_likes_java.homework.e16_animal_owner;

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


        Owner Agnese = new Owner("Agnese", "The Driver", "Chiepa");
        Owner Grizzly = new Owner("Grizzly", "the Bear", "Chiepa");
        Animal Chiepa = new Animal("Chiepa", 5, "Tricolor hunter");
        System.out.println("Some info about me " + Agnese);
        System.out.println("And some about my dear 4 legged friend " + Chiepa);
        System.out.println("Chiepa doesn't want the owner " + Grizzly);


    }
}
