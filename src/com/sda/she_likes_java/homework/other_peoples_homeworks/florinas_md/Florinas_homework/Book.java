package com.sda.she_likes_java.homework.other_peoples_homeworks.florinas_md.Florinas_homework;

public class Book {

    private String author, title;
    private int yearOfPublication;

    private static int numberOfBooks;

    public Book(String author, String title, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        numberOfBooks++;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public static int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public static void setNumberOfBooks(int numberOfBooks) {
        Book.numberOfBooks = numberOfBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}