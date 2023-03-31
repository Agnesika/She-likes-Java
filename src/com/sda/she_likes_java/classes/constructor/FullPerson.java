package com.sda.she_likes_java.classes.constructor;

import org.w3c.dom.ls.LSOutput;

public class FullPerson {
    private String name;
    private String surname;
    private int age;
    private FullAddress address;

    public FullPerson() {
    }

    public FullPerson(String name, String surname, int age, FullAddress address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public FullAddress getAddress() {
        return address;
    }

    public void setAddress(FullAddress address) {
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
    System.out.println("My surname is " + surname);
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
