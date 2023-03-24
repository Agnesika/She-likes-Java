package com.sda.she_likes_java.strings;

public class StringsExample {
    public static void main(String[] args) {
        String name = "Agnese";
        String surname = "Fomrate";
        int age = 40;

        // Hi, I am (name) (surname). I am (age) old
        System.out.println("Hi, I am " + name + " " + surname + ". I am " + age + " old");

        String info = " Hi, I'm " + name + " " + surname + ". " + "I am " + age + " years old.";
        System.out.println(info);


        // or some idea from Anete's personal mentor a.k.a. husband😄 >>>
        // %s means String wildcard
        // %d means number wildcard
        String.format(" Hi, I'm %s %s. I am %s years old.", name, surname, age);

        System.out.println("Hi, I am %s %s. I am %d young.".formatted(name, surname, age));
    }
}
