package com.sda.she_likes_java.homework.book_lending;

import com.sda.she_likes_java.static_modifier.WashMachine;

public class Random {
    public static void main(String[] args) {
        Book first = new Book("L.Hay", "You can heal your life", 2031);
        Book second = new Book("S.Lazarevs", "Karmas dieagnostika", 2023);
        Book third = new Book("M.Nuton", "The Journey of the Soul", 2029);

        System.out.println("The first book to lend is " + first);
        System.out.println("The second book to lend is " + second);
        System.out.println("The third book to lend is " + third);
        System.out.println("Current amount of books for lending is: " + Book.getNumberOfLentBooks());

    }
}
