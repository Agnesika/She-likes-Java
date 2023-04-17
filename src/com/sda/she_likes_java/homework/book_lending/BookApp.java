package com.sda.she_likes_java.homework.book_lending;

import java.util.Random;

public class BookApp {
    public static void main(String[] args) {
        Book first = new Book("L.Hay", "You can heal your life", 2031);
        Book second = new Book("S.Lazarevs", "Karmas dieagnostika", 2023);
        Book third = new Book("M.Nuton", "The Journey of the Soul", 2029);

        System.out.println("The books available to borrow are:\n" + first + "\n" + second + "\n" + third);

        System.out.println("Current amount of books for lending is: " + Book.getNumberOfLentBooks());

        Random bookGenerator = new Random();
        int howMany = bookGenerator.nextInt(50);
        System.out.println("TMore of the books are coming in: " + howMany);
        for (int i = 0; i <howMany; i++) {
            multiplyThoseBooks();

        }
        System.out.println("Yay! We have gathered so many books to lend. Guess how many?! " + Book.getNumberOfLentBooks());

    }
    public static void multiplyThoseBooks(){
        new Book("J.Kerol", "New book", 1987);
        new Book("M.Terrance", "Love upside down", 1876);
    }
}


