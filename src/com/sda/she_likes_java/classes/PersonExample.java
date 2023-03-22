package com.sda.she_likes_java.classes;

public class PersonExample {
    public static void main(String[] args) {
        System.out.println("Let's use our newly created class Person");

        // number is primitive variable
        int number = 1;
        String name = "Agnese";

        // me is object variable
        // me is a reference to an object
        Person me = new Person();
        me.name = "Agnese";
        Person you = new Person();
        you.name = "Mariusx";

        System.out.println("My name currently is " + me.name);
        System.out.println("Your name currently is " + you.name);

        System.out.println("My surname currently is " + me.surname);

        System.out.println("My age currently is " + me.age);
        System.out.println("My address currently is " + me.address);
    }
}
