package com.sda.she_likes_java.classes.constructor;

import org.w3c.dom.ls.LSOutput;

public class FullPerson {
    String name;
    String surname;
    int age;
    FullAddress address;

    public FullPerson() {
    }

    public FullPerson(String name, String surname, int age, FullAddress address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "FullPerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';


    }
public void describeYourself() {
        System.out.println("Hi, I am " + name);
    }
    public static void genericDescription() {
        System.out.println("Generic description");
    }

    public static void main(String[] args) {
        FullAddress address = new FullAddress("Italy", "Roma", "La Curraza", "1162");
        FullPerson person = new FullPerson("Agnese", "Fomrate", 41, address);
        System.out.println("Person is: " + person);

        person.describeYourself();

        FullPerson personWithoutAddress = new FullPerson("Maria", "Kowalska", 34, null);
        personWithoutAddress.describeYourself();

        genericDescription();
    }
}
