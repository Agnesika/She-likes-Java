package com.sda.she_likes_java.homework.book_lending;

public class Random {
    public static void main(String[] args) {
        Book first = new Book("H.Delimano", "Peaballs with hint of love spice", 2031);
        Book second = new Book("M.Dingy", "Brainy rat race", 2023);
        Book third = new Book("A.Cristan", "How to resolve brains", 2029);

        System.out.println("The first book to lend is " + first);
        System.out.println("The first book to lend is " + second);
        System.out.println("The first book to lend is " + third);

    }
}
