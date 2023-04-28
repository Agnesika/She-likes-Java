package com.sda.she_likes_java.homework.e19_21_vehicle;

public class Main {
    /*
    Exercise 19.
Create a class “Vehicle” with one move() method.
Add a class inheriting from “Vehicle” called “Ship”.
Add another class inheriting from “Vehicle” called “Plane”.
Implement a “move()” method in each class.
     */
    public static void main(String[] args) {


        Vehicle makeMove = new Vehicle();
//        Vehicle Plane = new Vehicle();
//        Plane.makeMove();
        Ship ferry = new Ship();
        Plane Boeing = new Plane();
        Submarine Yellow = new Submarine();

        callVehicle(makeMove);
        callVehicle(ferry);
        callVehicle(Yellow);
        callVehicle(Boeing);


    }

    public static void callVehicle(Vehicle vehicle) {
        vehicle.makeMove();
    }




 }
