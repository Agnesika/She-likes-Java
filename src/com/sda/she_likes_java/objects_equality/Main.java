package com.sda.she_likes_java.objects_equality;

public class Main {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int c = 5;

        System.out.println("are a and b equal? " + (a == b));
        System.out.println("are a and c equal? " + (a == c));

        String name1 = "Agnese";
        String name2 = "Agnese";
        System.out.println("first == second: " + (name1 == name2));

        String name3 = new String("Agnese");
        String name4 = new String("Agnese");
        System.out.println("first == second: " + (name3 == name4));
        String name5 = name4;
        System.out.println("name5 == name4: " + (name5 == name4));

        Person first = new Person("Anita", "Jur", 39);
        Person second = new Person("Anita", "Jur", 39);
        Person third = second;
        System.out.println("first == second: " + (first == second));
        System.out.println("first is equal to second: " + (first.equals(second)));
        System.out.println("third is equal to second: " + (third.equals(second)));
    }
}
