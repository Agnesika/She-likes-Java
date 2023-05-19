package com.sda.she_likes_java.homework.e26_Events;
/*
 * Create an enumeration class named ImportantEvents.
 * The class should contain the following fields:
 * - Date of the event
 * - Description of the event.
 * Create at least 3 instances of the class to symbolise your important events.
 * Create the class Main and in it:
 * - call the values() method of your class
 * - write out the contents of the created array (dates and description)
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's check my event schedule: ");
        ImportantEvents previousEvent = ImportantEvents.JAVA_TEST;
        System.out.println("My previous event: " + previousEvent);
        System.out.println("I can say that " + previousEvent.getDescription());
        System.out.println("---------------------------");
        ImportantEvents oldEvent = ImportantEvents.GRADUATION;
        System.out.println("My old event: " + oldEvent);
        System.out.println("That's all about: " + oldEvent.getDescription());
        System.out.println("Shall I say that it was too long ago and expired?");
        System.out.println("---------------------------");
        ImportantEvents nextEvent = ImportantEvents.SUMMER_SOLSTICE;
        System.out.println("My next event: " + nextEvent);
        System.out.println("How? " + nextEvent.getDescription());
        System.out.println("---------------------------");
        ImportantEvents lastEvent = ImportantEvents.FUNERAL;
        System.out.println("My last event of my physical life: " + lastEvent);
        System.out.println("Instructions for everyone: " + lastEvent.getDescription());
        System.out.println("---------------------------");
        ImportantEvents eternalEvent = ImportantEvents.BIRTHDAY;
        System.out.println("My eternal event of my physical life: " + eternalEvent);
        System.out.println("What's going to happen? " + eternalEvent.getDescription());
        System.out.println("                            ");
        System.out.println("Enum methods");
        System.out.println("name " + ImportantEvents.GRADUATION.name());
        System.out.println("name " + ImportantEvents.GRADUATION.ordinal());
        ImportantEvents[] allEvents = ImportantEvents.values();
        System.out.println("checking event " + allEvents[0]);
        System.out.println("checking event " + allEvents[1]);
        System.out.println("checking event " + allEvents[2]);
        System.out.println("checking event " + allEvents[3]);
        System.out.println("checking event " + allEvents[4]);


    }
}
