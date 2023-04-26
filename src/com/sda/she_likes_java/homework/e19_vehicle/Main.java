package com.sda.she_likes_java.homework.e19_vehicle;

public class Main {
    public static void main(String[] args) {


        Vehicle someVehicle = new Vehicle();
        Vehicle Plane = new Vehicle();
        Plane.makeMove();
        Ship ferry = new Ship();
        Plane Boeing = new Plane();

        callVehicle(someVehicle);
        callVehicle(ferry);
        callVehicle(Plane);
        callVehicle(Boeing);

    }

    public static void callVehicle(Vehicle vehicle) {
        vehicle.makeMove();
    }




 }
