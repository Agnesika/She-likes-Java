package com.sda.she_likes_java.homework.book_lending;

import com.sda.she_likes_java.static_modifier.WashMachine;

/*
Exercise 17
Create a Book Lending application
This contains a book class with the following fields
- author
- title
- year of publicationCreate 3 different books at the beginning
and then a random number of them.
To create a random number of objects, use the “Random” class and a loop
that will execute as many times as the nextInt() method returns.
At the very end, write out the number of books created -
use a variable of type “static”.
 */
public class Book {
    private static int numberOfLentBooks;
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
        numberOfLentBooks++;

    }
    public static int getNumberOfLentBooks() {
        return numberOfLentBooks;
    }
    public static void setNumberOfLentBooks(int numberOfLentBooks) {
        Book.numberOfLentBooks = numberOfLentBooks;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}

