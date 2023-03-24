package com.sda.she_likes_java.homework.parents_class_homework;

import com.sda.she_likes_java.homework.Address;

/*
Exercise 15.
Create a Parent class containing the following variables:
- first name
- surname
- address - (use the class Address)
- firstChild (use class Person)
- secondChild (use class Person)
 */
public class Parents {
    String name;
    String surname;


    public static void main(String[] args) {
        Address otherDepartment = new Address();
        Parents myMother = new Parents();
        Parents myFather = new Parents();
        Person firstKid = new Person();
        Person secondKid = new Person();

        myMother.name = "Primadonna";
        myFather.name = "Braveheart";
        Parents parent = new Parents();
        parent.surname = "Houdini";

        firstKid.oneName = "Elf";
        secondKid.twoName = "Tinkerbell";

        System.out.println("Hello. I would like to introduce you to the first contestants! ");
        System.out.println("This is family of 4 - mother " + myMother.name + ", father " + myFather.name + ".");
        System.out.println("These are their kids - " + firstKid.oneName + " and " + secondKid.twoName + ".");
        System.out.println("And all together they are " + parent.surname + "s");





    }
}






