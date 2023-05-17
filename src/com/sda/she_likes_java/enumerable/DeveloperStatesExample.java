package com.sda.she_likes_java.enumerable;

public class DeveloperStatesExample {
    public static void main(String[] args) {
        System.out.println("Hey, Let's start the day");
        ProgrammersStates myState = ProgrammersStates.NORMAL;
        System.out.println("I'm in " + myState + " state");

        System.out.println("I've got new task. Great!!!");
        myState = ProgrammersStates.GOD_MODE;
        System.out.println("I'm in " + myState + " state");
        System.out.println("after a while I'm really exhausted - stupid task");
        myState = ProgrammersStates.EXHAUSTED;
        System.out.println("I'm in " + myState + " state");
        System.out.println("I feel " + myState.getDescription());

        myState = null;
        System.out.println("Rebooting system :) ");

        String one = "One value";
        String two = one;

        if (one == two) {
            System.out.println("The same object pointed by one and two");
        }

        compareEnums((ProgrammersStates.GOD_MODE));
        System.out.println("Enum methods");
        System.out.println("name: " + ProgrammersStates.GOD_MODE.name());
        System.out.println("ordinal: " + ProgrammersStates.GOD_MODE.ordinal());
        ProgrammersStates[] allStates = ProgrammersStates.values();
        System.out.println("should be NORMAL: " + allStates[0]);
    }

    public static void compareEnums(ProgrammersStates someState) {
        if (someState == ProgrammersStates.GOD_MODE) {
            System.out.println("God mode enabled");
        }
    }
}
