package com.sda.she_likes_java.visibility.examples;

public class BetterCar {
    private String brand;
    private String model;
    private String color;

    private int rpm;
    private int currentGear;

    public BetterCar(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        System.out.println();
    }
    // encapsulation - hiding internal state behind the outside user and exposing just the methods
    public void increaseSpeed() {
        currentGear++;
        rpm = currentGear * 100;
    }

}
