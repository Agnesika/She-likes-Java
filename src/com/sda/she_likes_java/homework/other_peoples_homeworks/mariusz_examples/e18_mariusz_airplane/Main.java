package com.sda.she_likes_java.homework.other_peoples_homeworks.mariusz_examples.e18_mariusz_airplane;

public class Main {
    public static void main(String[] args) {
        Airplane myAirplane = new Airplane();
        myAirplane.takeOff();
        myAirplane.takeOff();
        System.out.println("Let’s go to Warsaw");
        myAirplane.flyTo(21, 52);
        myAirplane.land();
        myAirplane.land();
    }
}
