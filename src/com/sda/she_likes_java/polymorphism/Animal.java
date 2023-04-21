package com.sda.she_likes_java.polymorphism;

public class Animal extends Object {
    public void makeSound() {

        System.out.println("Miau");

        //cat = new Dog();
        Object anotherCat = new Cat();
//        anotherCat.makeSound();
        Animal animalCat = new Cat();

        Cat thirdCat = new Cat();
    }


    public void move() {
        System.out.println("Animal is moving");
    }
}
