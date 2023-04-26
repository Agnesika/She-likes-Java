package com.sda.she_likes_java.homework.e20_car_brands;

public class Toyota extends Car {
    public void whatAreYou() {
        System.out.println("I am Toyota");
    }

    @Override
    public void drive() {
        System.out.println("I drive families in their travels");
    }

    public void whatIConsume() {
        System.out.println("I eat some fuel");
    }
}
