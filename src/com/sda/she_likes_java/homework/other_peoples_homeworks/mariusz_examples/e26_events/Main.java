package com.sda.she_likes_java.homework.other_peoples_homeworks.mariusz_examples.e26_events;

public class Main {

    public static void main(String[] args) {
        ImportantEvents[] allImportantEvents = ImportantEvents.values();

        for (ImportantEvents event : allImportantEvents) {
            System.out.println("Important event: ");
            System.out.println("\t" + event.getEventDate() + ": " + event.getDescription());
        }
    }
}
