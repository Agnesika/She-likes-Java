package com.sda.she_likes_java.visibility.private_modifier.cars;

public class main {
    public static void main(String[] args) {
        Car funnyCar = new Car();
        // brand is private, so - not visible to outside the class
//        funnyCar.brand
        funnyCar.setBrand("Toyota");
        funnyCar.model = "Corolla";
        funnyCar.color = "pink";
    }
}
