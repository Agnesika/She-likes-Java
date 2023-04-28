package com.sda.she_likes_java.objects_equality;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Object> personObjects = new ArrayList();
        List personList = new ArrayList();

        Person me = new Person("Aga", "Mag", 23);
        Person me1 = new Person("Me1", "R", 3);
        Person me2 = new Person("Agnese", "F", 40);
        Person otherOne = new Person("Bongo", "G", 12);
        personList.add(me);
        personList.add(me1);
        personList.add(me2);
        personList.add(otherOne);
        personList.add(new Car("Blue"));

        System.out.println(personList);

        System.out.println("Try to get person out of the list");
        System.out.println("person from list(1): " + personList.get(1));
        Person personFromList = (Person) personList.get(1);
        Object fromPosition0 = personList.get(0);
        System.out.println("age of the person fromPosition0: " + ((Person) fromPosition0).getAge());

        List<Person> betterPersonList = new ArrayList<>();
        betterPersonList.add(me);
        Person fromTheList = betterPersonList.get(0);
        System.out.println("better person from list: " + betterPersonList.get(0));

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("pink"));
//        cars.add(me);
        System.out.println("car colour is: " + cars.get(0).colour);

    }
}
