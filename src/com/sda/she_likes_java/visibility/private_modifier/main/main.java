package com.sda.she_likes_java.visibility.private_modifier.main;

import com.sda.she_likes_java.visibility.private_modifier.cars.Car;

public class main {
    public static void main(String[] args) {
        Car funnyCar = new Car();
        // brand is private, so - not visible to outside the class
//        funnyCar.brand
        funnyCar.model = "Corolla";

        // cannot see color from outside its class package
//                funnyCar.color = "pink";
    }
}
