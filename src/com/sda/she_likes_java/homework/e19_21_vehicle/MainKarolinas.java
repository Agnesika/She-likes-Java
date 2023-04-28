package com.sda.she_likes_java.homework.e19_21_vehicle;

public class MainKarolinas {
    public static void main(String[] args) {
        Vehicle parentVehicle = new Vehicle(); // introducing vehicle
        System.out.println("The vehicle does what...");
        parentVehicle.makeMove(); // accessing parent method
        Vehicle plane = new Plane(); // upcasting
        Plane flyingAirplane = (Plane) plane; //down casting
        flyingAirplane.fly(); // accessing interface method
        System.out.println("\nalso");
        System.out.println(" ");
        Vehicle ship = new Ship(); // upcasting
        Ship floatingShip = (Ship) ship; //down casting
        floatingShip.floating(); // accessing interface method
        Vehicle submarine = new Submarine(); //upcasting
        Submarine divingSubmarine = (Submarine) submarine; //down casting
        divingSubmarine.submerge(); // accessing interface method
    }

    /*
Run: The vehicle does what...
it moves
airplane flies(interface)

also

the ship floats(interface)
submarine dives(interface)

Process finished with exit code 0
     */
}
