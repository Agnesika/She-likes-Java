package com.sda.she_likes_java.objects;

public class HouseExample {
    // Draw object graph for every stage from given source code - there are 9 stages there
    public static void main(String[] args) {
        House myHouse = new House(4, 2);
        myHouse.setNumberOfFloors(3);
        System.out.println("I've got new house: " + myHouse);
// Stage 1

        System.out.println("Currently my house has got " + myHouse.getNumberOfRooms() + " rooms");
        System.out.println("I need more rooms...");
        myHouse.setNumberOfRooms(5);
// Stage 2
        System.out.println("Hey, I've got more rooms now...");
        System.out.println("Currently my house has got " + myHouse.getNumberOfRooms() + " rooms");

        System.out.println("===============================");

        HouseOwner wife = new HouseOwner("Mary", myHouse);
// Stage 3
        HouseOwner husband = new HouseOwner("Jack", myHouse);
// Stage 4
        System.out.println("Mary would like to repair her house");
        wife.getHouse().setNumberOfBathrooms(3); // House house = wife.getHouse().setNumberOfBathrooms(3);
        System.out.println("Currently the house looks like this: " + myHouse);
// Stage 5
        husband.getHouse().setNumberOfBathrooms(1);
        System.out.println("Currently the house looks like this: " + myHouse);
// Stage 6
        System.out.println("Mary: " + wife);
        System.out.println("Jack: " + husband);

//        String haha = new House(1,2);
        myHouse = new House(1, 1);
        System.out.println("Now myHouse reference: " + myHouse);
        System.out.println("Mary: " + wife);
        System.out.println("Jack: " + husband);
// Stage 7
        myHouse = new House(10, 10);
        wife.setHouse(myHouse);
// Stage 8
        System.out.println("Mary: " + wife);
        System.out.println("Jack: " + husband);

        wife.setHouse(husband.getHouse());
// Stage 9
    }
}