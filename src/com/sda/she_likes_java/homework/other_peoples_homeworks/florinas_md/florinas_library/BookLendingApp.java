package com.sda.she_likes_java.homework.other_peoples_homeworks.florinas_md.florinas_library;

import java.util.Random;
public class BookLendingApp  {

    public static void main(String[] args) {
        Book action = new Book("Rob MacGregor","Indiana Jones", 1991);
        Book romance = new Book("Gabriel Garcia Marquez","Love in times of cholera", 1988);
        Book mystery = new Book("Arthur Conan Doyle","Sherlock Holmes", 1892);

        System.out.println("The books available to borrow are:\n"+action+"\n"+romance+"\n"+mystery);

        Random numberGen = new Random();
        int howMany = numberGen.nextInt(100);
        System.out.println("The random number of books we will generate is: "+howMany);
        for (int i=0;i<howMany;i++){
            createSomeBooks();

        }

        System.out.println("Wow we've made so many books...actually this many: "+Book.getNumberOfBooks());

    }

    public static void createSomeBooks(){
        new Book("author x","title y", 1999);
    }
}