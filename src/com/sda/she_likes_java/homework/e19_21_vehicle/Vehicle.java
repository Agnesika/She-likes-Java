package com.sda.she_likes_java.homework.e19_21_vehicle;

public class Vehicle {

    /*
    Exercise 21.
Create Vehicle class containing a move() method
Create three interfaces Floating, Flying, Diving.
Create an Airplane class that extends Vehicle and implements the Flying interface.
Create a class Ship which extends Vehicle and implements the Floating interface.
Create the class Submarine which extends the Vehicle and implements the Diving interface.
Create the class Main which contains the main method and check the operation of the prepared hierarchy of objects.
When do you need to cast between types?
     */
    public void makeMove() {
        System.out.println("Lets float around");
        System.out.println("Lets fly around");
        System.out.println("Lets submerge below");

    }
}
